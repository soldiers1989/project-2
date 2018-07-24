package com.ccclubs.quota.testRedisMongo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ccclubs.frm.spring.entity.ApiMessage;
import com.ccclubs.quota.inf.TestInf;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RefreshScope
@RestController
public class test   {

    @Reference(version="1.0.0")
    private  TestInf testInf;




    @RequestMapping(path="/getRedis", method={RequestMethod.POST, RequestMethod.GET})
    ApiMessage<String> getRedis(){
        testInf.getRedis(null);
        return new ApiMessage<String>("");
    }

    @RequestMapping(path="/getMongo", method={RequestMethod.POST, RequestMethod.GET})
    ApiMessage<String> getMongo(){
        testInf.getMongo(null);
        return new ApiMessage<String>("");
    }

}
