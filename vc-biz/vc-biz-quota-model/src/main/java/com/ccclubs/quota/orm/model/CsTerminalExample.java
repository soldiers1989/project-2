package com.ccclubs.quota.orm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CsTerminalExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    public CsTerminalExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
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
     * This method corresponds to the database table cs_terminal
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
     * This method corresponds to the database table cs_terminal
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cs_terminal
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
     * This class corresponds to the database table cs_terminal
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

        public Criteria andCstIdIsNull() {
            addCriterion("cst_id is null");
            return (Criteria) this;
        }

        public Criteria andCstIdIsNotNull() {
            addCriterion("cst_id is not null");
            return (Criteria) this;
        }

        public Criteria andCstIdEqualTo(Long value) {
            addCriterion("cst_id =", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotEqualTo(Long value) {
            addCriterion("cst_id <>", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdGreaterThan(Long value) {
            addCriterion("cst_id >", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdGreaterThanOrEqualTo(Long value) {
            addCriterion("cst_id >=", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdLessThan(Long value) {
            addCriterion("cst_id <", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdLessThanOrEqualTo(Long value) {
            addCriterion("cst_id <=", value, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdIn(List<Long> values) {
            addCriterion("cst_id in", values, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotIn(List<Long> values) {
            addCriterion("cst_id not in", values, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdBetween(Long value1, Long value2) {
            addCriterion("cst_id between", value1, value2, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIdNotBetween(Long value1, Long value2) {
            addCriterion("cst_id not between", value1, value2, "cstId");
            return (Criteria) this;
        }

        public Criteria andCstIddIsNull() {
            addCriterion("cst_idd is null");
            return (Criteria) this;
        }

        public Criteria andCstIddIsNotNull() {
            addCriterion("cst_idd is not null");
            return (Criteria) this;
        }

        public Criteria andCstIddEqualTo(String value) {
            addCriterion("cst_idd =", value, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddNotEqualTo(String value) {
            addCriterion("cst_idd <>", value, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddGreaterThan(String value) {
            addCriterion("cst_idd >", value, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddGreaterThanOrEqualTo(String value) {
            addCriterion("cst_idd >=", value, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddLessThan(String value) {
            addCriterion("cst_idd <", value, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddLessThanOrEqualTo(String value) {
            addCriterion("cst_idd <=", value, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddLike(String value) {
            addCriterion("cst_idd like", value, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddNotLike(String value) {
            addCriterion("cst_idd not like", value, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddIn(List<String> values) {
            addCriterion("cst_idd in", values, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddNotIn(List<String> values) {
            addCriterion("cst_idd not in", values, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddBetween(String value1, String value2) {
            addCriterion("cst_idd between", value1, value2, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstIddNotBetween(String value1, String value2) {
            addCriterion("cst_idd not between", value1, value2, "cstIdd");
            return (Criteria) this;
        }

        public Criteria andCstModelIsNull() {
            addCriterion("cst_model is null");
            return (Criteria) this;
        }

        public Criteria andCstModelIsNotNull() {
            addCriterion("cst_model is not null");
            return (Criteria) this;
        }

        public Criteria andCstModelEqualTo(String value) {
            addCriterion("cst_model =", value, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelNotEqualTo(String value) {
            addCriterion("cst_model <>", value, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelGreaterThan(String value) {
            addCriterion("cst_model >", value, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelGreaterThanOrEqualTo(String value) {
            addCriterion("cst_model >=", value, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelLessThan(String value) {
            addCriterion("cst_model <", value, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelLessThanOrEqualTo(String value) {
            addCriterion("cst_model <=", value, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelLike(String value) {
            addCriterion("cst_model like", value, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelNotLike(String value) {
            addCriterion("cst_model not like", value, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelIn(List<String> values) {
            addCriterion("cst_model in", values, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelNotIn(List<String> values) {
            addCriterion("cst_model not in", values, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelBetween(String value1, String value2) {
            addCriterion("cst_model between", value1, value2, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstModelNotBetween(String value1, String value2) {
            addCriterion("cst_model not between", value1, value2, "cstModel");
            return (Criteria) this;
        }

        public Criteria andCstMadeIsNull() {
            addCriterion("cst_made is null");
            return (Criteria) this;
        }

        public Criteria andCstMadeIsNotNull() {
            addCriterion("cst_made is not null");
            return (Criteria) this;
        }

        public Criteria andCstMadeEqualTo(String value) {
            addCriterion("cst_made =", value, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeNotEqualTo(String value) {
            addCriterion("cst_made <>", value, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeGreaterThan(String value) {
            addCriterion("cst_made >", value, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeGreaterThanOrEqualTo(String value) {
            addCriterion("cst_made >=", value, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeLessThan(String value) {
            addCriterion("cst_made <", value, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeLessThanOrEqualTo(String value) {
            addCriterion("cst_made <=", value, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeLike(String value) {
            addCriterion("cst_made like", value, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeNotLike(String value) {
            addCriterion("cst_made not like", value, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeIn(List<String> values) {
            addCriterion("cst_made in", values, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeNotIn(List<String> values) {
            addCriterion("cst_made not in", values, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeBetween(String value1, String value2) {
            addCriterion("cst_made between", value1, value2, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstMadeNotBetween(String value1, String value2) {
            addCriterion("cst_made not between", value1, value2, "cstMade");
            return (Criteria) this;
        }

        public Criteria andCstProvinceIsNull() {
            addCriterion("cst_province is null");
            return (Criteria) this;
        }

        public Criteria andCstProvinceIsNotNull() {
            addCriterion("cst_province is not null");
            return (Criteria) this;
        }

        public Criteria andCstProvinceEqualTo(String value) {
            addCriterion("cst_province =", value, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceNotEqualTo(String value) {
            addCriterion("cst_province <>", value, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceGreaterThan(String value) {
            addCriterion("cst_province >", value, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("cst_province >=", value, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceLessThan(String value) {
            addCriterion("cst_province <", value, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceLessThanOrEqualTo(String value) {
            addCriterion("cst_province <=", value, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceLike(String value) {
            addCriterion("cst_province like", value, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceNotLike(String value) {
            addCriterion("cst_province not like", value, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceIn(List<String> values) {
            addCriterion("cst_province in", values, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceNotIn(List<String> values) {
            addCriterion("cst_province not in", values, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceBetween(String value1, String value2) {
            addCriterion("cst_province between", value1, value2, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstProvinceNotBetween(String value1, String value2) {
            addCriterion("cst_province not between", value1, value2, "cstProvince");
            return (Criteria) this;
        }

        public Criteria andCstCityIsNull() {
            addCriterion("cst_city is null");
            return (Criteria) this;
        }

        public Criteria andCstCityIsNotNull() {
            addCriterion("cst_city is not null");
            return (Criteria) this;
        }

        public Criteria andCstCityEqualTo(String value) {
            addCriterion("cst_city =", value, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityNotEqualTo(String value) {
            addCriterion("cst_city <>", value, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityGreaterThan(String value) {
            addCriterion("cst_city >", value, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityGreaterThanOrEqualTo(String value) {
            addCriterion("cst_city >=", value, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityLessThan(String value) {
            addCriterion("cst_city <", value, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityLessThanOrEqualTo(String value) {
            addCriterion("cst_city <=", value, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityLike(String value) {
            addCriterion("cst_city like", value, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityNotLike(String value) {
            addCriterion("cst_city not like", value, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityIn(List<String> values) {
            addCriterion("cst_city in", values, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityNotIn(List<String> values) {
            addCriterion("cst_city not in", values, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityBetween(String value1, String value2) {
            addCriterion("cst_city between", value1, value2, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstCityNotBetween(String value1, String value2) {
            addCriterion("cst_city not between", value1, value2, "cstCity");
            return (Criteria) this;
        }

        public Criteria andCstColorIsNull() {
            addCriterion("cst_color is null");
            return (Criteria) this;
        }

        public Criteria andCstColorIsNotNull() {
            addCriterion("cst_color is not null");
            return (Criteria) this;
        }

        public Criteria andCstColorEqualTo(Integer value) {
            addCriterion("cst_color =", value, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorNotEqualTo(Integer value) {
            addCriterion("cst_color <>", value, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorGreaterThan(Integer value) {
            addCriterion("cst_color >", value, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorGreaterThanOrEqualTo(Integer value) {
            addCriterion("cst_color >=", value, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorLessThan(Integer value) {
            addCriterion("cst_color <", value, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorLessThanOrEqualTo(Integer value) {
            addCriterion("cst_color <=", value, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorIn(List<Integer> values) {
            addCriterion("cst_color in", values, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorNotIn(List<Integer> values) {
            addCriterion("cst_color not in", values, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorBetween(Integer value1, Integer value2) {
            addCriterion("cst_color between", value1, value2, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstColorNotBetween(Integer value1, Integer value2) {
            addCriterion("cst_color not between", value1, value2, "cstColor");
            return (Criteria) this;
        }

        public Criteria andCstNumberIsNull() {
            addCriterion("cst_number is null");
            return (Criteria) this;
        }

        public Criteria andCstNumberIsNotNull() {
            addCriterion("cst_number is not null");
            return (Criteria) this;
        }

        public Criteria andCstNumberEqualTo(String value) {
            addCriterion("cst_number =", value, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberNotEqualTo(String value) {
            addCriterion("cst_number <>", value, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberGreaterThan(String value) {
            addCriterion("cst_number >", value, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cst_number >=", value, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberLessThan(String value) {
            addCriterion("cst_number <", value, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberLessThanOrEqualTo(String value) {
            addCriterion("cst_number <=", value, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberLike(String value) {
            addCriterion("cst_number like", value, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberNotLike(String value) {
            addCriterion("cst_number not like", value, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberIn(List<String> values) {
            addCriterion("cst_number in", values, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberNotIn(List<String> values) {
            addCriterion("cst_number not in", values, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberBetween(String value1, String value2) {
            addCriterion("cst_number between", value1, value2, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstNumberNotBetween(String value1, String value2) {
            addCriterion("cst_number not between", value1, value2, "cstNumber");
            return (Criteria) this;
        }

        public Criteria andCstVinIsNull() {
            addCriterion("cst_vin is null");
            return (Criteria) this;
        }

        public Criteria andCstVinIsNotNull() {
            addCriterion("cst_vin is not null");
            return (Criteria) this;
        }

        public Criteria andCstVinEqualTo(String value) {
            addCriterion("cst_vin =", value, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinNotEqualTo(String value) {
            addCriterion("cst_vin <>", value, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinGreaterThan(String value) {
            addCriterion("cst_vin >", value, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinGreaterThanOrEqualTo(String value) {
            addCriterion("cst_vin >=", value, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinLessThan(String value) {
            addCriterion("cst_vin <", value, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinLessThanOrEqualTo(String value) {
            addCriterion("cst_vin <=", value, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinLike(String value) {
            addCriterion("cst_vin like", value, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinNotLike(String value) {
            addCriterion("cst_vin not like", value, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinIn(List<String> values) {
            addCriterion("cst_vin in", values, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinNotIn(List<String> values) {
            addCriterion("cst_vin not in", values, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinBetween(String value1, String value2) {
            addCriterion("cst_vin between", value1, value2, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstVinNotBetween(String value1, String value2) {
            addCriterion("cst_vin not between", value1, value2, "cstVin");
            return (Criteria) this;
        }

        public Criteria andCstMobileIsNull() {
            addCriterion("cst_mobile is null");
            return (Criteria) this;
        }

        public Criteria andCstMobileIsNotNull() {
            addCriterion("cst_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andCstMobileEqualTo(String value) {
            addCriterion("cst_mobile =", value, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileNotEqualTo(String value) {
            addCriterion("cst_mobile <>", value, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileGreaterThan(String value) {
            addCriterion("cst_mobile >", value, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileGreaterThanOrEqualTo(String value) {
            addCriterion("cst_mobile >=", value, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileLessThan(String value) {
            addCriterion("cst_mobile <", value, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileLessThanOrEqualTo(String value) {
            addCriterion("cst_mobile <=", value, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileLike(String value) {
            addCriterion("cst_mobile like", value, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileNotLike(String value) {
            addCriterion("cst_mobile not like", value, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileIn(List<String> values) {
            addCriterion("cst_mobile in", values, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileNotIn(List<String> values) {
            addCriterion("cst_mobile not in", values, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileBetween(String value1, String value2) {
            addCriterion("cst_mobile between", value1, value2, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstMobileNotBetween(String value1, String value2) {
            addCriterion("cst_mobile not between", value1, value2, "cstMobile");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeIsNull() {
            addCriterion("cst_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeIsNotNull() {
            addCriterion("cst_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeEqualTo(Date value) {
            addCriterion("cst_update_time =", value, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeNotEqualTo(Date value) {
            addCriterion("cst_update_time <>", value, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeGreaterThan(Date value) {
            addCriterion("cst_update_time >", value, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cst_update_time >=", value, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeLessThan(Date value) {
            addCriterion("cst_update_time <", value, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cst_update_time <=", value, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeIn(List<Date> values) {
            addCriterion("cst_update_time in", values, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeNotIn(List<Date> values) {
            addCriterion("cst_update_time not in", values, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("cst_update_time between", value1, value2, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cst_update_time not between", value1, value2, "cstUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeIsNull() {
            addCriterion("cst_add_time is null");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeIsNotNull() {
            addCriterion("cst_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeEqualTo(Date value) {
            addCriterion("cst_add_time =", value, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeNotEqualTo(Date value) {
            addCriterion("cst_add_time <>", value, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeGreaterThan(Date value) {
            addCriterion("cst_add_time >", value, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cst_add_time >=", value, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeLessThan(Date value) {
            addCriterion("cst_add_time <", value, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("cst_add_time <=", value, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeIn(List<Date> values) {
            addCriterion("cst_add_time in", values, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeNotIn(List<Date> values) {
            addCriterion("cst_add_time not in", values, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeBetween(Date value1, Date value2) {
            addCriterion("cst_add_time between", value1, value2, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("cst_add_time not between", value1, value2, "cstAddTime");
            return (Criteria) this;
        }

        public Criteria andCstStatusIsNull() {
            addCriterion("cst_status is null");
            return (Criteria) this;
        }

        public Criteria andCstStatusIsNotNull() {
            addCriterion("cst_status is not null");
            return (Criteria) this;
        }

        public Criteria andCstStatusEqualTo(Integer value) {
            addCriterion("cst_status =", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusNotEqualTo(Integer value) {
            addCriterion("cst_status <>", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusGreaterThan(Integer value) {
            addCriterion("cst_status >", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cst_status >=", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusLessThan(Integer value) {
            addCriterion("cst_status <", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cst_status <=", value, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusIn(List<Integer> values) {
            addCriterion("cst_status in", values, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusNotIn(List<Integer> values) {
            addCriterion("cst_status not in", values, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusBetween(Integer value1, Integer value2) {
            addCriterion("cst_status between", value1, value2, "cstStatus");
            return (Criteria) this;
        }

        public Criteria andCstStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cst_status not between", value1, value2, "cstStatus");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table cs_terminal
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
     * This class corresponds to the database table cs_terminal
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