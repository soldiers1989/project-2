package com.ccclubs.admin.controller.gb;

import com.ccclubs.admin.service.IGbCsStateService;
import com.ccclubs.admin.vo.TableResult;
import com.ccclubs.admin.vo.VoResult;
import com.ccclubs.frm.spring.constant.RedisConst;
import com.ccclubs.protocol.dto.gb.GBMessage;
import com.ccclubs.protocol.util.StringUtils;
import com.ccclubs.protocol.util.Tools;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * 车辆实时监控（国标协议）
 *
 * @author jianghaiyang
 * @create 2018-01-04
 **/
@RestController
@RequestMapping("monitor/gbState")
public class GbCsStateController {

    @Autowired
    IGbCsStateService igbCsStateService;

    /**
     * 获取分页列表数据
     */
    @RequestMapping(value = "list", method = RequestMethod.GET)
    public TableResult<GBMessage> list(String vin, @RequestParam(defaultValue = "1") Integer page,
                                       @RequestParam(defaultValue = "10") Integer rows) {
        PageInfo<GBMessage> pageInfo = igbCsStateService.getPage(vin, page, rows);
        TableResult<GBMessage> r = new TableResult<>(pageInfo);
        return r;
    }

    /**
     * 获取分页列表数据
     */
    @RequestMapping(value = "transfer", method = RequestMethod.GET)
    public VoResult<GBMessage> transfer(@RequestParam("hexString") String hexString) {
        VoResult<GBMessage> r = new VoResult<>();
        if (StringUtils.empty(hexString)) {
            r.setSuccess(false).setMessage("原始报文不对");
            r.setValue(null);
        } else {
            try {
                GBMessage gbMessage = new GBMessage();
                gbMessage.ReadFromBytes(Tools.HexString2Bytes(hexString));
                if (StringUtils.empty(gbMessage.getErrorMessage())) {
                    if (gbMessage.getHeader().getMessageType() == 0x02
                            || gbMessage.getHeader().getMessageType() == 0x03) {
                        r.setSuccess(true);
                        r.setValue(gbMessage);
                    } else {
                        r.setSuccess(false).setMessage("原始报文非实时数据");
                        r.setValue(null);
                    }
                } else {
                    r.setSuccess(false).setMessage("原始报文解析错误");
                    r.setValue(null);
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                r.setSuccess(false).setMessage("原始报文解析错误");
                r.setValue(null);
            }
        }
        return r;
    }

    /**
     * 获取分页列表数据
     */
    @RequestMapping(value = "detail/{vin}", method = RequestMethod.GET)
    public VoResult<GBMessage> detail(@PathVariable("vin") String vin) {
        GBMessage gbMessage = igbCsStateService.detail(vin);
        VoResult<GBMessage> r = new VoResult<>();
        if (null == gbMessage) {
            r.setSuccess(false).setMessage("该车辆暂无数据");
            r.setValue(null);
        } else {
            r.setSuccess(true);
            r.setValue(gbMessage);
        }
        return r;
    }
//   @Autowired
//    RedisTemplate redisTemplate;
//
//    @RequestMapping(value = "set", method = RequestMethod.GET)
//    public String set() {
//        redisTemplate.opsForHash()
//                .put(RedisConst.REDIS_KEY_RT_STATES_HASH, "LJ8M3A5M9GB002366", "232302FE4C4A38453343314D314742303039303630010025120206173B38010203010000000042460CBD271737010F03D30000050106B3716402102A5631");
//        redisTemplate.opsForZSet().add(RedisConst.REDIS_KEY_RT_STATES_ZSET, "LJ8M3A5M9GB002366", 1518075475002L);
//        return "123";
//    }

//    /**
//     * For Test
//     * 取得redis中GB RT数据
//     *
//     * @param key 秘钥
//     * @return
//     */
//    @RequestMapping(value = "getAllGBRTData", method = RequestMethod.GET)
//    public List<JSONObject> getAllGBRTData(String key) {
//        if (org.apache.commons.lang3.StringUtils.isEmpty(key) || !key.equals("kevin")) {
//            throw new ApiException(ApiEnum.FAIL.code(), "接口秘钥错误！");
//        }
//        Set<String> set = redisTemplate.opsForZSet()
//                .rangeByScore(RedisConst.REDIS_KEY_RT_STATES_ZSET, -1, Long.MAX_VALUE);
//        JSONObject jsonObject;
//        List<JSONObject> records = new ArrayList<>();
//        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
//            jsonObject = new JSONObject();
//            String vin = iterator.next();
//            String message = (String) redisTemplate.opsForHash()
//                    .get(RedisConst.REDIS_KEY_RT_STATES_HASH, vin);
//            jsonObject.put("vin", vin);
//            jsonObject.put("message", message);
//            records.add(jsonObject);
//        }
//        return records;
//    }

}
