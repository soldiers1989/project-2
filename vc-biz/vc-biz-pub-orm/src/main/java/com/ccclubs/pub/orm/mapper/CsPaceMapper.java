package com.ccclubs.pub.orm.mapper;

import com.ccclubs.pub.orm.model.CsPace;
import com.ccclubs.pub.orm.model.CsPaceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsPaceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    long countByExample(CsPaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    int deleteByExample(CsPaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    int insert(CsPace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    int insertSelective(CsPace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    List<CsPace> selectByExample(CsPaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    CsPace selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CsPace record, @Param("example") CsPaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CsPace record, @Param("example") CsPaceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CsPace record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_pace
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CsPace record);
}