package com.ccclubs.admin.metadata;

import com.ccclubs.admin.AppContext;
import com.ccclubs.admin.entity.CsMachineCrieria;
import com.ccclubs.admin.entity.SrvDictCrieria;
import com.ccclubs.admin.model.*;
import com.ccclubs.admin.service.*;
import java.util.List;

import com.ccclubs.frm.spring.resolver.IDictMetaData;
import com.ccclubs.frm.spring.resolver.IMetaData;
import org.apache.commons.lang3.StringUtils;


public class MetaDef {

  /**
   * 根据接入商Id，获取接入商名称
   */
  public final static IMetaData getUserName = new IMetaData() {

    @Override
    public <T> T get(Object data) {
      ISrvUserService srvUserService = AppContext.CTX.getBean(ISrvUserService.class);
      if (null != srvUserService && null != data && !StringUtils.isEmpty(data.toString())) {
        SrvUser record = srvUserService.selectByPrimaryKey(data);
        if (null != record) {
          return (T) record.getSuUsername();
        }
      }
      return null;
    }
  };

  /**
   * 根据接入商Id，获取接入商名称
   */
  public final static IMetaData getAccessName = new IMetaData() {

    @Override
    public <T> T get(Object data) {
      ISrvHostService srvHostService = AppContext.CTX.getBean(ISrvHostService.class);
      if (null != srvHostService && null != data && !StringUtils.isEmpty(data.toString())) {
        SrvHost record = srvHostService.selectByPrimaryKey(data);
        if (null != record) {
          return (T) record.getShName();
        }
      }
      return null;
    }
  };

  /**
   * 根据字典表 type，及 value 获取 label
   */
  public final static IDictMetaData getDictLabel = new IDictMetaData() {

    @Override
    public <T> T get(String type, Object data) {
      ISrvDictService srvDictService = AppContext.CTX.getBean(ISrvDictService.class);
      if (srvDictService != null && data != null && !StringUtils.isEmpty(type)) {
        SrvDictCrieria query = new SrvDictCrieria();
        SrvDictCrieria.Criteria c = query.createCriteria();
        c.andtypeEqualTo(type);
        c.andvalueEqualTo(data.toString());
        List<SrvDict> recordList = srvDictService.selectByExample(query);
        if (recordList != null && recordList.size() > 0) {
          return (T) recordList.get(0).getlabel();
        }
      }
      return null;
    }
  };


  /**
   * 根据城市ID获取名称
   */
  public final static IMetaData getVehicleModelName = new IMetaData() {

    @Override
    public <T> T get(Object data) {
      ICsModelService csModelService = AppContext.CTX.getBean(ICsModelService.class);
      if (null != csModelService && null != data && !StringUtils.isEmpty(data.toString())) {
        CsModel record = csModelService.selectByPrimaryKey(data);
        if (null != record) {
          return (T) record.getCsmName();
        }
      }
      return null;
    }
  };

  /**
   * 根据 CsMachine id 获取序列号
   */
  public final static IMetaData getMachineTeNo = new IMetaData() {

    @Override
    public <T> T get(Object data) {
      ICsMachineService csMachineService = AppContext.CTX.getBean(ICsMachineService.class);
      if (null != csMachineService && null != data && !StringUtils.isEmpty(data.toString())) {
        CsMachine record = csMachineService.selectByPrimaryKey(data);
        if (null != record) {
          return (T) record.getCsmTeNo();
        }
      }
      return null;
    }
  };

  /**
   * 根据 CsMachine id 获取终端序列号
   */
  public final static IMetaData getMachineInfo = new IMetaData() {

    @Override
    public <T> T get(Object data) {
      ICsMachineService csMachineService = AppContext.CTX.getBean(ICsMachineService.class);
      if (null != csMachineService && null != data && !StringUtils.isEmpty(data.toString())) {
        CsMachineCrieria query = new CsMachineCrieria();
        CsMachineCrieria.Criteria c = query.createCriteria();
        c.andcsmNumberEqualTo(data.toString());
        List<CsMachine> recordList = csMachineService.selectByExample(query);
        if (recordList != null && recordList.size() > 0) {
          return (T) (recordList.get(0).getCsmTeNo());
        }
      }
      return null;
    }
  };

  /**
   * 依据 carId 获取VIN码信息
   */
  public final static IMetaData getVehicleVin = new IMetaData() {

    @Override
    public <T> T get(Object data) {
      ICsVehicleService csVehicleService = AppContext.CTX.getBean(ICsVehicleService.class);
      if (null != csVehicleService && null != data && !StringUtils.isEmpty(data.toString())) {
        CsVehicle record = csVehicleService.selectByPrimaryKey(data);
        if (null != record) {
          return (T) record.getCsvVin();
        }
      }
      return null;
    }
  };

  /**
   * 依据 Id 获取指令类型名称
   */
  public final static IMetaData getStructName = new IMetaData() {

    @Override
    public <T> T get(Object data) {
      ICsStructService structService = AppContext.CTX.getBean(ICsStructService.class);
      if (null != structService && null != data && !StringUtils.isEmpty(data.toString())) {
        CsStruct record = structService.selectByPrimaryKey(data);
        if (null != record) {
          return (T) record.getCssName();
        }
      }
      return null;
    }
  };

}
