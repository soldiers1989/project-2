package com.ccclubs.pub.orm.mapper;

import com.ccclubs.pub.orm.model.SrvGroup;
import com.ccclubs.pub.orm.model.SrvGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SrvGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    long countByExample(SrvGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    int deleteByExample(SrvGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long sgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    int insert(SrvGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    int insertSelective(SrvGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    List<SrvGroup> selectByExample(SrvGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    SrvGroup selectByPrimaryKey(Long sgId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SrvGroup record, @Param("example") SrvGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SrvGroup record, @Param("example") SrvGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SrvGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_group
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SrvGroup record);
}