package com.ccclubs.quota.TestInf.redis;

import com.alibaba.dubbo.config.annotation.Service;
import com.ccclubs.frm.spring.constant.RedisConst;
import com.ccclubs.mongo.orm.model.history.CsLogger;
import com.ccclubs.mongo.orm.model.remote.CsRemote;
import com.ccclubs.protocol.util.ConstantUtils;
import com.ccclubs.quota.TestInf.read_write_excel.ExcelClass;
import com.ccclubs.quota.TestInf.read_write_excel.ReadFromExcel;
import com.ccclubs.quota.inf.TestInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Date;
import java.util.List;

import static com.ccclubs.frm.spring.constant.RedisConst.REDIS_KEY_TCP_OFFLINE;
import static com.ccclubs.frm.spring.constant.RedisConst.REDIS_KEY_TCP_ONLINE;

@Service(version = "1.0.0")
public class redisClass implements TestInf {

    @Autowired
    RedisTemplate redisTemplate;


    @Autowired
    @Qualifier("historyMongoTemplate")
    private MongoTemplate historyMongoTemplate;

    @Autowired
    @Qualifier("remoteMongoTemplate")
    private MongoTemplate remoteMongoTemplate;

    @Override
    public void getRedis(String pathlkl) {
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
            String csNumger=excelClass.getNumber();
            //=1
            if(redisTemplate.opsForHash().hasKey(REDIS_KEY_TCP_ONLINE, vin)){
                redisTemplate.opsForHash().delete(REDIS_KEY_TCP_ONLINE, vin);
            }
            //=2
            if(redisTemplate.opsForHash().hasKey(REDIS_KEY_TCP_ONLINE, vin)){
                redisTemplate.opsForHash().delete(REDIS_KEY_TCP_OFFLINE, vin);
            }

            //=3
//            if (redisTemplate.opsForHash().hasKey(RedisConst.REDIS_KEY_RT_STATES_HASH, vin)) {
//                redisTemplate.opsForHash().delete(RedisConst.REDIS_KEY_RT_STATES_HASH,vin);
//                //
//                redisTemplate.opsForZSet().remove(RedisConst.REDIS_KEY_RT_STATES_ZSET,vin);
//            }
            /**
             * 3

//             */
//            if( redisTemplate.opsForHash().hasKey(RedisConst.REDIS_KEY_RT_STATES_CORRECTION_HASH,vin)){
//                redisTemplate.opsForHash().delete(RedisConst.REDIS_KEY_RT_STATES_CORRECTION_HASH,vin);
//            }

            /**
             * 808
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

            //老接口redis,TerminalUtils.getMapping
            /**
             * 终端手机号
             * (MachineMapping) myRedisTemplate.opsForValue()
             *                 .get("OBJ.MachineMapping." + keyPart);
             */
            if(redisTemplate.hasKey("OBJ.MachineMapping." + vin)){
                redisTemplate.delete("OBJ.MachineMapping." + vin);
            }
            if(redisTemplate.hasKey("OBJ.MachineMapping." + mobile)){
                redisTemplate.delete("OBJ.MachineMapping." + mobile);
            }
            //8位长度的车机号
            if(redisTemplate.hasKey("OBJ.MachineMapping." + csNumger)){
                redisTemplate.delete("OBJ.MachineMapping." + csNumger);
            }
            //
        }

    }

    @Override
    public void getMongo(String pathlkl) {


        List<ExcelClass> excelClassList=null;
        String path = "D:\\chang_an_vehicle.xls";
        try{
            excelClassList=ReadFromExcel.readFromExcel(path,0);

        }catch (Exception e){
            e.printStackTrace();
        }


        //查询出符合条件的所有结果，并将符合条件的所有数据删除
        /**
         *  CsLogger csLogger = new CsLogger();
         *             loggerDao.save(csLogger);
         */
        for(ExcelClass excelClass:excelClassList){
            try{

                String csNumber=excelClass.getNumber();
                //cslNumber
                Query query = Query.query(Criteria.where("cslNumber").is(csNumber));
                historyMongoTemplate.remove(query,CsLogger.class);
            }catch (Exception e){
                e.printStackTrace();
            }

        }


        /**
         * 根据车机号删除
         * vcloud_db
         *CsRemote
         *
         public void save(CsRemote remote) {
         remoteMongoTemplate.insert(remote);
         }
         */
        for(ExcelClass excelClass:excelClassList){
            String csNumber=excelClass.getNumber();
            //
            Query query = Query.query(Criteria.where("csrNumber").is(csNumber));
            remoteMongoTemplate.remove(query,CsRemote.class);

        }
    }




}
