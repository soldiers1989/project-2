package com.ccclubs.pub.orm.mapper;

import com.ccclubs.pub.orm.model.SrvLimited;
import com.ccclubs.pub.orm.model.SrvLimitedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrvLimitedMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    long countByExample(SrvLimitedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    int deleteByExample(SrvLimitedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long slId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    int insert(SrvLimited record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    int insertSelective(SrvLimited record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    List<SrvLimited> selectByExample(SrvLimitedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    SrvLimited selectByPrimaryKey(Long slId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrvLimited record, @Param("example") SrvLimitedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrvLimited record, @Param("example") SrvLimitedExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrvLimited record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_limited
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrvLimited record);
}