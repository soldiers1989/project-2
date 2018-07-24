package com.ccclubs.pub.orm.mapper;

import com.ccclubs.pub.orm.model.SrvAttribute;
import com.ccclubs.pub.orm.model.SrvAttributeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrvAttributeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    long countByExample(SrvAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    int deleteByExample(SrvAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long saId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    int insert(SrvAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    int insertSelective(SrvAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    List<SrvAttribute> selectByExample(SrvAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    SrvAttribute selectByPrimaryKey(Long saId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrvAttribute record, @Param("example") SrvAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrvAttribute record, @Param("example") SrvAttributeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrvAttribute record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_attribute
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrvAttribute record);
}