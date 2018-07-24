package redis;

import com.ccclubs.frm.spring.constant.RedisConst;
import com.ccclubs.protocol.util.ConstantUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import read_write_excel.ExcelClass;
import read_write_excel.ReadFromExcel;

import java.util.ArrayList;
import java.util.List;

import static com.ccclubs.frm.spring.constant.RedisConst.REDIS_KEY_TCP_OFFLINE;
import static com.ccclubs.frm.spring.constant.RedisConst.REDIS_KEY_TCP_ONLINE;

public class redisClass {

    @Autowired
    RedisTemplate redisTemplate;


    @Test
    public  void test() {


        List<ExcelClass> excelClassList=null;
        String path = "D:\\chang_an_vehicle.xls";
        try{
            excelClassList=ReadFromExcel.readFromExcel(path,0);

        }catch (Exception e){
            e.printStackTrace();
        }


        //从文件中获取车辆vin  //vc-biz-rule-engine-srv
        for(ExcelClass excelClass :excelClassList){
            String vin=excelClass.getVin();
            String mobile=excelClass.getMobile();
            //=1
            if(redisTemplate.opsForHash().hasKey(REDIS_KEY_TCP_ONLINE, vin)){
                redisTemplate.opsForHash().delete(REDIS_KEY_TCP_ONLINE, vin);
            }
             //=2
            if(redisTemplate.opsForHash().hasKey(REDIS_KEY_TCP_ONLINE, vin)){
                redisTemplate.opsForHash().delete(REDIS_KEY_TCP_OFFLINE, vin);
            }

            //=3
            /**
             *  // GB实时状态数据存入redis
             *         if (message.getMessageType() == GBMessageType.GB_MSG_TYPE_0X02) {
             *             redisTemplate.opsForHash()
             *                     .put(RedisConst.REDIS_KEY_RT_STATES_HASH, message.getVin(), message.getPacketDescr());
             *             redisTemplate.opsForZSet().add(RedisConst.REDIS_KEY_RT_STATES_ZSET, message.getVin(),
             *                     DateTimeUtil
             *                             .date2UnixFormat(message.getMessageContents().getTime(), DateTimeUtil.UNIX_FORMAT));
             *         }
             */
            if (redisTemplate.opsForHash().hasKey(RedisConst.REDIS_KEY_RT_STATES_HASH, vin)) {
                redisTemplate.opsForHash().delete(RedisConst.REDIS_KEY_RT_STATES_HASH,vin);
                //
                redisTemplate.opsForZSet().remove(RedisConst.REDIS_KEY_RT_STATES_ZSET,vin);
            }
            /**
             * 3
             *  if (GBMessageType.GB_MSG_TYPE_0X02 == message.getMessageType()) {
             *                     redisTemplate.opsForHash()
             *                             .put(RedisConst.REDIS_KEY_RT_STATES_CORRECTION_HASH, message.getVin(), gb_02_01.getMileage());
             *                 }
             */
            if( redisTemplate.opsForHash().hasKey(RedisConst.REDIS_KEY_RT_STATES_CORRECTION_HASH,vin)){
                redisTemplate.opsForHash().delete(RedisConst.REDIS_KEY_RT_STATES_CORRECTION_HASH,vin);
            }

            /**
             *  ValueOperations valueOperations = redisTemplate.opsForValue();
             *         valueOperations.set(AssembleHelper.getKey(RuleEngineConstant.REDIS_KEY_CMD_REMOTE, keyPart),
             *                 value,
             *                 RuleEngineConstant.RENOTE_EXPIRE, TimeUnit.SECONDS);
             */

//            redisTemplate.hasKey(AssembleHelper.getKey(RuleEngineConstant.REDIS_KEY_CMD_REMOTE, keyPart))


            /**
             *
             * 808
             *
             *  // 记录终端在线情况
             *       redisTemplate.opsForValue().set(ConstantUtils.ONLINE_REDIS_PRE + tm.getSimNo(),
             *           new OnlineConnection(tm.getSimNo(), clientIP, environmentUtils.getCurrentIp(),
             *               System.currentTimeMillis()),
             *           ConstantUtils.ONLINE_IDE_TIME, TimeUnit.MILLISECONDS);
             *       // 上行数据
             *       logger.info("UP >> {}{}", tm.getPacketDescr(), clientIP);
             */
            //根据手机号删除

            if(mobile!=null){
                if(redisTemplate.hasKey(ConstantUtils.ONLINE_REDIS_PRE +mobile)){
                    redisTemplate.delete(ConstantUtils.ONLINE_REDIS_PRE +mobile);
                }
            }

            /**
             * command-srv
             */
            if(redisTemplate.opsForHash().hasKey(REDIS_KEY_TCP_ONLINE, vin)){
                redisTemplate.opsForHash().delete(REDIS_KEY_TCP_ONLINE, vin);

            }
        }

    }
}
