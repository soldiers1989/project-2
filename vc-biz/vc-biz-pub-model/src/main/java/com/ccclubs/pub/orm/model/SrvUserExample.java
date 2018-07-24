package com.ccclubs.pub.orm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SrvUserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public SrvUserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSuIdIsNull() {
            addCriterion("su_id is null");
            return (Criteria) this;
        }

        public Criteria andSuIdIsNotNull() {
            addCriterion("su_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuIdEqualTo(Integer value) {
            addCriterion("su_id =", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotEqualTo(Integer value) {
            addCriterion("su_id <>", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThan(Integer value) {
            addCriterion("su_id >", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("su_id >=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThan(Integer value) {
            addCriterion("su_id <", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdLessThanOrEqualTo(Integer value) {
            addCriterion("su_id <=", value, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdIn(List<Integer> values) {
            addCriterion("su_id in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotIn(List<Integer> values) {
            addCriterion("su_id not in", values, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdBetween(Integer value1, Integer value2) {
            addCriterion("su_id between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("su_id not between", value1, value2, "suId");
            return (Criteria) this;
        }

        public Criteria andSuHostIsNull() {
            addCriterion("su_host is null");
            return (Criteria) this;
        }

        public Criteria andSuHostIsNotNull() {
            addCriterion("su_host is not null");
            return (Criteria) this;
        }

        public Criteria andSuHostEqualTo(String value) {
            addCriterion("su_host =", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostNotEqualTo(String value) {
            addCriterion("su_host <>", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostGreaterThan(String value) {
            addCriterion("su_host >", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostGreaterThanOrEqualTo(String value) {
            addCriterion("su_host >=", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostLessThan(String value) {
            addCriterion("su_host <", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostLessThanOrEqualTo(String value) {
            addCriterion("su_host <=", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostLike(String value) {
            addCriterion("su_host like", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostNotLike(String value) {
            addCriterion("su_host not like", value, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostIn(List<String> values) {
            addCriterion("su_host in", values, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostNotIn(List<String> values) {
            addCriterion("su_host not in", values, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostBetween(String value1, String value2) {
            addCriterion("su_host between", value1, value2, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuHostNotBetween(String value1, String value2) {
            addCriterion("su_host not between", value1, value2, "suHost");
            return (Criteria) this;
        }

        public Criteria andSuGroupIsNull() {
            addCriterion("su_group is null");
            return (Criteria) this;
        }

        public Criteria andSuGroupIsNotNull() {
            addCriterion("su_group is not null");
            return (Criteria) this;
        }

        public Criteria andSuGroupEqualTo(Long value) {
            addCriterion("su_group =", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupNotEqualTo(Long value) {
            addCriterion("su_group <>", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupGreaterThan(Long value) {
            addCriterion("su_group >", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupGreaterThanOrEqualTo(Long value) {
            addCriterion("su_group >=", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupLessThan(Long value) {
            addCriterion("su_group <", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupLessThanOrEqualTo(Long value) {
            addCriterion("su_group <=", value, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupIn(List<Long> values) {
            addCriterion("su_group in", values, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupNotIn(List<Long> values) {
            addCriterion("su_group not in", values, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupBetween(Long value1, Long value2) {
            addCriterion("su_group between", value1, value2, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuGroupNotBetween(Long value1, Long value2) {
            addCriterion("su_group not between", value1, value2, "suGroup");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIsNull() {
            addCriterion("su_username is null");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIsNotNull() {
            addCriterion("su_username is not null");
            return (Criteria) this;
        }

        public Criteria andSuUsernameEqualTo(String value) {
            addCriterion("su_username =", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotEqualTo(String value) {
            addCriterion("su_username <>", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameGreaterThan(String value) {
            addCriterion("su_username >", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("su_username >=", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLessThan(String value) {
            addCriterion("su_username <", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLessThanOrEqualTo(String value) {
            addCriterion("su_username <=", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameLike(String value) {
            addCriterion("su_username like", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotLike(String value) {
            addCriterion("su_username not like", value, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameIn(List<String> values) {
            addCriterion("su_username in", values, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotIn(List<String> values) {
            addCriterion("su_username not in", values, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameBetween(String value1, String value2) {
            addCriterion("su_username between", value1, value2, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuUsernameNotBetween(String value1, String value2) {
            addCriterion("su_username not between", value1, value2, "suUsername");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNull() {
            addCriterion("su_password is null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIsNotNull() {
            addCriterion("su_password is not null");
            return (Criteria) this;
        }

        public Criteria andSuPasswordEqualTo(String value) {
            addCriterion("su_password =", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotEqualTo(String value) {
            addCriterion("su_password <>", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThan(String value) {
            addCriterion("su_password >", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("su_password >=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThan(String value) {
            addCriterion("su_password <", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLessThanOrEqualTo(String value) {
            addCriterion("su_password <=", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordLike(String value) {
            addCriterion("su_password like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotLike(String value) {
            addCriterion("su_password not like", value, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordIn(List<String> values) {
            addCriterion("su_password in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotIn(List<String> values) {
            addCriterion("su_password not in", values, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordBetween(String value1, String value2) {
            addCriterion("su_password between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuPasswordNotBetween(String value1, String value2) {
            addCriterion("su_password not between", value1, value2, "suPassword");
            return (Criteria) this;
        }

        public Criteria andSuRealNameIsNull() {
            addCriterion("su_real_name is null");
            return (Criteria) this;
        }

        public Criteria andSuRealNameIsNotNull() {
            addCriterion("su_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuRealNameEqualTo(String value) {
            addCriterion("su_real_name =", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameNotEqualTo(String value) {
            addCriterion("su_real_name <>", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameGreaterThan(String value) {
            addCriterion("su_real_name >", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("su_real_name >=", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameLessThan(String value) {
            addCriterion("su_real_name <", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameLessThanOrEqualTo(String value) {
            addCriterion("su_real_name <=", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameLike(String value) {
            addCriterion("su_real_name like", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameNotLike(String value) {
            addCriterion("su_real_name not like", value, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameIn(List<String> values) {
            addCriterion("su_real_name in", values, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameNotIn(List<String> values) {
            addCriterion("su_real_name not in", values, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameBetween(String value1, String value2) {
            addCriterion("su_real_name between", value1, value2, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuRealNameNotBetween(String value1, String value2) {
            addCriterion("su_real_name not between", value1, value2, "suRealName");
            return (Criteria) this;
        }

        public Criteria andSuMobileIsNull() {
            addCriterion("su_mobile is null");
            return (Criteria) this;
        }

        public Criteria andSuMobileIsNotNull() {
            addCriterion("su_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andSuMobileEqualTo(String value) {
            addCriterion("su_mobile =", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotEqualTo(String value) {
            addCriterion("su_mobile <>", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileGreaterThan(String value) {
            addCriterion("su_mobile >", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileGreaterThanOrEqualTo(String value) {
            addCriterion("su_mobile >=", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLessThan(String value) {
            addCriterion("su_mobile <", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLessThanOrEqualTo(String value) {
            addCriterion("su_mobile <=", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileLike(String value) {
            addCriterion("su_mobile like", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotLike(String value) {
            addCriterion("su_mobile not like", value, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileIn(List<String> values) {
            addCriterion("su_mobile in", values, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotIn(List<String> values) {
            addCriterion("su_mobile not in", values, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileBetween(String value1, String value2) {
            addCriterion("su_mobile between", value1, value2, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuMobileNotBetween(String value1, String value2) {
            addCriterion("su_mobile not between", value1, value2, "suMobile");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeIsNull() {
            addCriterion("su_add_time is null");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeIsNotNull() {
            addCriterion("su_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeEqualTo(Date value) {
            addCriterion("su_add_time =", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeNotEqualTo(Date value) {
            addCriterion("su_add_time <>", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeGreaterThan(Date value) {
            addCriterion("su_add_time >", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("su_add_time >=", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeLessThan(Date value) {
            addCriterion("su_add_time <", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("su_add_time <=", value, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeIn(List<Date> values) {
            addCriterion("su_add_time in", values, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeNotIn(List<Date> values) {
            addCriterion("su_add_time not in", values, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeBetween(Date value1, Date value2) {
            addCriterion("su_add_time between", value1, value2, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("su_add_time not between", value1, value2, "suAddTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeIsNull() {
            addCriterion("su_last_time is null");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeIsNotNull() {
            addCriterion("su_last_time is not null");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeEqualTo(Date value) {
            addCriterion("su_last_time =", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeNotEqualTo(Date value) {
            addCriterion("su_last_time <>", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeGreaterThan(Date value) {
            addCriterion("su_last_time >", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("su_last_time >=", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeLessThan(Date value) {
            addCriterion("su_last_time <", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeLessThanOrEqualTo(Date value) {
            addCriterion("su_last_time <=", value, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeIn(List<Date> values) {
            addCriterion("su_last_time in", values, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeNotIn(List<Date> values) {
            addCriterion("su_last_time not in", values, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeBetween(Date value1, Date value2) {
            addCriterion("su_last_time between", value1, value2, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastTimeNotBetween(Date value1, Date value2) {
            addCriterion("su_last_time not between", value1, value2, "suLastTime");
            return (Criteria) this;
        }

        public Criteria andSuLastIpIsNull() {
            addCriterion("su_last_ip is null");
            return (Criteria) this;
        }

        public Criteria andSuLastIpIsNotNull() {
            addCriterion("su_last_ip is not null");
            return (Criteria) this;
        }

        public Criteria andSuLastIpEqualTo(String value) {
            addCriterion("su_last_ip =", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpNotEqualTo(String value) {
            addCriterion("su_last_ip <>", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpGreaterThan(String value) {
            addCriterion("su_last_ip >", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpGreaterThanOrEqualTo(String value) {
            addCriterion("su_last_ip >=", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpLessThan(String value) {
            addCriterion("su_last_ip <", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpLessThanOrEqualTo(String value) {
            addCriterion("su_last_ip <=", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpLike(String value) {
            addCriterion("su_last_ip like", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpNotLike(String value) {
            addCriterion("su_last_ip not like", value, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpIn(List<String> values) {
            addCriterion("su_last_ip in", values, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpNotIn(List<String> values) {
            addCriterion("su_last_ip not in", values, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpBetween(String value1, String value2) {
            addCriterion("su_last_ip between", value1, value2, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuLastIpNotBetween(String value1, String value2) {
            addCriterion("su_last_ip not between", value1, value2, "suLastIp");
            return (Criteria) this;
        }

        public Criteria andSuStatusIsNull() {
            addCriterion("su_status is null");
            return (Criteria) this;
        }

        public Criteria andSuStatusIsNotNull() {
            addCriterion("su_status is not null");
            return (Criteria) this;
        }

        public Criteria andSuStatusEqualTo(Short value) {
            addCriterion("su_status =", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotEqualTo(Short value) {
            addCriterion("su_status <>", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusGreaterThan(Short value) {
            addCriterion("su_status >", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("su_status >=", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusLessThan(Short value) {
            addCriterion("su_status <", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusLessThanOrEqualTo(Short value) {
            addCriterion("su_status <=", value, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusIn(List<Short> values) {
            addCriterion("su_status in", values, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotIn(List<Short> values) {
            addCriterion("su_status not in", values, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusBetween(Short value1, Short value2) {
            addCriterion("su_status between", value1, value2, "suStatus");
            return (Criteria) this;
        }

        public Criteria andSuStatusNotBetween(Short value1, Short value2) {
            addCriterion("su_status not between", value1, value2, "suStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table srv_user
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table srv_user
     *
     * @mbg.generated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}