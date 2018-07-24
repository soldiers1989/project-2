package com.ccclubs.pub.orm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CsVehicleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CsVehicleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCsvIdIsNull() {
            addCriterion("csv_id is null");
            return (Criteria) this;
        }

        public Criteria andCsvIdIsNotNull() {
            addCriterion("csv_id is not null");
            return (Criteria) this;
        }

        public Criteria andCsvIdEqualTo(Integer value) {
            addCriterion("csv_id =", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdNotEqualTo(Integer value) {
            addCriterion("csv_id <>", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdGreaterThan(Integer value) {
            addCriterion("csv_id >", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("csv_id >=", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdLessThan(Integer value) {
            addCriterion("csv_id <", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdLessThanOrEqualTo(Integer value) {
            addCriterion("csv_id <=", value, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdIn(List<Integer> values) {
            addCriterion("csv_id in", values, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdNotIn(List<Integer> values) {
            addCriterion("csv_id not in", values, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdBetween(Integer value1, Integer value2) {
            addCriterion("csv_id between", value1, value2, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvIdNotBetween(Integer value1, Integer value2) {
            addCriterion("csv_id not between", value1, value2, "csvId");
            return (Criteria) this;
        }

        public Criteria andCsvAccessIsNull() {
            addCriterion("csv_access is null");
            return (Criteria) this;
        }

        public Criteria andCsvAccessIsNotNull() {
            addCriterion("csv_access is not null");
            return (Criteria) this;
        }

        public Criteria andCsvAccessEqualTo(Integer value) {
            addCriterion("csv_access =", value, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessNotEqualTo(Integer value) {
            addCriterion("csv_access <>", value, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessGreaterThan(Integer value) {
            addCriterion("csv_access >", value, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("csv_access >=", value, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessLessThan(Integer value) {
            addCriterion("csv_access <", value, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessLessThanOrEqualTo(Integer value) {
            addCriterion("csv_access <=", value, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessIn(List<Integer> values) {
            addCriterion("csv_access in", values, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessNotIn(List<Integer> values) {
            addCriterion("csv_access not in", values, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessBetween(Integer value1, Integer value2) {
            addCriterion("csv_access between", value1, value2, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvAccessNotBetween(Integer value1, Integer value2) {
            addCriterion("csv_access not between", value1, value2, "csvAccess");
            return (Criteria) this;
        }

        public Criteria andCsvHostIsNull() {
            addCriterion("csv_host is null");
            return (Criteria) this;
        }

        public Criteria andCsvHostIsNotNull() {
            addCriterion("csv_host is not null");
            return (Criteria) this;
        }

        public Criteria andCsvHostEqualTo(Integer value) {
            addCriterion("csv_host =", value, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostNotEqualTo(Integer value) {
            addCriterion("csv_host <>", value, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostGreaterThan(Integer value) {
            addCriterion("csv_host >", value, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostGreaterThanOrEqualTo(Integer value) {
            addCriterion("csv_host >=", value, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostLessThan(Integer value) {
            addCriterion("csv_host <", value, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostLessThanOrEqualTo(Integer value) {
            addCriterion("csv_host <=", value, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostIn(List<Integer> values) {
            addCriterion("csv_host in", values, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostNotIn(List<Integer> values) {
            addCriterion("csv_host not in", values, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostBetween(Integer value1, Integer value2) {
            addCriterion("csv_host between", value1, value2, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvHostNotBetween(Integer value1, Integer value2) {
            addCriterion("csv_host not between", value1, value2, "csvHost");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoIsNull() {
            addCriterion("csv_car_no is null");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoIsNotNull() {
            addCriterion("csv_car_no is not null");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoEqualTo(String value) {
            addCriterion("csv_car_no =", value, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoNotEqualTo(String value) {
            addCriterion("csv_car_no <>", value, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoGreaterThan(String value) {
            addCriterion("csv_car_no >", value, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("csv_car_no >=", value, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoLessThan(String value) {
            addCriterion("csv_car_no <", value, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoLessThanOrEqualTo(String value) {
            addCriterion("csv_car_no <=", value, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoLike(String value) {
            addCriterion("csv_car_no like", value, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoNotLike(String value) {
            addCriterion("csv_car_no not like", value, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoIn(List<String> values) {
            addCriterion("csv_car_no in", values, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoNotIn(List<String> values) {
            addCriterion("csv_car_no not in", values, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoBetween(String value1, String value2) {
            addCriterion("csv_car_no between", value1, value2, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvCarNoNotBetween(String value1, String value2) {
            addCriterion("csv_car_no not between", value1, value2, "csvCarNo");
            return (Criteria) this;
        }

        public Criteria andCsvVinIsNull() {
            addCriterion("csv_vin is null");
            return (Criteria) this;
        }

        public Criteria andCsvVinIsNotNull() {
            addCriterion("csv_vin is not null");
            return (Criteria) this;
        }

        public Criteria andCsvVinEqualTo(String value) {
            addCriterion("csv_vin =", value, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinNotEqualTo(String value) {
            addCriterion("csv_vin <>", value, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinGreaterThan(String value) {
            addCriterion("csv_vin >", value, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinGreaterThanOrEqualTo(String value) {
            addCriterion("csv_vin >=", value, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinLessThan(String value) {
            addCriterion("csv_vin <", value, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinLessThanOrEqualTo(String value) {
            addCriterion("csv_vin <=", value, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinLike(String value) {
            addCriterion("csv_vin like", value, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinNotLike(String value) {
            addCriterion("csv_vin not like", value, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinIn(List<String> values) {
            addCriterion("csv_vin in", values, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinNotIn(List<String> values) {
            addCriterion("csv_vin not in", values, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinBetween(String value1, String value2) {
            addCriterion("csv_vin between", value1, value2, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvVinNotBetween(String value1, String value2) {
            addCriterion("csv_vin not between", value1, value2, "csvVin");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoIsNull() {
            addCriterion("csv_engine_no is null");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoIsNotNull() {
            addCriterion("csv_engine_no is not null");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoEqualTo(String value) {
            addCriterion("csv_engine_no =", value, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoNotEqualTo(String value) {
            addCriterion("csv_engine_no <>", value, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoGreaterThan(String value) {
            addCriterion("csv_engine_no >", value, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("csv_engine_no >=", value, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoLessThan(String value) {
            addCriterion("csv_engine_no <", value, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoLessThanOrEqualTo(String value) {
            addCriterion("csv_engine_no <=", value, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoLike(String value) {
            addCriterion("csv_engine_no like", value, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoNotLike(String value) {
            addCriterion("csv_engine_no not like", value, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoIn(List<String> values) {
            addCriterion("csv_engine_no in", values, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoNotIn(List<String> values) {
            addCriterion("csv_engine_no not in", values, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoBetween(String value1, String value2) {
            addCriterion("csv_engine_no between", value1, value2, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvEngineNoNotBetween(String value1, String value2) {
            addCriterion("csv_engine_no not between", value1, value2, "csvEngineNo");
            return (Criteria) this;
        }

        public Criteria andCsvCertificIsNull() {
            addCriterion("csv_certific is null");
            return (Criteria) this;
        }

        public Criteria andCsvCertificIsNotNull() {
            addCriterion("csv_certific is not null");
            return (Criteria) this;
        }

        public Criteria andCsvCertificEqualTo(String value) {
            addCriterion("csv_certific =", value, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificNotEqualTo(String value) {
            addCriterion("csv_certific <>", value, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificGreaterThan(String value) {
            addCriterion("csv_certific >", value, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificGreaterThanOrEqualTo(String value) {
            addCriterion("csv_certific >=", value, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificLessThan(String value) {
            addCriterion("csv_certific <", value, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificLessThanOrEqualTo(String value) {
            addCriterion("csv_certific <=", value, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificLike(String value) {
            addCriterion("csv_certific like", value, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificNotLike(String value) {
            addCriterion("csv_certific not like", value, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificIn(List<String> values) {
            addCriterion("csv_certific in", values, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificNotIn(List<String> values) {
            addCriterion("csv_certific not in", values, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificBetween(String value1, String value2) {
            addCriterion("csv_certific between", value1, value2, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvCertificNotBetween(String value1, String value2) {
            addCriterion("csv_certific not between", value1, value2, "csvCertific");
            return (Criteria) this;
        }

        public Criteria andCsvColorIsNull() {
            addCriterion("csv_color is null");
            return (Criteria) this;
        }

        public Criteria andCsvColorIsNotNull() {
            addCriterion("csv_color is not null");
            return (Criteria) this;
        }

        public Criteria andCsvColorEqualTo(Byte value) {
            addCriterion("csv_color =", value, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorNotEqualTo(Byte value) {
            addCriterion("csv_color <>", value, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorGreaterThan(Byte value) {
            addCriterion("csv_color >", value, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorGreaterThanOrEqualTo(Byte value) {
            addCriterion("csv_color >=", value, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorLessThan(Byte value) {
            addCriterion("csv_color <", value, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorLessThanOrEqualTo(Byte value) {
            addCriterion("csv_color <=", value, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorIn(List<Byte> values) {
            addCriterion("csv_color in", values, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorNotIn(List<Byte> values) {
            addCriterion("csv_color not in", values, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorBetween(Byte value1, Byte value2) {
            addCriterion("csv_color between", value1, value2, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvColorNotBetween(Byte value1, Byte value2) {
            addCriterion("csv_color not between", value1, value2, "csvColor");
            return (Criteria) this;
        }

        public Criteria andCsvModelIsNull() {
            addCriterion("csv_model is null");
            return (Criteria) this;
        }

        public Criteria andCsvModelIsNotNull() {
            addCriterion("csv_model is not null");
            return (Criteria) this;
        }

        public Criteria andCsvModelEqualTo(Integer value) {
            addCriterion("csv_model =", value, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelNotEqualTo(Integer value) {
            addCriterion("csv_model <>", value, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelGreaterThan(Integer value) {
            addCriterion("csv_model >", value, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("csv_model >=", value, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelLessThan(Integer value) {
            addCriterion("csv_model <", value, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelLessThanOrEqualTo(Integer value) {
            addCriterion("csv_model <=", value, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelIn(List<Integer> values) {
            addCriterion("csv_model in", values, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelNotIn(List<Integer> values) {
            addCriterion("csv_model not in", values, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelBetween(Integer value1, Integer value2) {
            addCriterion("csv_model between", value1, value2, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvModelNotBetween(Integer value1, Integer value2) {
            addCriterion("csv_model not between", value1, value2, "csvModel");
            return (Criteria) this;
        }

        public Criteria andCsvMachineIsNull() {
            addCriterion("csv_machine is null");
            return (Criteria) this;
        }

        public Criteria andCsvMachineIsNotNull() {
            addCriterion("csv_machine is not null");
            return (Criteria) this;
        }

        public Criteria andCsvMachineEqualTo(Integer value) {
            addCriterion("csv_machine =", value, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineNotEqualTo(Integer value) {
            addCriterion("csv_machine <>", value, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineGreaterThan(Integer value) {
            addCriterion("csv_machine >", value, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineGreaterThanOrEqualTo(Integer value) {
            addCriterion("csv_machine >=", value, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineLessThan(Integer value) {
            addCriterion("csv_machine <", value, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineLessThanOrEqualTo(Integer value) {
            addCriterion("csv_machine <=", value, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineIn(List<Integer> values) {
            addCriterion("csv_machine in", values, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineNotIn(List<Integer> values) {
            addCriterion("csv_machine not in", values, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineBetween(Integer value1, Integer value2) {
            addCriterion("csv_machine between", value1, value2, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachineNotBetween(Integer value1, Integer value2) {
            addCriterion("csv_machine not between", value1, value2, "csvMachine");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesIsNull() {
            addCriterion("csv_machines is null");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesIsNotNull() {
            addCriterion("csv_machines is not null");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesEqualTo(String value) {
            addCriterion("csv_machines =", value, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesNotEqualTo(String value) {
            addCriterion("csv_machines <>", value, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesGreaterThan(String value) {
            addCriterion("csv_machines >", value, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesGreaterThanOrEqualTo(String value) {
            addCriterion("csv_machines >=", value, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesLessThan(String value) {
            addCriterion("csv_machines <", value, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesLessThanOrEqualTo(String value) {
            addCriterion("csv_machines <=", value, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesLike(String value) {
            addCriterion("csv_machines like", value, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesNotLike(String value) {
            addCriterion("csv_machines not like", value, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesIn(List<String> values) {
            addCriterion("csv_machines in", values, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesNotIn(List<String> values) {
            addCriterion("csv_machines not in", values, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesBetween(String value1, String value2) {
            addCriterion("csv_machines between", value1, value2, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvMachinesNotBetween(String value1, String value2) {
            addCriterion("csv_machines not between", value1, value2, "csvMachines");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeIsNull() {
            addCriterion("csv_color_code is null");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeIsNotNull() {
            addCriterion("csv_color_code is not null");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeEqualTo(Byte value) {
            addCriterion("csv_color_code =", value, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeNotEqualTo(Byte value) {
            addCriterion("csv_color_code <>", value, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeGreaterThan(Byte value) {
            addCriterion("csv_color_code >", value, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("csv_color_code >=", value, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeLessThan(Byte value) {
            addCriterion("csv_color_code <", value, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeLessThanOrEqualTo(Byte value) {
            addCriterion("csv_color_code <=", value, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeIn(List<Byte> values) {
            addCriterion("csv_color_code in", values, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeNotIn(List<Byte> values) {
            addCriterion("csv_color_code not in", values, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeBetween(Byte value1, Byte value2) {
            addCriterion("csv_color_code between", value1, value2, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvColorCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("csv_color_code not between", value1, value2, "csvColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeIsNull() {
            addCriterion("csv_bataccu_code is null");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeIsNotNull() {
            addCriterion("csv_bataccu_code is not null");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeEqualTo(String value) {
            addCriterion("csv_bataccu_code =", value, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeNotEqualTo(String value) {
            addCriterion("csv_bataccu_code <>", value, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeGreaterThan(String value) {
            addCriterion("csv_bataccu_code >", value, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeGreaterThanOrEqualTo(String value) {
            addCriterion("csv_bataccu_code >=", value, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeLessThan(String value) {
            addCriterion("csv_bataccu_code <", value, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeLessThanOrEqualTo(String value) {
            addCriterion("csv_bataccu_code <=", value, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeLike(String value) {
            addCriterion("csv_bataccu_code like", value, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeNotLike(String value) {
            addCriterion("csv_bataccu_code not like", value, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeIn(List<String> values) {
            addCriterion("csv_bataccu_code in", values, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeNotIn(List<String> values) {
            addCriterion("csv_bataccu_code not in", values, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeBetween(String value1, String value2) {
            addCriterion("csv_bataccu_code between", value1, value2, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvBataccuCodeNotBetween(String value1, String value2) {
            addCriterion("csv_bataccu_code not between", value1, value2, "csvBataccuCode");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateIsNull() {
            addCriterion("csv_prod_date is null");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateIsNotNull() {
            addCriterion("csv_prod_date is not null");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateEqualTo(Date value) {
            addCriterionForJDBCDate("csv_prod_date =", value, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("csv_prod_date <>", value, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateGreaterThan(Date value) {
            addCriterionForJDBCDate("csv_prod_date >", value, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csv_prod_date >=", value, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateLessThan(Date value) {
            addCriterionForJDBCDate("csv_prod_date <", value, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("csv_prod_date <=", value, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateIn(List<Date> values) {
            addCriterionForJDBCDate("csv_prod_date in", values, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("csv_prod_date not in", values, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csv_prod_date between", value1, value2, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvProdDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("csv_prod_date not between", value1, value2, "csvProdDate");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkIsNull() {
            addCriterion("csv_landmark is null");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkIsNotNull() {
            addCriterion("csv_landmark is not null");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkEqualTo(String value) {
            addCriterion("csv_landmark =", value, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkNotEqualTo(String value) {
            addCriterion("csv_landmark <>", value, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkGreaterThan(String value) {
            addCriterion("csv_landmark >", value, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkGreaterThanOrEqualTo(String value) {
            addCriterion("csv_landmark >=", value, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkLessThan(String value) {
            addCriterion("csv_landmark <", value, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkLessThanOrEqualTo(String value) {
            addCriterion("csv_landmark <=", value, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkLike(String value) {
            addCriterion("csv_landmark like", value, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkNotLike(String value) {
            addCriterion("csv_landmark not like", value, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkIn(List<String> values) {
            addCriterion("csv_landmark in", values, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkNotIn(List<String> values) {
            addCriterion("csv_landmark not in", values, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkBetween(String value1, String value2) {
            addCriterion("csv_landmark between", value1, value2, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvLandmarkNotBetween(String value1, String value2) {
            addCriterion("csv_landmark not between", value1, value2, "csvLandmark");
            return (Criteria) this;
        }

        public Criteria andCsvDomainIsNull() {
            addCriterion("csv_domain is null");
            return (Criteria) this;
        }

        public Criteria andCsvDomainIsNotNull() {
            addCriterion("csv_domain is not null");
            return (Criteria) this;
        }

        public Criteria andCsvDomainEqualTo(Byte value) {
            addCriterion("csv_domain =", value, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainNotEqualTo(Byte value) {
            addCriterion("csv_domain <>", value, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainGreaterThan(Byte value) {
            addCriterion("csv_domain >", value, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainGreaterThanOrEqualTo(Byte value) {
            addCriterion("csv_domain >=", value, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainLessThan(Byte value) {
            addCriterion("csv_domain <", value, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainLessThanOrEqualTo(Byte value) {
            addCriterion("csv_domain <=", value, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainIn(List<Byte> values) {
            addCriterion("csv_domain in", values, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainNotIn(List<Byte> values) {
            addCriterion("csv_domain not in", values, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainBetween(Byte value1, Byte value2) {
            addCriterion("csv_domain between", value1, value2, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvDomainNotBetween(Byte value1, Byte value2) {
            addCriterion("csv_domain not between", value1, value2, "csvDomain");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullIsNull() {
            addCriterion("csv_model_code_full is null");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullIsNotNull() {
            addCriterion("csv_model_code_full is not null");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullEqualTo(String value) {
            addCriterion("csv_model_code_full =", value, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullNotEqualTo(String value) {
            addCriterion("csv_model_code_full <>", value, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullGreaterThan(String value) {
            addCriterion("csv_model_code_full >", value, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullGreaterThanOrEqualTo(String value) {
            addCriterion("csv_model_code_full >=", value, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullLessThan(String value) {
            addCriterion("csv_model_code_full <", value, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullLessThanOrEqualTo(String value) {
            addCriterion("csv_model_code_full <=", value, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullLike(String value) {
            addCriterion("csv_model_code_full like", value, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullNotLike(String value) {
            addCriterion("csv_model_code_full not like", value, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullIn(List<String> values) {
            addCriterion("csv_model_code_full in", values, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullNotIn(List<String> values) {
            addCriterion("csv_model_code_full not in", values, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullBetween(String value1, String value2) {
            addCriterion("csv_model_code_full between", value1, value2, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeFullNotBetween(String value1, String value2) {
            addCriterion("csv_model_code_full not between", value1, value2, "csvModelCodeFull");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleIsNull() {
            addCriterion("csv_model_code_simple is null");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleIsNotNull() {
            addCriterion("csv_model_code_simple is not null");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleEqualTo(String value) {
            addCriterion("csv_model_code_simple =", value, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleNotEqualTo(String value) {
            addCriterion("csv_model_code_simple <>", value, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleGreaterThan(String value) {
            addCriterion("csv_model_code_simple >", value, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleGreaterThanOrEqualTo(String value) {
            addCriterion("csv_model_code_simple >=", value, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleLessThan(String value) {
            addCriterion("csv_model_code_simple <", value, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleLessThanOrEqualTo(String value) {
            addCriterion("csv_model_code_simple <=", value, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleLike(String value) {
            addCriterion("csv_model_code_simple like", value, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleNotLike(String value) {
            addCriterion("csv_model_code_simple not like", value, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleIn(List<String> values) {
            addCriterion("csv_model_code_simple in", values, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleNotIn(List<String> values) {
            addCriterion("csv_model_code_simple not in", values, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleBetween(String value1, String value2) {
            addCriterion("csv_model_code_simple between", value1, value2, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvModelCodeSimpleNotBetween(String value1, String value2) {
            addCriterion("csv_model_code_simple not between", value1, value2, "csvModelCodeSimple");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeIsNull() {
            addCriterion("csv_interior_color_code is null");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeIsNotNull() {
            addCriterion("csv_interior_color_code is not null");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeEqualTo(String value) {
            addCriterion("csv_interior_color_code =", value, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeNotEqualTo(String value) {
            addCriterion("csv_interior_color_code <>", value, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeGreaterThan(String value) {
            addCriterion("csv_interior_color_code >", value, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("csv_interior_color_code >=", value, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeLessThan(String value) {
            addCriterion("csv_interior_color_code <", value, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeLessThanOrEqualTo(String value) {
            addCriterion("csv_interior_color_code <=", value, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeLike(String value) {
            addCriterion("csv_interior_color_code like", value, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeNotLike(String value) {
            addCriterion("csv_interior_color_code not like", value, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeIn(List<String> values) {
            addCriterion("csv_interior_color_code in", values, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeNotIn(List<String> values) {
            addCriterion("csv_interior_color_code not in", values, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeBetween(String value1, String value2) {
            addCriterion("csv_interior_color_code between", value1, value2, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvInteriorColorCodeNotBetween(String value1, String value2) {
            addCriterion("csv_interior_color_code not between", value1, value2, "csvInteriorColorCode");
            return (Criteria) this;
        }

        public Criteria andCsvStatusIsNull() {
            addCriterion("csv_status is null");
            return (Criteria) this;
        }

        public Criteria andCsvStatusIsNotNull() {
            addCriterion("csv_status is not null");
            return (Criteria) this;
        }

        public Criteria andCsvStatusEqualTo(Byte value) {
            addCriterion("csv_status =", value, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusNotEqualTo(Byte value) {
            addCriterion("csv_status <>", value, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusGreaterThan(Byte value) {
            addCriterion("csv_status >", value, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("csv_status >=", value, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusLessThan(Byte value) {
            addCriterion("csv_status <", value, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusLessThanOrEqualTo(Byte value) {
            addCriterion("csv_status <=", value, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusIn(List<Byte> values) {
            addCriterion("csv_status in", values, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusNotIn(List<Byte> values) {
            addCriterion("csv_status not in", values, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusBetween(Byte value1, Byte value2) {
            addCriterion("csv_status between", value1, value2, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("csv_status not between", value1, value2, "csvStatus");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeIsNull() {
            addCriterion("csv_add_time is null");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeIsNotNull() {
            addCriterion("csv_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeEqualTo(Date value) {
            addCriterion("csv_add_time =", value, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeNotEqualTo(Date value) {
            addCriterion("csv_add_time <>", value, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeGreaterThan(Date value) {
            addCriterion("csv_add_time >", value, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("csv_add_time >=", value, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeLessThan(Date value) {
            addCriterion("csv_add_time <", value, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("csv_add_time <=", value, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeIn(List<Date> values) {
            addCriterion("csv_add_time in", values, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeNotIn(List<Date> values) {
            addCriterion("csv_add_time not in", values, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeBetween(Date value1, Date value2) {
            addCriterion("csv_add_time between", value1, value2, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("csv_add_time not between", value1, value2, "csvAddTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeIsNull() {
            addCriterion("csv_update_time is null");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeIsNotNull() {
            addCriterion("csv_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeEqualTo(Date value) {
            addCriterion("csv_update_time =", value, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeNotEqualTo(Date value) {
            addCriterion("csv_update_time <>", value, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeGreaterThan(Date value) {
            addCriterion("csv_update_time >", value, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("csv_update_time >=", value, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeLessThan(Date value) {
            addCriterion("csv_update_time <", value, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("csv_update_time <=", value, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeIn(List<Date> values) {
            addCriterion("csv_update_time in", values, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeNotIn(List<Date> values) {
            addCriterion("csv_update_time not in", values, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("csv_update_time between", value1, value2, "csvUpdateTime");
            return (Criteria) this;
        }

        public Criteria andCsvUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("csv_update_time not between", value1, value2, "csvUpdateTime");
            return (Criteria) this;
        }
    }

    /**
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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