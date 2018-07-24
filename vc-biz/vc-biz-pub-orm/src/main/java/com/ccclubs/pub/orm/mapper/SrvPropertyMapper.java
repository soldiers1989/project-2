package com.ccclubs.pub.orm.mapper;

import com.ccclubs.pub.orm.model.SrvProperty;
import com.ccclubs.pub.orm.model.SrvPropertyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrvPropertyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    long countByExample(SrvPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int deleteByExample(SrvPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long spId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int insert(SrvProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int insertSelective(SrvProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    List<SrvProperty> selectByExampleWithBLOBs(SrvPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    List<SrvProperty> selectByExample(SrvPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    SrvProperty selectByPrimaryKey(Long spId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrvProperty record, @Param("example") SrvPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") SrvProperty record, @Param("example") SrvPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrvProperty record, @Param("example") SrvPropertyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrvProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(SrvProperty record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_property
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrvProperty record);
}