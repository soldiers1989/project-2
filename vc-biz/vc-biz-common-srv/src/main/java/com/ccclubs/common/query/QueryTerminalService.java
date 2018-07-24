package com.ccclubs.common.query;

import com.ccclubs.frm.cache.CacheConstants;
import com.ccclubs.pub.orm.mapper.CsMachineMapper;
import com.ccclubs.pub.orm.mapper.CsTerminalMapper;
import com.ccclubs.pub.orm.model.CsMachine;
import com.ccclubs.pub.orm.model.CsMachineExample;
import com.ccclubs.pub.orm.model.CsTerminal;
import com.ccclubs.pub.orm.model.CsTerminalExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jarvis.cache.annotation.Cache;
import com.jarvis.cache.annotation.ExCache;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 查询终端
 *
 * @author jianghaiyang
 * @create 2017-07-11
 **/
@Component
public class QueryTerminalService {

  @Resource
  CsMachineMapper mdao;

  @Resource
  CsTerminalMapper tdao;

  /**
   * 通过车机{@link CsMachine}终端序列号查询终端
   *
   * @param teNo 终端序列号
   * @return CsMachine
   */
  @Cache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmTeNo:'+#args[0]", autoload = true, exCache = {
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmNumber:'+#retVal.csmNumber", condition = "!#empty(#retVal) && !#empty(#retVal.csmNumber)"),
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmMobile:'+#retVal.csmMobile", condition = "!#empty(#retVal) && !#empty(#retVal.csmMobile)"),
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmId:'+#retVal.csmId", condition = "!#empty(#retVal)")})
  public CsMachine queryCsMachineByTeNoFromCache(String teNo) {
    return queryCsMachineByTeNo(teNo);
  }

  public CsMachine queryCsMachineByTeNo(String teNo) {
    CsMachineExample example = new CsMachineExample();
    CsMachineExample.Criteria criteria = example.createCriteria();
    criteria.andCsmTeNoEqualTo(teNo);
    List<CsMachine> list = mdao.selectByExample(example);
    if (list.size() > 0) {
      return list.get(0);
    }
    return null;
  }

  /**
   * 通过车机{@link CsMachine} 手机号查询终端
   *
   * @param simNo 11位手机号
   * @return CsMachine
   */
  @Cache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmMobile:'+#args[0]", autoload = true, exCache = {
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmNumber:'+#retVal.csmNumber", condition = "!#empty(#retVal) && !#empty(#retVal.csmNumber)"),
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmTeNo:'+#retVal.csmTeNo", condition = "!#empty(#retVal) && !#empty(#retVal.csmTeNo)"),
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmId:'+#retVal.csmId", condition = "!#empty(#retVal)")})
  public CsMachine queryCsMachineBySimNo(String simNo) {
    CsMachineExample machineExample = new CsMachineExample();
    CsMachineExample.Criteria machineCriteria = machineExample.createCriteria();
    machineCriteria.andCsmMobileEqualTo(simNo);
    List<CsMachine> list = mdao.selectByExample(machineExample);
    if (list.size() > 0) {
      return list.get(0);
    }
    return null;
  }

  /**
   * 通过车机{@link CsMachine} 车机号查询终端
   *
   * @param carNumber 车机号
   * @return CsMachine
   */
  @Cache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmNumber:'+#args[0]", autoload = true, exCache = {
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmTeNo:'+#retVal.csmTeNo", condition = "!#empty(#retVal) && !#empty(#retVal.csmTeNo)"),
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmMobile:'+#retVal.csmMobile", condition = "!#empty(#retVal) && !#empty(#retVal.csmMobile)"),
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmId:'+#retVal.csmId", condition = "!#empty(#retVal)")})
  public CsMachine queryCsMachineByCarNumber(String carNumber) {
    CsMachineExample machineExample = new CsMachineExample();
    CsMachineExample.Criteria machineCriteria = machineExample.createCriteria();
    machineCriteria.andCsmNumberEqualTo(carNumber);
    List<CsMachine> list = mdao.selectByExample(machineExample);
    if (list.size() > 0) {
      return list.get(0);
    }

    return null;
  }

  /**
   * 通过车机{@link CsMachine} id 主键查询终端
   *
   * @param id 主键id
   * @return CsMachine
   */
  @Cache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmId:'+#args[0]", autoload = true, exCache = {
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmNumber:'+#retVal.csmNumber", condition = "!#empty(#retVal) && !#empty(#retVal.csmNumber)"),
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmMobile:'+#retVal.csmMobile", condition = "!#empty(#retVal) && !#empty(#retVal.csmMobile)"),
      @ExCache(expire = CacheConstants.NORMAL_EXPIRE, key = "'CsMachine:csmTeNo:'+#retVal.csmTeNo", condition = "!#empty(#retVal) && !#empty(#retVal.csmTeNo)")})
  public CsMachine queryCsMachineByIdFromCache(Integer id) {
    return queryCsMachineById(id);
  }

  public CsMachine queryCsMachineById(Integer id) {
    CsMachine machine = mdao.selectByPrimaryKey(id);
    return machine;
  }

  /**
   * 通过T-Box序列号或手机号查询CsMachine列表
   */
  public List<CsMachine> searchCsMachineFuzzyByTenoOrMobile(Integer appId, String teNoOrMobileKey) {
    CsMachineExample machineExample = new CsMachineExample();
    CsMachineExample.Criteria machineCriteriaTeNo = machineExample.createCriteria();
    machineCriteriaTeNo.andCsmAccessEqualTo(appId);
    machineCriteriaTeNo.andCsmTeNoLike("%" + teNoOrMobileKey + "%");

    CsMachineExample.Criteria machineCriteriaMobile = machineExample.createCriteria();
    machineCriteriaMobile.andCsmAccessEqualTo(appId);
    machineCriteriaMobile.andCsmMobileLike("%" + teNoOrMobileKey + "%");

    machineExample.or(machineCriteriaMobile);

    PageHelper.startPage(1, 10);
    List<CsMachine> list = mdao.selectByExample(machineExample);
    PageInfo<CsMachine> pinfo = new PageInfo<>(list);

    return pinfo.getList();
  }


  /**
   * 通过终端{@link CsTerminal}终端序列号查询终端
   *
   * @param cstIdd 终端序列号
   */
  public CsTerminal queryCsTerminalByCstIdd(String cstIdd) {

    CsTerminalExample terminalExample = new CsTerminalExample();
    CsTerminalExample.Criteria terminalCriteria = terminalExample.createCriteria();
    terminalCriteria.andCstIddEqualTo(cstIdd);
    List<CsTerminal> list = tdao.selectByExample(terminalExample);
    if (list.size() > 0) {
      return list.get(0);
    }
    return null;
  }
}
