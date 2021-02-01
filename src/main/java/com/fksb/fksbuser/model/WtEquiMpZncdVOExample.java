package com.fksb.fksbuser.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WtEquiMpZncdVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtEquiMpZncdVOExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMpCdIsNull() {
            addCriterion("MP_CD is null");
            return (Criteria) this;
        }

        public Criteria andMpCdIsNotNull() {
            addCriterion("MP_CD is not null");
            return (Criteria) this;
        }

        public Criteria andMpCdEqualTo(String value) {
            addCriterion("MP_CD =", value, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdNotEqualTo(String value) {
            addCriterion("MP_CD <>", value, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdGreaterThan(String value) {
            addCriterion("MP_CD >", value, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdGreaterThanOrEqualTo(String value) {
            addCriterion("MP_CD >=", value, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdLessThan(String value) {
            addCriterion("MP_CD <", value, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdLessThanOrEqualTo(String value) {
            addCriterion("MP_CD <=", value, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdLike(String value) {
            addCriterion("MP_CD like", value, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdNotLike(String value) {
            addCriterion("MP_CD not like", value, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdIn(List<String> values) {
            addCriterion("MP_CD in", values, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdNotIn(List<String> values) {
            addCriterion("MP_CD not in", values, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdBetween(String value1, String value2) {
            addCriterion("MP_CD between", value1, value2, "mpCd");
            return (Criteria) this;
        }

        public Criteria andMpCdNotBetween(String value1, String value2) {
            addCriterion("MP_CD not between", value1, value2, "mpCd");
            return (Criteria) this;
        }

        public Criteria andTownidIsNull() {
            addCriterion("townId is null");
            return (Criteria) this;
        }

        public Criteria andTownidIsNotNull() {
            addCriterion("townId is not null");
            return (Criteria) this;
        }

        public Criteria andTownidEqualTo(Long value) {
            addCriterion("townId =", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotEqualTo(Long value) {
            addCriterion("townId <>", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidGreaterThan(Long value) {
            addCriterion("townId >", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidGreaterThanOrEqualTo(Long value) {
            addCriterion("townId >=", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLessThan(Long value) {
            addCriterion("townId <", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLessThanOrEqualTo(Long value) {
            addCriterion("townId <=", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidIn(List<Long> values) {
            addCriterion("townId in", values, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotIn(List<Long> values) {
            addCriterion("townId not in", values, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidBetween(Long value1, Long value2) {
            addCriterion("townId between", value1, value2, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotBetween(Long value1, Long value2) {
            addCriterion("townId not between", value1, value2, "townid");
            return (Criteria) this;
        }

        public Criteria andVillageidIsNull() {
            addCriterion("villageId is null");
            return (Criteria) this;
        }

        public Criteria andVillageidIsNotNull() {
            addCriterion("villageId is not null");
            return (Criteria) this;
        }

        public Criteria andVillageidEqualTo(Long value) {
            addCriterion("villageId =", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidNotEqualTo(Long value) {
            addCriterion("villageId <>", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidGreaterThan(Long value) {
            addCriterion("villageId >", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidGreaterThanOrEqualTo(Long value) {
            addCriterion("villageId >=", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidLessThan(Long value) {
            addCriterion("villageId <", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidLessThanOrEqualTo(Long value) {
            addCriterion("villageId <=", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidIn(List<Long> values) {
            addCriterion("villageId in", values, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidNotIn(List<Long> values) {
            addCriterion("villageId not in", values, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidBetween(Long value1, Long value2) {
            addCriterion("villageId between", value1, value2, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidNotBetween(Long value1, Long value2) {
            addCriterion("villageId not between", value1, value2, "villageid");
            return (Criteria) this;
        }

        public Criteria andHousenoIsNull() {
            addCriterion("houseNo is null");
            return (Criteria) this;
        }

        public Criteria andHousenoIsNotNull() {
            addCriterion("houseNo is not null");
            return (Criteria) this;
        }

        public Criteria andHousenoEqualTo(String value) {
            addCriterion("houseNo =", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotEqualTo(String value) {
            addCriterion("houseNo <>", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoGreaterThan(String value) {
            addCriterion("houseNo >", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoGreaterThanOrEqualTo(String value) {
            addCriterion("houseNo >=", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLessThan(String value) {
            addCriterion("houseNo <", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLessThanOrEqualTo(String value) {
            addCriterion("houseNo <=", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoLike(String value) {
            addCriterion("houseNo like", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotLike(String value) {
            addCriterion("houseNo not like", value, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoIn(List<String> values) {
            addCriterion("houseNo in", values, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotIn(List<String> values) {
            addCriterion("houseNo not in", values, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoBetween(String value1, String value2) {
            addCriterion("houseNo between", value1, value2, "houseno");
            return (Criteria) this;
        }

        public Criteria andHousenoNotBetween(String value1, String value2) {
            addCriterion("houseNo not between", value1, value2, "houseno");
            return (Criteria) this;
        }

        public Criteria andHouseholdIsNull() {
            addCriterion("household is null");
            return (Criteria) this;
        }

        public Criteria andHouseholdIsNotNull() {
            addCriterion("household is not null");
            return (Criteria) this;
        }

        public Criteria andHouseholdEqualTo(String value) {
            addCriterion("household =", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotEqualTo(String value) {
            addCriterion("household <>", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdGreaterThan(String value) {
            addCriterion("household >", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdGreaterThanOrEqualTo(String value) {
            addCriterion("household >=", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLessThan(String value) {
            addCriterion("household <", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLessThanOrEqualTo(String value) {
            addCriterion("household <=", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdLike(String value) {
            addCriterion("household like", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotLike(String value) {
            addCriterion("household not like", value, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdIn(List<String> values) {
            addCriterion("household in", values, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotIn(List<String> values) {
            addCriterion("household not in", values, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdBetween(String value1, String value2) {
            addCriterion("household between", value1, value2, "household");
            return (Criteria) this;
        }

        public Criteria andHouseholdNotBetween(String value1, String value2) {
            addCriterion("household not between", value1, value2, "household");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeIsNull() {
            addCriterion("waterMeterType is null");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeIsNotNull() {
            addCriterion("waterMeterType is not null");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeEqualTo(Short value) {
            addCriterion("waterMeterType =", value, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeNotEqualTo(Short value) {
            addCriterion("waterMeterType <>", value, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeGreaterThan(Short value) {
            addCriterion("waterMeterType >", value, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("waterMeterType >=", value, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeLessThan(Short value) {
            addCriterion("waterMeterType <", value, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeLessThanOrEqualTo(Short value) {
            addCriterion("waterMeterType <=", value, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeIn(List<Short> values) {
            addCriterion("waterMeterType in", values, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeNotIn(List<Short> values) {
            addCriterion("waterMeterType not in", values, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeBetween(Short value1, Short value2) {
            addCriterion("waterMeterType between", value1, value2, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatermetertypeNotBetween(Short value1, Short value2) {
            addCriterion("waterMeterType not between", value1, value2, "watermetertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeIsNull() {
            addCriterion("waterType is null");
            return (Criteria) this;
        }

        public Criteria andWatertypeIsNotNull() {
            addCriterion("waterType is not null");
            return (Criteria) this;
        }

        public Criteria andWatertypeEqualTo(Short value) {
            addCriterion("waterType =", value, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeNotEqualTo(Short value) {
            addCriterion("waterType <>", value, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeGreaterThan(Short value) {
            addCriterion("waterType >", value, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("waterType >=", value, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeLessThan(Short value) {
            addCriterion("waterType <", value, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeLessThanOrEqualTo(Short value) {
            addCriterion("waterType <=", value, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeIn(List<Short> values) {
            addCriterion("waterType in", values, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeNotIn(List<Short> values) {
            addCriterion("waterType not in", values, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeBetween(Short value1, Short value2) {
            addCriterion("waterType between", value1, value2, "watertype");
            return (Criteria) this;
        }

        public Criteria andWatertypeNotBetween(Short value1, Short value2) {
            addCriterion("waterType not between", value1, value2, "watertype");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(BigDecimal value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(BigDecimal value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(BigDecimal value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(BigDecimal value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<BigDecimal> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<BigDecimal> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andUsestateIsNull() {
            addCriterion("useState is null");
            return (Criteria) this;
        }

        public Criteria andUsestateIsNotNull() {
            addCriterion("useState is not null");
            return (Criteria) this;
        }

        public Criteria andUsestateEqualTo(Short value) {
            addCriterion("useState =", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateNotEqualTo(Short value) {
            addCriterion("useState <>", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateGreaterThan(Short value) {
            addCriterion("useState >", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateGreaterThanOrEqualTo(Short value) {
            addCriterion("useState >=", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateLessThan(Short value) {
            addCriterion("useState <", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateLessThanOrEqualTo(Short value) {
            addCriterion("useState <=", value, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateIn(List<Short> values) {
            addCriterion("useState in", values, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateNotIn(List<Short> values) {
            addCriterion("useState not in", values, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateBetween(Short value1, Short value2) {
            addCriterion("useState between", value1, value2, "usestate");
            return (Criteria) this;
        }

        public Criteria andUsestateNotBetween(Short value1, Short value2) {
            addCriterion("useState not between", value1, value2, "usestate");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }
    }

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