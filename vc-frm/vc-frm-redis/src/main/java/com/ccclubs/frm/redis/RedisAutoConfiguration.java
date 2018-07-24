package com.ccclubs.frm.redis;

import com.ccclubs.frm.redis.serializer.HessianSerializer;
import com.ccclubs.frm.redis.serializer.MyRedisSerializer;
import com.ccclubs.frm.redis.old.MyStringRedisTemplate;
import org.apache.commons.pool2.impl.GenericObjectPool;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.data.redis.RedisProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisClusterConfiguration;
import org.springframework.data.redis.connection.RedisNode;
import org.springframework.data.redis.connection.RedisSentinelConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPoolConfig;

@EnableCaching
@ConditionalOnClass({JedisConnection.class, RedisOperations.class, Jedis.class})
@EnableConfigurationProperties(RedisProperties.class)
public class RedisAutoConfiguration extends CachingConfigurerSupport {

    /**
     * Redis connection configuration.
     */
    @Configuration
    @ConditionalOnClass(GenericObjectPool.class)
    protected static class RedisConnectionConfiguration {

        private final RedisProperties properties;

        private final RedisSentinelConfiguration sentinelConfiguration;

        private final RedisClusterConfiguration clusterConfiguration;

        public RedisConnectionConfiguration(RedisProperties properties,
                                            ObjectProvider<RedisSentinelConfiguration> sentinelConfigurationProvider,
                                            ObjectProvider<RedisClusterConfiguration> clusterConfigurationProvider) {
            this.properties = properties;
            this.sentinelConfiguration = sentinelConfigurationProvider.getIfAvailable();
            this.clusterConfiguration = clusterConfigurationProvider.getIfAvailable();
        }

        @Bean(name = "ttpRedisConnectionFactory")
        @Primary
        public JedisConnectionFactory voiceRedisConnectionFactory() throws UnknownHostException {
            return applyProperties(createJedisConnectionFactory());
        }

        protected final JedisConnectionFactory applyProperties(JedisConnectionFactory factory) {
            factory.setHostName(this.properties.getHost());
            factory.setPort(this.properties.getPort());
            if (this.properties.getPassword() != null) {
                factory.setPassword(this.properties.getPassword());
            }
            factory.setDatabase(this.properties.getDatabase());
            if (this.properties.getTimeout() > 0) {
                factory.setTimeout(this.properties.getTimeout());
            }
            return factory;
        }

        protected final RedisSentinelConfiguration getSentinelConfig() {

            RedisProperties.Sentinel sentinelProperties = this.properties.getSentinel();

            // 判断是否已添加集群配置信息
            if (this.sentinelConfiguration != null) {

                // 取得master节点
                RedisNode master = (RedisNode) this.sentinelConfiguration.getMaster();

                // master节点存在，并且是配置的master节点，则使用该配置
                if (master != null && StringUtils.hasText(master.getHost())
                        && master.getHost().equals(sentinelProperties.getMaster())) {

                    return this.sentinelConfiguration;

                }
            }

            if (sentinelProperties != null && StringUtils.hasText(sentinelProperties.getMaster())) {
                RedisSentinelConfiguration config = new RedisSentinelConfiguration();
                config.master(sentinelProperties.getMaster());
                config.setSentinels(createSentinels(sentinelProperties));
                return config;
            }
            return null;
        }

        /**
         * Create a {@link RedisClusterConfiguration} if necessary.
         *
         * @return {@literal null} if no cluster settings are set.
         */
        protected final RedisClusterConfiguration getClusterConfiguration() {
            if (this.clusterConfiguration != null) {
                return this.clusterConfiguration;
            }
            if (this.properties.getCluster() == null) {
                return null;
            }
            RedisProperties.Cluster clusterProperties = this.properties.getCluster();
            RedisClusterConfiguration config = new RedisClusterConfiguration(clusterProperties.getNodes());

            if (clusterProperties.getMaxRedirects() != null) {
                config.setMaxRedirects(clusterProperties.getMaxRedirects());
            }
            return config;
        }

        private List<RedisNode> createSentinels(RedisProperties.Sentinel sentinel) {
            List<RedisNode> nodes = new ArrayList<RedisNode>();
            for (String node : StringUtils.commaDelimitedListToStringArray(sentinel.getNodes())) {
                try {
                    String[] parts = StringUtils.split(node, ":");
                    Assert.state(parts.length == 2, "Must be defined as 'host:port'");
                    nodes.add(new RedisNode(parts[0], Integer.valueOf(parts[1])));
                } catch (RuntimeException ex) {
                    throw new IllegalStateException("Invalid redis sentinel " + "property '" + node + "'", ex);
                }
            }
            return nodes;
        }

        private JedisConnectionFactory createJedisConnectionFactory() {
            JedisPoolConfig poolConfig = this.properties.getPool() != null ? jedisPoolConfig() : new JedisPoolConfig();

            if (getSentinelConfig() != null) {
                return new JedisConnectionFactory(getSentinelConfig(), poolConfig);
            }
            if (getClusterConfiguration() != null) {
                return new JedisConnectionFactory(getClusterConfiguration(), poolConfig);
            }
            return new JedisConnectionFactory(poolConfig);
        }

        private JedisPoolConfig jedisPoolConfig() {
            JedisPoolConfig config = new JedisPoolConfig();
            RedisProperties.Pool props = this.properties.getPool();
            config.setMaxTotal(props.getMaxActive());
            config.setMaxIdle(props.getMaxIdle());
            config.setMinIdle(props.getMinIdle());
            config.setMaxWaitMillis(props.getMaxWait());
            return config;
        }

    }


    @Bean(name = "ttpRedisTemplate")
    @Qualifier(value = "ttpRedisConnectionFactory")
    public StringRedisTemplate ttpRedisTemplate(JedisConnectionFactory connectionFactory) {

        StringRedisTemplate redisTemplate = new StringRedisTemplate(connectionFactory);

        // 设置序列化类
        GenericJackson2JsonRedisSerializer jackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);

        redisTemplate.afterPropertiesSet();

        return redisTemplate;

    }

    @Bean(name = "myRedisTemplate")
    @Qualifier(value = "ttpRedisConnectionFactory")
    public MyStringRedisTemplate myRedisTemplate(JedisConnectionFactory connectionFactory) {

        MyStringRedisTemplate redisTemplate = new MyStringRedisTemplate(connectionFactory);

        // 设置老系统redis序列化
        MyRedisSerializer stringRedisSerializer = new MyRedisSerializer();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(stringRedisSerializer);

        redisTemplate.afterPropertiesSet();

        return redisTemplate;

    }

    @Primary
    @Bean(name = "redisTemplate")
    @Qualifier(value = "ttpRedisConnectionFactory")
    public RedisTemplate redisTemplate(JedisConnectionFactory connectionFactory) {

        RedisTemplate redisTemplate = new RedisTemplate();
        redisTemplate.setConnectionFactory(connectionFactory);
        // 设置序列化类
        GenericJackson2JsonRedisSerializer jackson2JsonRedisSerializer = new GenericJackson2JsonRedisSerializer();
//        HessianSerializer hessianSerializer = new HessianSerializer();
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.setHashValueSerializer(jackson2JsonRedisSerializer);
        redisTemplate.afterPropertiesSet();

        return redisTemplate;

    }

    @Bean
    public KeyGenerator wiselyKeyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object target, Method method, Object... params) {
                StringBuilder sb = new StringBuilder();
                sb.append(target.getClass().getName());
                sb.append(method.getName());
                for (Object obj : params) {
                    sb.append(obj.toString());
                }
                return sb.toString();
            }
        };

    }

    @SuppressWarnings("rawtypes")
    @Bean
    @Primary
    public CacheManager cacheManager(RedisTemplate redisTemplate) {

        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        // 使用自定义key名
        cacheManager.setUsePrefix(true);

        return cacheManager;
    }


    /**
     * Access缓存管理（0分钟过期）
     *
     * @param redisTemplate
     * @return
     */
    @SuppressWarnings("rawtypes")
    @Bean(name = "cacheManagerAccess")
    public CacheManager cacheManagerAccess(RedisTemplate redisTemplate) {

        RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
        // 使用自定义key名
        cacheManager.setUsePrefix(true);
        // 30分钟过期
        cacheManager.setDefaultExpiration(60000);

        return cacheManager;
    }

}