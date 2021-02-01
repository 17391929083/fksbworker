package com.fksb.fksbenrol.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtAdBVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtAdBVOExample() {
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

        public Criteria andAdCdIsNull() {
            addCriterion("AD_CD is null");
            return (Criteria) this;
        }

        public Criteria andAdCdIsNotNull() {
            addCriterion("AD_CD is not null");
            return (Criteria) this;
        }

        public Criteria andAdCdEqualTo(String value) {
            addCriterion("AD_CD =", value, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdNotEqualTo(String value) {
            addCriterion("AD_CD <>", value, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdGreaterThan(String value) {
            addCriterion("AD_CD >", value, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdGreaterThanOrEqualTo(String value) {
            addCriterion("AD_CD >=", value, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdLessThan(String value) {
            addCriterion("AD_CD <", value, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdLessThanOrEqualTo(String value) {
            addCriterion("AD_CD <=", value, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdLike(String value) {
            addCriterion("AD_CD like", value, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdNotLike(String value) {
            addCriterion("AD_CD not like", value, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdIn(List<String> values) {
            addCriterion("AD_CD in", values, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdNotIn(List<String> values) {
            addCriterion("AD_CD not in", values, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdBetween(String value1, String value2) {
            addCriterion("AD_CD between", value1, value2, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdCdNotBetween(String value1, String value2) {
            addCriterion("AD_CD not between", value1, value2, "adCd");
            return (Criteria) this;
        }

        public Criteria andAdNmIsNull() {
            addCriterion("AD_NM is null");
            return (Criteria) this;
        }

        public Criteria andAdNmIsNotNull() {
            addCriterion("AD_NM is not null");
            return (Criteria) this;
        }

        public Criteria andAdNmEqualTo(String value) {
            addCriterion("AD_NM =", value, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmNotEqualTo(String value) {
            addCriterion("AD_NM <>", value, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmGreaterThan(String value) {
            addCriterion("AD_NM >", value, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmGreaterThanOrEqualTo(String value) {
            addCriterion("AD_NM >=", value, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmLessThan(String value) {
            addCriterion("AD_NM <", value, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmLessThanOrEqualTo(String value) {
            addCriterion("AD_NM <=", value, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmLike(String value) {
            addCriterion("AD_NM like", value, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmNotLike(String value) {
            addCriterion("AD_NM not like", value, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmIn(List<String> values) {
            addCriterion("AD_NM in", values, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmNotIn(List<String> values) {
            addCriterion("AD_NM not in", values, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmBetween(String value1, String value2) {
            addCriterion("AD_NM between", value1, value2, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdNmNotBetween(String value1, String value2) {
            addCriterion("AD_NM not between", value1, value2, "adNm");
            return (Criteria) this;
        }

        public Criteria andAdShnmIsNull() {
            addCriterion("AD_SHNM is null");
            return (Criteria) this;
        }

        public Criteria andAdShnmIsNotNull() {
            addCriterion("AD_SHNM is not null");
            return (Criteria) this;
        }

        public Criteria andAdShnmEqualTo(String value) {
            addCriterion("AD_SHNM =", value, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmNotEqualTo(String value) {
            addCriterion("AD_SHNM <>", value, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmGreaterThan(String value) {
            addCriterion("AD_SHNM >", value, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmGreaterThanOrEqualTo(String value) {
            addCriterion("AD_SHNM >=", value, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmLessThan(String value) {
            addCriterion("AD_SHNM <", value, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmLessThanOrEqualTo(String value) {
            addCriterion("AD_SHNM <=", value, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmLike(String value) {
            addCriterion("AD_SHNM like", value, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmNotLike(String value) {
            addCriterion("AD_SHNM not like", value, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmIn(List<String> values) {
            addCriterion("AD_SHNM in", values, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmNotIn(List<String> values) {
            addCriterion("AD_SHNM not in", values, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmBetween(String value1, String value2) {
            addCriterion("AD_SHNM between", value1, value2, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdShnmNotBetween(String value1, String value2) {
            addCriterion("AD_SHNM not between", value1, value2, "adShnm");
            return (Criteria) this;
        }

        public Criteria andAdAIsNull() {
            addCriterion("AD_A is null");
            return (Criteria) this;
        }

        public Criteria andAdAIsNotNull() {
            addCriterion("AD_A is not null");
            return (Criteria) this;
        }

        public Criteria andAdAEqualTo(BigDecimal value) {
            addCriterion("AD_A =", value, "adA");
            return (Criteria) this;
        }

        public Criteria andAdANotEqualTo(BigDecimal value) {
            addCriterion("AD_A <>", value, "adA");
            return (Criteria) this;
        }

        public Criteria andAdAGreaterThan(BigDecimal value) {
            addCriterion("AD_A >", value, "adA");
            return (Criteria) this;
        }

        public Criteria andAdAGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AD_A >=", value, "adA");
            return (Criteria) this;
        }

        public Criteria andAdALessThan(BigDecimal value) {
            addCriterion("AD_A <", value, "adA");
            return (Criteria) this;
        }

        public Criteria andAdALessThanOrEqualTo(BigDecimal value) {
            addCriterion("AD_A <=", value, "adA");
            return (Criteria) this;
        }

        public Criteria andAdAIn(List<BigDecimal> values) {
            addCriterion("AD_A in", values, "adA");
            return (Criteria) this;
        }

        public Criteria andAdANotIn(List<BigDecimal> values) {
            addCriterion("AD_A not in", values, "adA");
            return (Criteria) this;
        }

        public Criteria andAdABetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AD_A between", value1, value2, "adA");
            return (Criteria) this;
        }

        public Criteria andAdANotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AD_A not between", value1, value2, "adA");
            return (Criteria) this;
        }

        public Criteria andOperCdIsNull() {
            addCriterion("OPER_CD is null");
            return (Criteria) this;
        }

        public Criteria andOperCdIsNotNull() {
            addCriterion("OPER_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOperCdEqualTo(String value) {
            addCriterion("OPER_CD =", value, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdNotEqualTo(String value) {
            addCriterion("OPER_CD <>", value, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdGreaterThan(String value) {
            addCriterion("OPER_CD >", value, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdGreaterThanOrEqualTo(String value) {
            addCriterion("OPER_CD >=", value, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdLessThan(String value) {
            addCriterion("OPER_CD <", value, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdLessThanOrEqualTo(String value) {
            addCriterion("OPER_CD <=", value, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdLike(String value) {
            addCriterion("OPER_CD like", value, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdNotLike(String value) {
            addCriterion("OPER_CD not like", value, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdIn(List<String> values) {
            addCriterion("OPER_CD in", values, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdNotIn(List<String> values) {
            addCriterion("OPER_CD not in", values, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdBetween(String value1, String value2) {
            addCriterion("OPER_CD between", value1, value2, "operCd");
            return (Criteria) this;
        }

        public Criteria andOperCdNotBetween(String value1, String value2) {
            addCriterion("OPER_CD not between", value1, value2, "operCd");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("TS is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("TS is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("TS =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("TS <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("TS >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("TS >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("TS <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("TS <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("TS in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("TS not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("TS between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("TS not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andNtIsNull() {
            addCriterion("NT is null");
            return (Criteria) this;
        }

        public Criteria andNtIsNotNull() {
            addCriterion("NT is not null");
            return (Criteria) this;
        }

        public Criteria andNtEqualTo(String value) {
            addCriterion("NT =", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtNotEqualTo(String value) {
            addCriterion("NT <>", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtGreaterThan(String value) {
            addCriterion("NT >", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtGreaterThanOrEqualTo(String value) {
            addCriterion("NT >=", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtLessThan(String value) {
            addCriterion("NT <", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtLessThanOrEqualTo(String value) {
            addCriterion("NT <=", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtLike(String value) {
            addCriterion("NT like", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtNotLike(String value) {
            addCriterion("NT not like", value, "nt");
            return (Criteria) this;
        }

        public Criteria andNtIn(List<String> values) {
            addCriterion("NT in", values, "nt");
            return (Criteria) this;
        }

        public Criteria andNtNotIn(List<String> values) {
            addCriterion("NT not in", values, "nt");
            return (Criteria) this;
        }

        public Criteria andNtBetween(String value1, String value2) {
            addCriterion("NT between", value1, value2, "nt");
            return (Criteria) this;
        }

        public Criteria andNtNotBetween(String value1, String value2) {
            addCriterion("NT not between", value1, value2, "nt");
            return (Criteria) this;
        }

        public Criteria andAdLongIsNull() {
            addCriterion("AD_LONG is null");
            return (Criteria) this;
        }

        public Criteria andAdLongIsNotNull() {
            addCriterion("AD_LONG is not null");
            return (Criteria) this;
        }

        public Criteria andAdLongEqualTo(BigDecimal value) {
            addCriterion("AD_LONG =", value, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongNotEqualTo(BigDecimal value) {
            addCriterion("AD_LONG <>", value, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongGreaterThan(BigDecimal value) {
            addCriterion("AD_LONG >", value, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AD_LONG >=", value, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongLessThan(BigDecimal value) {
            addCriterion("AD_LONG <", value, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AD_LONG <=", value, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongIn(List<BigDecimal> values) {
            addCriterion("AD_LONG in", values, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongNotIn(List<BigDecimal> values) {
            addCriterion("AD_LONG not in", values, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AD_LONG between", value1, value2, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AD_LONG not between", value1, value2, "adLong");
            return (Criteria) this;
        }

        public Criteria andAdLatIsNull() {
            addCriterion("AD_LAT is null");
            return (Criteria) this;
        }

        public Criteria andAdLatIsNotNull() {
            addCriterion("AD_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andAdLatEqualTo(BigDecimal value) {
            addCriterion("AD_LAT =", value, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatNotEqualTo(BigDecimal value) {
            addCriterion("AD_LAT <>", value, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatGreaterThan(BigDecimal value) {
            addCriterion("AD_LAT >", value, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AD_LAT >=", value, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatLessThan(BigDecimal value) {
            addCriterion("AD_LAT <", value, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AD_LAT <=", value, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatIn(List<BigDecimal> values) {
            addCriterion("AD_LAT in", values, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatNotIn(List<BigDecimal> values) {
            addCriterion("AD_LAT not in", values, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AD_LAT between", value1, value2, "adLat");
            return (Criteria) this;
        }

        public Criteria andAdLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AD_LAT not between", value1, value2, "adLat");
            return (Criteria) this;
        }

        public Criteria andParentCdIsNull() {
            addCriterion("PARENT_CD is null");
            return (Criteria) this;
        }

        public Criteria andParentCdIsNotNull() {
            addCriterion("PARENT_CD is not null");
            return (Criteria) this;
        }

        public Criteria andParentCdEqualTo(String value) {
            addCriterion("PARENT_CD =", value, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdNotEqualTo(String value) {
            addCriterion("PARENT_CD <>", value, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdGreaterThan(String value) {
            addCriterion("PARENT_CD >", value, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdGreaterThanOrEqualTo(String value) {
            addCriterion("PARENT_CD >=", value, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdLessThan(String value) {
            addCriterion("PARENT_CD <", value, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdLessThanOrEqualTo(String value) {
            addCriterion("PARENT_CD <=", value, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdLike(String value) {
            addCriterion("PARENT_CD like", value, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdNotLike(String value) {
            addCriterion("PARENT_CD not like", value, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdIn(List<String> values) {
            addCriterion("PARENT_CD in", values, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdNotIn(List<String> values) {
            addCriterion("PARENT_CD not in", values, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdBetween(String value1, String value2) {
            addCriterion("PARENT_CD between", value1, value2, "parentCd");
            return (Criteria) this;
        }

        public Criteria andParentCdNotBetween(String value1, String value2) {
            addCriterion("PARENT_CD not between", value1, value2, "parentCd");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNull() {
            addCriterion("isDisplay is null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIsNotNull() {
            addCriterion("isDisplay is not null");
            return (Criteria) this;
        }

        public Criteria andIsdisplayEqualTo(Short value) {
            addCriterion("isDisplay =", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotEqualTo(Short value) {
            addCriterion("isDisplay <>", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThan(Short value) {
            addCriterion("isDisplay >", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayGreaterThanOrEqualTo(Short value) {
            addCriterion("isDisplay >=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThan(Short value) {
            addCriterion("isDisplay <", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayLessThanOrEqualTo(Short value) {
            addCriterion("isDisplay <=", value, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayIn(List<Short> values) {
            addCriterion("isDisplay in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotIn(List<Short> values) {
            addCriterion("isDisplay not in", values, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayBetween(Short value1, Short value2) {
            addCriterion("isDisplay between", value1, value2, "isdisplay");
            return (Criteria) this;
        }

        public Criteria andIsdisplayNotBetween(Short value1, Short value2) {
            addCriterion("isDisplay not between", value1, value2, "isdisplay");
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