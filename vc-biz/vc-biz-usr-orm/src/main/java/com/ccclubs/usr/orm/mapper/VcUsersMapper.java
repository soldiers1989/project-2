package com.ccclubs.usr.orm.mapper;

import com.ccclubs.usr.orm.model.VcUsers;
import com.ccclubs.usr.orm.model.VcUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VcUsersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    long countByExample(VcUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    int deleteByExample(VcUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    int insert(VcUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    int insertSelective(VcUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    List<VcUsers> selectByExample(VcUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    VcUsers selectByPrimaryKey(String userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") VcUsers record, @Param("example") VcUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") VcUsers record, @Param("example") VcUsersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(VcUsers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vc_users
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(VcUsers record);
}