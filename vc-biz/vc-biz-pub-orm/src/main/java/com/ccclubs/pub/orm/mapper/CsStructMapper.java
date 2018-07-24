package com.ccclubs.pub.orm.mapper;

import com.ccclubs.pub.orm.model.CsStruct;
import com.ccclubs.pub.orm.model.CsStructExample;
import com.ccclubs.pub.orm.model.CsStructWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsStructMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    long countByExample(CsStructExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int deleteByExample(CsStructExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long cssId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int insert(CsStructWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int insertSelective(CsStructWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    List<CsStructWithBLOBs> selectByExampleWithBLOBs(CsStructExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    List<CsStruct> selectByExample(CsStructExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    CsStructWithBLOBs selectByPrimaryKey(Long cssId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CsStructWithBLOBs record, @Param("example") CsStructExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") CsStructWithBLOBs record, @Param("example") CsStructExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CsStruct record, @Param("example") CsStructExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CsStructWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(CsStructWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_struct
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CsStruct record);
}