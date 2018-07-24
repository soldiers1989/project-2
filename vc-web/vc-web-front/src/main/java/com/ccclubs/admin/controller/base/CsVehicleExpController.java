package com.ccclubs.admin.controller.base;


import com.ccclubs.admin.model.CsVehicleExp;
import com.ccclubs.admin.model.ReportParam;
import com.ccclubs.admin.query.CsVehicleExpQuery;
import com.ccclubs.admin.resolver.CsVehicleExpResolver;
import com.ccclubs.admin.service.ICsVehicleExpService;
import com.ccclubs.admin.task.schedulers.StatisticsScheduler;
import com.ccclubs.admin.task.threads.ReportThread;
import com.ccclubs.admin.util.EvManageContext;
import com.ccclubs.admin.vo.TableResult;
import com.ccclubs.admin.vo.VoResult;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * @author jianghaiyang
 * @create 2018-03-02
 **/
@RestController
@RequestMapping("monitor/expVehicle")
public class CsVehicleExpController {
    private static Logger logger = LoggerFactory.getLogger(CsVehicleExpController.class);


    @Autowired
    ICsVehicleExpService csVehicleExpService;


    @Autowired
    ReportThread reportThread;

//    /**
//     * 获取分页列表数据mongo
//     *
//     * @param query
//     * @param page
//     * @param rows
//     * @return
//     */
//    @RequestMapping(value = "list", method = RequestMethod.GET)
//    public TableResult<CsVehicleExp> list(CsVehicleExpQuery query,
//                                          @RequestParam(defaultValue = "0") Integer page,
//                                          @RequestParam(defaultValue = "10") Integer rows,
//                                          @RequestParam(defaultValue = "csvAddTime") String order) {
//        PageInfo<CsVehicleExp> pageResult = csVehicleExpService.getPage(query, new PageRequest(page, rows, new Sort(Sort.Direction.DESC, order)));
//        List<CsVehicleExp> list = pageResult.getList();
//        for (CsVehicleExp data : list) {
//            registResolvers(data);
//        }
//        TableResult<CsVehicleExp> tableResult = new TableResult<>(page, rows, pageResult);
//        return tableResult;
//    }
//
//

    /**
     * 获取分页列表数据-数据库
     *
     * @param query
     * @param page
     * @param rows
     * @return
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public TableResult<CsVehicleExp> list(CsVehicleExpQuery query,
                                          @RequestParam(defaultValue = "0") Integer page,
                                          @RequestParam(defaultValue = "10") Integer rows,
                                          @RequestParam(defaultValue = "csveAddTime") String order) {
        PageInfo<CsVehicleExp> pageResult = csVehicleExpService.getPage(query.getCriteria(), page, rows);
        List<CsVehicleExp> list = pageResult.getList();
        for (CsVehicleExp data : list) {
            registResolvers(data);
        }
        TableResult<CsVehicleExp> tableResult = new TableResult<>(page, rows, pageResult);
        return tableResult;
    }


    /**
     * 根据文本检索车辆历史状态信息并导出。
     */
    @RequestMapping(value = "report", method = RequestMethod.POST)
    public VoResult<String> getReport(@RequestBody ReportParam<CsVehicleExpQuery> reportParam) {
        List<CsVehicleExp> list = csVehicleExpService.getAll();
        for (CsVehicleExp data : list) {
            registResolvers(data);
        }
        String uuid = UUID.randomUUID().toString();
        reportThread.setBaseName("Vehicle_Exp");
        reportThread.setList(list);
        reportThread.setUserUuid(uuid);
        reportThread.setReportParam(reportParam);
        logger.info("start running report VehicleExp thread.");
        EvManageContext.getThreadPool().execute(reportThread);

        VoResult<String> r = new VoResult<>();
        r.setSuccess(true).setMessage("导出任务已经开始执行，请稍候。");
        r.setValue(uuid);
        return r;
    }

    @Resource
    StatisticsScheduler statisticsScheduler;

    /**
     * 手动触发清理mongo数据。
     */
    @RequestMapping(value = "trigger/clean", method = RequestMethod.GET)
    public String triggerClean() {
        statisticsScheduler.expDataCleanJob();
        return "已触发清理";
    }

    /**
     * 手动触发巡检。
     */
    @RequestMapping(value = "trigger/check", method = RequestMethod.GET)
    public String triggerCheck() {
        statisticsScheduler.expDataCheckJob();
        return "已触发巡检";
    }

    /**
     * 手动触发导出。
     */
    @RequestMapping(value = "trigger/export", method = RequestMethod.GET)
    public String triggerExport() {
        statisticsScheduler.expDataExportJob();
        return "已触发导出";
    }

    /**
     * 注册属性内容解析器
     */
    void registResolvers(CsVehicleExp data) {
        if (data != null) {
            data.registResolver(com.ccclubs.admin.resolver.CsVehicleExpResolver.终端类型.getResolver());
        }
    }

}
