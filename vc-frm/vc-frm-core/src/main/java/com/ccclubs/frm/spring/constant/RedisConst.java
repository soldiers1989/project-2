package com.ccclubs.frm.spring.constant;

/**
 * redis常量
 *
 * @author jianghaiyang
 * @create 2018-01-04
 **/
public class RedisConst {
    /**
     * GB实时状态数据
     */
    public static final String REDIS_KEY_RT_STATES_HASH = "RT-STATUS-HASH:GB";
    public static final String REDIS_KEY_RT_STATES_ZSET = "RT-STATUS-ZSET:GB";
    /**
     * V10车型，2017年生产的车辆，累计里程在充电时，存在跳变，实时数据为0时，平台需要矫正，加入最后一次最新里程
     */
    public static final String REDIS_KEY_RT_STATES_CORRECTION_HASH = "RT-STATUS-CORRECTION-HASH:GB";
    /**
     * 指令记录全局ID生成器 csrId
     */
    public static final String REDIS_KEY_CSRID_GEN = "cmd:idgen";
    /**
     * 808指令流水号生成器 csrsId
     */
    public static final String REDIS_KEY_808_CSRSID_GEN = "cmd:sidgen";
    /**
     * 记录终端在线的 redis key 前缀
     */
    public static final String REDIS_KEY_ONLINE = "online:";

    /**
     * 网关记录终端在线的 redis key 前缀
     */
    public static final String REDIS_KEY_TCP_ONLINE = "TCP:ONLINE";

    /**
     * redis建的分隔符
     */
    public static final String REDIS_KEY_SPLIT = ":";

    /**
     * 网关记录终端离线的 redis key 前缀
     */
    public static final String REDIS_KEY_TCP_OFFLINE = "TCP:OFFLINE";

    /**
     * 规则引擎记录最近30条状态数据的 redis key 前缀
     */
    public static final String REDIS_KEY_RECENT_STATES = "RECENT_STATES:";

    /**
     * key:{id} -> key:id
     * @param key
     * @param id
     * @return
     */
    public static final String idKey(String key, String id) {
        return key.replace("{id}", id);
    }
}
