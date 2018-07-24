package com.ccclubs.gateway.common.service;

import com.alibaba.fastjson.JSON;
import com.ccclubs.gateway.common.config.KafkaProperties;
import com.ccclubs.gateway.common.dto.KafkaTask;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

/**
 * @Author: yeanzi
 * @Date: 2018/5/22
 * @Time: 13:57
 * Email:  yeanzhi@ccclubs.com
 * 卡夫卡服务
 */
@Service
public class KafkaService {
    private static final Logger LOG = LoggerFactory.getLogger(KafkaService.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private KafkaProperties kafkaProperties;

    /**
     * kafka发送任务
     * @param task
     * @return
     */
    public ListenableFuture<SendResult> send(KafkaTask task) {
        // 发送至kafka
        String topic = null;
        switch (task.getTopic()) {
            case SUCCESS:
                topic = kafkaProperties.getSuccess();
                break;
            case ERROR:
                topic = kafkaProperties.getError();
                break;
            case CONN:
                topic = kafkaProperties.getConn();
                break;
            case OVERSEE:
                topic = kafkaProperties.getOversee();
                break;
                default:
                    LOG.error("发现无效的topic: [{}]", task.getTopic());
                    break;
        }
        // 目前只管发送，没有失败重发
        ListenableFuture<SendResult> sendResult = kafkaTemplate.send(topic, task.getKey(), task.getBody());
        if (LOG.isDebugEnabled()) {
            LOG.debug("[{}]发送kafka消息完成,msg=[{}]", task.getKey(), JSON.toJSONString(task));
        }
        return sendResult;
    }

}
