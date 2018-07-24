package mongo;

import com.ccclubs.mongo.orm.model.history.CsLogger;
import com.ccclubs.mongo.orm.model.remote.CsRemote;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import read_write_excel.ExcelClass;
import read_write_excel.ReadFromExcel;

import java.util.List;

public class mongoClass {


    @Autowired
    @Qualifier("historyMongoTemplate")
    private MongoTemplate historyMongoTemplate;

    @Autowired
    @Qualifier("remoteMongoTemplate")
    private MongoTemplate remoteMongoTemplate;

    @Test
    public  void Test(){


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
         *             csLogger.setCslNumber(message.getCarNumber());
         *             csLogger.setCslOrder(message.getTransId());
         *             csLogger.setCslLog(logCcclubs_6c.getmLog());
         *             csLogger.setCslData(message.getHexString());
         *             csLogger.setCslAddTime(System.currentTimeMillis());
         *             csLogger.setCslStatus((short) 1);
         *             loggerDao.save(csLogger);
         */

        for(ExcelClass excelClass:excelClassList){
            try{
                String csNumber=excelClass.getNumber();
                //
                Query query = Query.query(Criteria.where("cslNumber").is(csNumber));
                historyMongoTemplate.remove(query,CsLogger.class);
            }catch (Exception e){
                e.printStackTrace();
            }

        }


        /**
         * 根据车机号删除
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
