package com.ccclubs.quota.orm.mapper;

import com.ccclubs.quota.orm.model.SocMilesQuota;
import com.ccclubs.quota.orm.model.SocMilesQuotaExample;
import java.util.List;

public interface SocMilesQuotaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table soc_miles_quota
     *
     * @mbg.generated
     */
    List<SocMilesQuota> selectByExample(SocMilesQuotaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table soc_miles_quota
     *
     * @mbg.generated
     */
    SocMilesQuota selectByPrimaryKey(String csVin);
}