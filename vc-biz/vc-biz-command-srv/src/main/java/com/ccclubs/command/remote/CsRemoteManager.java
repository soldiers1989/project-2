package com.ccclubs.command.remote;

import com.ccclubs.mongo.orm.model.remote.CsRemote;
import com.ccclubs.mongo.service.impl.CsRemoteService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;

/**
 * 同步、异步保存指令记录
 *
 * @author jianghaiyang
 * @create 2018-01-25
 **/
@Component
public class CsRemoteManager {

    @Resource
    CsRemoteService remoteService;

    @Resource(name = "vcThreadPool")
    ExecutorService executorService;

    public void syncSave(CsRemote csRemote) {
        remoteService.save(csRemote);
    }

    public void asyncSave(CsRemote csRemote) {
        executorService.execute(new RemoteSaveTask(csRemote));
    }

    /**
     * 远程指令任务
     */
    class RemoteSaveTask implements Runnable {
        /**
         * 远程控制记录
         */
        private CsRemote csRemote;

        public RemoteSaveTask(CsRemote csRemote) {
            this.csRemote = csRemote;
        }

        @Override
        public void run() {
            // 保存远程控制记录
            remoteService.save(csRemote);
        }
    }


}
