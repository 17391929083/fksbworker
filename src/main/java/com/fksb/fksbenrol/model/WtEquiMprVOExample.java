package com.fksb.fksbenrol.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtEquiMprVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtEquiMprVOExample() {
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

        public Criteria andMpNmIsNull() {
            addCriterion("MP_NM is null");
            return (Criteria) this;
        }

        public Criteria andMpNmIsNotNull() {
            addCriterion("MP_NM is not null");
            return (Criteria) this;
        }

        public Criteria andMpNmEqualTo(String value) {
            addCriterion("MP_NM =", value, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmNotEqualTo(String value) {
            addCriterion("MP_NM <>", value, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmGreaterThan(String value) {
            addCriterion("MP_NM >", value, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmGreaterThanOrEqualTo(String value) {
            addCriterion("MP_NM >=", value, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmLessThan(String value) {
            addCriterion("MP_NM <", value, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmLessThanOrEqualTo(String value) {
            addCriterion("MP_NM <=", value, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmLike(String value) {
            addCriterion("MP_NM like", value, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmNotLike(String value) {
            addCriterion("MP_NM not like", value, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmIn(List<String> values) {
            addCriterion("MP_NM in", values, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmNotIn(List<String> values) {
            addCriterion("MP_NM not in", values, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmBetween(String value1, String value2) {
            addCriterion("MP_NM between", value1, value2, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpNmNotBetween(String value1, String value2) {
            addCriterion("MP_NM not between", value1, value2, "mpNm");
            return (Criteria) this;
        }

        public Criteria andMpLocIsNull() {
            addCriterion("MP_LOC is null");
            return (Criteria) this;
        }

        public Criteria andMpLocIsNotNull() {
            addCriterion("MP_LOC is not null");
            return (Criteria) this;
        }

        public Criteria andMpLocEqualTo(String value) {
            addCriterion("MP_LOC =", value, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocNotEqualTo(String value) {
            addCriterion("MP_LOC <>", value, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocGreaterThan(String value) {
            addCriterion("MP_LOC >", value, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocGreaterThanOrEqualTo(String value) {
            addCriterion("MP_LOC >=", value, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocLessThan(String value) {
            addCriterion("MP_LOC <", value, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocLessThanOrEqualTo(String value) {
            addCriterion("MP_LOC <=", value, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocLike(String value) {
            addCriterion("MP_LOC like", value, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocNotLike(String value) {
            addCriterion("MP_LOC not like", value, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocIn(List<String> values) {
            addCriterion("MP_LOC in", values, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocNotIn(List<String> values) {
            addCriterion("MP_LOC not in", values, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocBetween(String value1, String value2) {
            addCriterion("MP_LOC between", value1, value2, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpLocNotBetween(String value1, String value2) {
            addCriterion("MP_LOC not between", value1, value2, "mpLoc");
            return (Criteria) this;
        }

        public Criteria andMpDateIsNull() {
            addCriterion("MP_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMpDateIsNotNull() {
            addCriterion("MP_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMpDateEqualTo(Date value) {
            addCriterion("MP_DATE =", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateNotEqualTo(Date value) {
            addCriterion("MP_DATE <>", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateGreaterThan(Date value) {
            addCriterion("MP_DATE >", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MP_DATE >=", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateLessThan(Date value) {
            addCriterion("MP_DATE <", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateLessThanOrEqualTo(Date value) {
            addCriterion("MP_DATE <=", value, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateIn(List<Date> values) {
            addCriterion("MP_DATE in", values, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateNotIn(List<Date> values) {
            addCriterion("MP_DATE not in", values, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateBetween(Date value1, Date value2) {
            addCriterion("MP_DATE between", value1, value2, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpDateNotBetween(Date value1, Date value2) {
            addCriterion("MP_DATE not between", value1, value2, "mpDate");
            return (Criteria) this;
        }

        public Criteria andMpUserIsNull() {
            addCriterion("MP_USER is null");
            return (Criteria) this;
        }

        public Criteria andMpUserIsNotNull() {
            addCriterion("MP_USER is not null");
            return (Criteria) this;
        }

        public Criteria andMpUserEqualTo(String value) {
            addCriterion("MP_USER =", value, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserNotEqualTo(String value) {
            addCriterion("MP_USER <>", value, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserGreaterThan(String value) {
            addCriterion("MP_USER >", value, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserGreaterThanOrEqualTo(String value) {
            addCriterion("MP_USER >=", value, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserLessThan(String value) {
            addCriterion("MP_USER <", value, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserLessThanOrEqualTo(String value) {
            addCriterion("MP_USER <=", value, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserLike(String value) {
            addCriterion("MP_USER like", value, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserNotLike(String value) {
            addCriterion("MP_USER not like", value, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserIn(List<String> values) {
            addCriterion("MP_USER in", values, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserNotIn(List<String> values) {
            addCriterion("MP_USER not in", values, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserBetween(String value1, String value2) {
            addCriterion("MP_USER between", value1, value2, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpUserNotBetween(String value1, String value2) {
            addCriterion("MP_USER not between", value1, value2, "mpUser");
            return (Criteria) this;
        }

        public Criteria andMpLongIsNull() {
            addCriterion("MP_LONG is null");
            return (Criteria) this;
        }

        public Criteria andMpLongIsNotNull() {
            addCriterion("MP_LONG is not null");
            return (Criteria) this;
        }

        public Criteria andMpLongEqualTo(BigDecimal value) {
            addCriterion("MP_LONG =", value, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongNotEqualTo(BigDecimal value) {
            addCriterion("MP_LONG <>", value, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongGreaterThan(BigDecimal value) {
            addCriterion("MP_LONG >", value, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MP_LONG >=", value, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongLessThan(BigDecimal value) {
            addCriterion("MP_LONG <", value, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MP_LONG <=", value, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongIn(List<BigDecimal> values) {
            addCriterion("MP_LONG in", values, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongNotIn(List<BigDecimal> values) {
            addCriterion("MP_LONG not in", values, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MP_LONG between", value1, value2, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MP_LONG not between", value1, value2, "mpLong");
            return (Criteria) this;
        }

        public Criteria andMpLatIsNull() {
            addCriterion("MP_LAT is null");
            return (Criteria) this;
        }

        public Criteria andMpLatIsNotNull() {
            addCriterion("MP_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andMpLatEqualTo(BigDecimal value) {
            addCriterion("MP_LAT =", value, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatNotEqualTo(BigDecimal value) {
            addCriterion("MP_LAT <>", value, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatGreaterThan(BigDecimal value) {
            addCriterion("MP_LAT >", value, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MP_LAT >=", value, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatLessThan(BigDecimal value) {
            addCriterion("MP_LAT <", value, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MP_LAT <=", value, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatIn(List<BigDecimal> values) {
            addCriterion("MP_LAT in", values, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatNotIn(List<BigDecimal> values) {
            addCriterion("MP_LAT not in", values, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MP_LAT between", value1, value2, "mpLat");
            return (Criteria) this;
        }

        public Criteria andMpLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MP_LAT not between", value1, value2, "mpLat");
            return (Criteria) this;
        }

        public Criteria andIsFatherIsNull() {
            addCriterion("IS_FATHER is null");
            return (Criteria) this;
        }

        public Criteria andIsFatherIsNotNull() {
            addCriterion("IS_FATHER is not null");
            return (Criteria) this;
        }

        public Criteria andIsFatherEqualTo(Boolean value) {
            addCriterion("IS_FATHER =", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherNotEqualTo(Boolean value) {
            addCriterion("IS_FATHER <>", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherGreaterThan(Boolean value) {
            addCriterion("IS_FATHER >", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IS_FATHER >=", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherLessThan(Boolean value) {
            addCriterion("IS_FATHER <", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherLessThanOrEqualTo(Boolean value) {
            addCriterion("IS_FATHER <=", value, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherIn(List<Boolean> values) {
            addCriterion("IS_FATHER in", values, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherNotIn(List<Boolean> values) {
            addCriterion("IS_FATHER not in", values, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FATHER between", value1, value2, "isFather");
            return (Criteria) this;
        }

        public Criteria andIsFatherNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IS_FATHER not between", value1, value2, "isFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherIsNull() {
            addCriterion("MP_FATHER is null");
            return (Criteria) this;
        }

        public Criteria andMpFatherIsNotNull() {
            addCriterion("MP_FATHER is not null");
            return (Criteria) this;
        }

        public Criteria andMpFatherEqualTo(String value) {
            addCriterion("MP_FATHER =", value, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherNotEqualTo(String value) {
            addCriterion("MP_FATHER <>", value, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherGreaterThan(String value) {
            addCriterion("MP_FATHER >", value, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherGreaterThanOrEqualTo(String value) {
            addCriterion("MP_FATHER >=", value, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherLessThan(String value) {
            addCriterion("MP_FATHER <", value, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherLessThanOrEqualTo(String value) {
            addCriterion("MP_FATHER <=", value, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherLike(String value) {
            addCriterion("MP_FATHER like", value, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherNotLike(String value) {
            addCriterion("MP_FATHER not like", value, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherIn(List<String> values) {
            addCriterion("MP_FATHER in", values, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherNotIn(List<String> values) {
            addCriterion("MP_FATHER not in", values, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherBetween(String value1, String value2) {
            addCriterion("MP_FATHER between", value1, value2, "mpFather");
            return (Criteria) this;
        }

        public Criteria andMpFatherNotBetween(String value1, String value2) {
            addCriterion("MP_FATHER not between", value1, value2, "mpFather");
            return (Criteria) this;
        }

        public Criteria andPrCdIsNull() {
            addCriterion("PR_CD is null");
            return (Criteria) this;
        }

        public Criteria andPrCdIsNotNull() {
            addCriterion("PR_CD is not null");
            return (Criteria) this;
        }

        public Criteria andPrCdEqualTo(String value) {
            addCriterion("PR_CD =", value, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdNotEqualTo(String value) {
            addCriterion("PR_CD <>", value, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdGreaterThan(String value) {
            addCriterion("PR_CD >", value, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdGreaterThanOrEqualTo(String value) {
            addCriterion("PR_CD >=", value, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdLessThan(String value) {
            addCriterion("PR_CD <", value, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdLessThanOrEqualTo(String value) {
            addCriterion("PR_CD <=", value, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdLike(String value) {
            addCriterion("PR_CD like", value, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdNotLike(String value) {
            addCriterion("PR_CD not like", value, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdIn(List<String> values) {
            addCriterion("PR_CD in", values, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdNotIn(List<String> values) {
            addCriterion("PR_CD not in", values, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdBetween(String value1, String value2) {
            addCriterion("PR_CD between", value1, value2, "prCd");
            return (Criteria) this;
        }

        public Criteria andPrCdNotBetween(String value1, String value2) {
            addCriterion("PR_CD not between", value1, value2, "prCd");
            return (Criteria) this;
        }

        public Criteria andCiCdIsNull() {
            addCriterion("CI_CD is null");
            return (Criteria) this;
        }

        public Criteria andCiCdIsNotNull() {
            addCriterion("CI_CD is not null");
            return (Criteria) this;
        }

        public Criteria andCiCdEqualTo(String value) {
            addCriterion("CI_CD =", value, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdNotEqualTo(String value) {
            addCriterion("CI_CD <>", value, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdGreaterThan(String value) {
            addCriterion("CI_CD >", value, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdGreaterThanOrEqualTo(String value) {
            addCriterion("CI_CD >=", value, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdLessThan(String value) {
            addCriterion("CI_CD <", value, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdLessThanOrEqualTo(String value) {
            addCriterion("CI_CD <=", value, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdLike(String value) {
            addCriterion("CI_CD like", value, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdNotLike(String value) {
            addCriterion("CI_CD not like", value, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdIn(List<String> values) {
            addCriterion("CI_CD in", values, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdNotIn(List<String> values) {
            addCriterion("CI_CD not in", values, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdBetween(String value1, String value2) {
            addCriterion("CI_CD between", value1, value2, "ciCd");
            return (Criteria) this;
        }

        public Criteria andCiCdNotBetween(String value1, String value2) {
            addCriterion("CI_CD not between", value1, value2, "ciCd");
            return (Criteria) this;
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

        public Criteria andSuCdIsNull() {
            addCriterion("SU_CD is null");
            return (Criteria) this;
        }

        public Criteria andSuCdIsNotNull() {
            addCriterion("SU_CD is not null");
            return (Criteria) this;
        }

        public Criteria andSuCdEqualTo(String value) {
            addCriterion("SU_CD =", value, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdNotEqualTo(String value) {
            addCriterion("SU_CD <>", value, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdGreaterThan(String value) {
            addCriterion("SU_CD >", value, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdGreaterThanOrEqualTo(String value) {
            addCriterion("SU_CD >=", value, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdLessThan(String value) {
            addCriterion("SU_CD <", value, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdLessThanOrEqualTo(String value) {
            addCriterion("SU_CD <=", value, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdLike(String value) {
            addCriterion("SU_CD like", value, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdNotLike(String value) {
            addCriterion("SU_CD not like", value, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdIn(List<String> values) {
            addCriterion("SU_CD in", values, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdNotIn(List<String> values) {
            addCriterion("SU_CD not in", values, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdBetween(String value1, String value2) {
            addCriterion("SU_CD between", value1, value2, "suCd");
            return (Criteria) this;
        }

        public Criteria andSuCdNotBetween(String value1, String value2) {
            addCriterion("SU_CD not between", value1, value2, "suCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdIsNull() {
            addCriterion("ORG_CD is null");
            return (Criteria) this;
        }

        public Criteria andOrgCdIsNotNull() {
            addCriterion("ORG_CD is not null");
            return (Criteria) this;
        }

        public Criteria andOrgCdEqualTo(String value) {
            addCriterion("ORG_CD =", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdNotEqualTo(String value) {
            addCriterion("ORG_CD <>", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdGreaterThan(String value) {
            addCriterion("ORG_CD >", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_CD >=", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdLessThan(String value) {
            addCriterion("ORG_CD <", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdLessThanOrEqualTo(String value) {
            addCriterion("ORG_CD <=", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdLike(String value) {
            addCriterion("ORG_CD like", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdNotLike(String value) {
            addCriterion("ORG_CD not like", value, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdIn(List<String> values) {
            addCriterion("ORG_CD in", values, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdNotIn(List<String> values) {
            addCriterion("ORG_CD not in", values, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdBetween(String value1, String value2) {
            addCriterion("ORG_CD between", value1, value2, "orgCd");
            return (Criteria) this;
        }

        public Criteria andOrgCdNotBetween(String value1, String value2) {
            addCriterion("ORG_CD not between", value1, value2, "orgCd");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNull() {
            addCriterion("CO_ID is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("CO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(Long value) {
            addCriterion("CO_ID =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(Long value) {
            addCriterion("CO_ID <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(Long value) {
            addCriterion("CO_ID >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CO_ID >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(Long value) {
            addCriterion("CO_ID <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(Long value) {
            addCriterion("CO_ID <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<Long> values) {
            addCriterion("CO_ID in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<Long> values) {
            addCriterion("CO_ID not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(Long value1, Long value2) {
            addCriterion("CO_ID between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(Long value1, Long value2) {
            addCriterion("CO_ID not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andFIndexIsNull() {
            addCriterion("F_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andFIndexIsNotNull() {
            addCriterion("F_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andFIndexEqualTo(Integer value) {
            addCriterion("F_INDEX =", value, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexNotEqualTo(Integer value) {
            addCriterion("F_INDEX <>", value, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexGreaterThan(Integer value) {
            addCriterion("F_INDEX >", value, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_INDEX >=", value, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexLessThan(Integer value) {
            addCriterion("F_INDEX <", value, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexLessThanOrEqualTo(Integer value) {
            addCriterion("F_INDEX <=", value, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexIn(List<Integer> values) {
            addCriterion("F_INDEX in", values, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexNotIn(List<Integer> values) {
            addCriterion("F_INDEX not in", values, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexBetween(Integer value1, Integer value2) {
            addCriterion("F_INDEX between", value1, value2, "fIndex");
            return (Criteria) this;
        }

        public Criteria andFIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("F_INDEX not between", value1, value2, "fIndex");
            return (Criteria) this;
        }

        public Criteria andEquiCdIsNull() {
            addCriterion("EQUI_CD is null");
            return (Criteria) this;
        }

        public Criteria andEquiCdIsNotNull() {
            addCriterion("EQUI_CD is not null");
            return (Criteria) this;
        }

        public Criteria andEquiCdEqualTo(String value) {
            addCriterion("EQUI_CD =", value, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdNotEqualTo(String value) {
            addCriterion("EQUI_CD <>", value, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdGreaterThan(String value) {
            addCriterion("EQUI_CD >", value, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdGreaterThanOrEqualTo(String value) {
            addCriterion("EQUI_CD >=", value, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdLessThan(String value) {
            addCriterion("EQUI_CD <", value, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdLessThanOrEqualTo(String value) {
            addCriterion("EQUI_CD <=", value, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdLike(String value) {
            addCriterion("EQUI_CD like", value, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdNotLike(String value) {
            addCriterion("EQUI_CD not like", value, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdIn(List<String> values) {
            addCriterion("EQUI_CD in", values, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdNotIn(List<String> values) {
            addCriterion("EQUI_CD not in", values, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdBetween(String value1, String value2) {
            addCriterion("EQUI_CD between", value1, value2, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiCdNotBetween(String value1, String value2) {
            addCriterion("EQUI_CD not between", value1, value2, "equiCd");
            return (Criteria) this;
        }

        public Criteria andEquiPicIsNull() {
            addCriterion("EQUI_PIC is null");
            return (Criteria) this;
        }

        public Criteria andEquiPicIsNotNull() {
            addCriterion("EQUI_PIC is not null");
            return (Criteria) this;
        }

        public Criteria andEquiPicEqualTo(String value) {
            addCriterion("EQUI_PIC =", value, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicNotEqualTo(String value) {
            addCriterion("EQUI_PIC <>", value, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicGreaterThan(String value) {
            addCriterion("EQUI_PIC >", value, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicGreaterThanOrEqualTo(String value) {
            addCriterion("EQUI_PIC >=", value, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicLessThan(String value) {
            addCriterion("EQUI_PIC <", value, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicLessThanOrEqualTo(String value) {
            addCriterion("EQUI_PIC <=", value, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicLike(String value) {
            addCriterion("EQUI_PIC like", value, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicNotLike(String value) {
            addCriterion("EQUI_PIC not like", value, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicIn(List<String> values) {
            addCriterion("EQUI_PIC in", values, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicNotIn(List<String> values) {
            addCriterion("EQUI_PIC not in", values, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicBetween(String value1, String value2) {
            addCriterion("EQUI_PIC between", value1, value2, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEquiPicNotBetween(String value1, String value2) {
            addCriterion("EQUI_PIC not between", value1, value2, "equiPic");
            return (Criteria) this;
        }

        public Criteria andEuqiIdIsNull() {
            addCriterion("EUQI_ID is null");
            return (Criteria) this;
        }

        public Criteria andEuqiIdIsNotNull() {
            addCriterion("EUQI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEuqiIdEqualTo(Long value) {
            addCriterion("EUQI_ID =", value, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdNotEqualTo(Long value) {
            addCriterion("EUQI_ID <>", value, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdGreaterThan(Long value) {
            addCriterion("EUQI_ID >", value, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("EUQI_ID >=", value, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdLessThan(Long value) {
            addCriterion("EUQI_ID <", value, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdLessThanOrEqualTo(Long value) {
            addCriterion("EUQI_ID <=", value, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdIn(List<Long> values) {
            addCriterion("EUQI_ID in", values, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdNotIn(List<Long> values) {
            addCriterion("EUQI_ID not in", values, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdBetween(Long value1, Long value2) {
            addCriterion("EUQI_ID between", value1, value2, "euqiId");
            return (Criteria) this;
        }

        public Criteria andEuqiIdNotBetween(Long value1, Long value2) {
            addCriterion("EUQI_ID not between", value1, value2, "euqiId");
            return (Criteria) this;
        }

        public Criteria andPSupLimitIsNull() {
            addCriterion("P_SUP_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andPSupLimitIsNotNull() {
            addCriterion("P_SUP_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andPSupLimitEqualTo(BigDecimal value) {
            addCriterion("P_SUP_LIMIT =", value, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitNotEqualTo(BigDecimal value) {
            addCriterion("P_SUP_LIMIT <>", value, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitGreaterThan(BigDecimal value) {
            addCriterion("P_SUP_LIMIT >", value, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P_SUP_LIMIT >=", value, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitLessThan(BigDecimal value) {
            addCriterion("P_SUP_LIMIT <", value, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("P_SUP_LIMIT <=", value, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitIn(List<BigDecimal> values) {
            addCriterion("P_SUP_LIMIT in", values, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitNotIn(List<BigDecimal> values) {
            addCriterion("P_SUP_LIMIT not in", values, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P_SUP_LIMIT between", value1, value2, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPSupLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P_SUP_LIMIT not between", value1, value2, "pSupLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitIsNull() {
            addCriterion("P_LOW_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andPLowLimitIsNotNull() {
            addCriterion("P_LOW_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andPLowLimitEqualTo(BigDecimal value) {
            addCriterion("P_LOW_LIMIT =", value, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitNotEqualTo(BigDecimal value) {
            addCriterion("P_LOW_LIMIT <>", value, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitGreaterThan(BigDecimal value) {
            addCriterion("P_LOW_LIMIT >", value, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("P_LOW_LIMIT >=", value, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitLessThan(BigDecimal value) {
            addCriterion("P_LOW_LIMIT <", value, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("P_LOW_LIMIT <=", value, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitIn(List<BigDecimal> values) {
            addCriterion("P_LOW_LIMIT in", values, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitNotIn(List<BigDecimal> values) {
            addCriterion("P_LOW_LIMIT not in", values, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P_LOW_LIMIT between", value1, value2, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andPLowLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("P_LOW_LIMIT not between", value1, value2, "pLowLimit");
            return (Criteria) this;
        }

        public Criteria andMpTypeIsNull() {
            addCriterion("MP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMpTypeIsNotNull() {
            addCriterion("MP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMpTypeEqualTo(Integer value) {
            addCriterion("MP_TYPE =", value, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeNotEqualTo(Integer value) {
            addCriterion("MP_TYPE <>", value, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeGreaterThan(Integer value) {
            addCriterion("MP_TYPE >", value, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MP_TYPE >=", value, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeLessThan(Integer value) {
            addCriterion("MP_TYPE <", value, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("MP_TYPE <=", value, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeIn(List<Integer> values) {
            addCriterion("MP_TYPE in", values, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeNotIn(List<Integer> values) {
            addCriterion("MP_TYPE not in", values, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeBetween(Integer value1, Integer value2) {
            addCriterion("MP_TYPE between", value1, value2, "mpType");
            return (Criteria) this;
        }

        public Criteria andMpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MP_TYPE not between", value1, value2, "mpType");
            return (Criteria) this;
        }

        public Criteria andEquiNmIsNull() {
            addCriterion("EQUI_NM is null");
            return (Criteria) this;
        }

        public Criteria andEquiNmIsNotNull() {
            addCriterion("EQUI_NM is not null");
            return (Criteria) this;
        }

        public Criteria andEquiNmEqualTo(String value) {
            addCriterion("EQUI_NM =", value, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmNotEqualTo(String value) {
            addCriterion("EQUI_NM <>", value, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmGreaterThan(String value) {
            addCriterion("EQUI_NM >", value, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmGreaterThanOrEqualTo(String value) {
            addCriterion("EQUI_NM >=", value, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmLessThan(String value) {
            addCriterion("EQUI_NM <", value, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmLessThanOrEqualTo(String value) {
            addCriterion("EQUI_NM <=", value, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmLike(String value) {
            addCriterion("EQUI_NM like", value, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmNotLike(String value) {
            addCriterion("EQUI_NM not like", value, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmIn(List<String> values) {
            addCriterion("EQUI_NM in", values, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmNotIn(List<String> values) {
            addCriterion("EQUI_NM not in", values, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmBetween(String value1, String value2) {
            addCriterion("EQUI_NM between", value1, value2, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiNmNotBetween(String value1, String value2) {
            addCriterion("EQUI_NM not between", value1, value2, "equiNm");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateIsNull() {
            addCriterion("EQUI_PROD_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateIsNotNull() {
            addCriterion("EQUI_PROD_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateEqualTo(Date value) {
            addCriterion("EQUI_PROD_DATE =", value, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateNotEqualTo(Date value) {
            addCriterion("EQUI_PROD_DATE <>", value, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateGreaterThan(Date value) {
            addCriterion("EQUI_PROD_DATE >", value, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateGreaterThanOrEqualTo(Date value) {
            addCriterion("EQUI_PROD_DATE >=", value, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateLessThan(Date value) {
            addCriterion("EQUI_PROD_DATE <", value, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateLessThanOrEqualTo(Date value) {
            addCriterion("EQUI_PROD_DATE <=", value, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateIn(List<Date> values) {
            addCriterion("EQUI_PROD_DATE in", values, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateNotIn(List<Date> values) {
            addCriterion("EQUI_PROD_DATE not in", values, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateBetween(Date value1, Date value2) {
            addCriterion("EQUI_PROD_DATE between", value1, value2, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiProdDateNotBetween(Date value1, Date value2) {
            addCriterion("EQUI_PROD_DATE not between", value1, value2, "equiProdDate");
            return (Criteria) this;
        }

        public Criteria andEquiSimIsNull() {
            addCriterion("EQUI_SIM is null");
            return (Criteria) this;
        }

        public Criteria andEquiSimIsNotNull() {
            addCriterion("EQUI_SIM is not null");
            return (Criteria) this;
        }

        public Criteria andEquiSimEqualTo(String value) {
            addCriterion("EQUI_SIM =", value, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimNotEqualTo(String value) {
            addCriterion("EQUI_SIM <>", value, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimGreaterThan(String value) {
            addCriterion("EQUI_SIM >", value, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimGreaterThanOrEqualTo(String value) {
            addCriterion("EQUI_SIM >=", value, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimLessThan(String value) {
            addCriterion("EQUI_SIM <", value, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimLessThanOrEqualTo(String value) {
            addCriterion("EQUI_SIM <=", value, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimLike(String value) {
            addCriterion("EQUI_SIM like", value, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimNotLike(String value) {
            addCriterion("EQUI_SIM not like", value, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimIn(List<String> values) {
            addCriterion("EQUI_SIM in", values, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimNotIn(List<String> values) {
            addCriterion("EQUI_SIM not in", values, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimBetween(String value1, String value2) {
            addCriterion("EQUI_SIM between", value1, value2, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSimNotBetween(String value1, String value2) {
            addCriterion("EQUI_SIM not between", value1, value2, "equiSim");
            return (Criteria) this;
        }

        public Criteria andEquiSpecIsNull() {
            addCriterion("EQUI_SPEC is null");
            return (Criteria) this;
        }

        public Criteria andEquiSpecIsNotNull() {
            addCriterion("EQUI_SPEC is not null");
            return (Criteria) this;
        }

        public Criteria andEquiSpecEqualTo(String value) {
            addCriterion("EQUI_SPEC =", value, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecNotEqualTo(String value) {
            addCriterion("EQUI_SPEC <>", value, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecGreaterThan(String value) {
            addCriterion("EQUI_SPEC >", value, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecGreaterThanOrEqualTo(String value) {
            addCriterion("EQUI_SPEC >=", value, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecLessThan(String value) {
            addCriterion("EQUI_SPEC <", value, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecLessThanOrEqualTo(String value) {
            addCriterion("EQUI_SPEC <=", value, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecLike(String value) {
            addCriterion("EQUI_SPEC like", value, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecNotLike(String value) {
            addCriterion("EQUI_SPEC not like", value, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecIn(List<String> values) {
            addCriterion("EQUI_SPEC in", values, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecNotIn(List<String> values) {
            addCriterion("EQUI_SPEC not in", values, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecBetween(String value1, String value2) {
            addCriterion("EQUI_SPEC between", value1, value2, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andEquiSpecNotBetween(String value1, String value2) {
            addCriterion("EQUI_SPEC not between", value1, value2, "equiSpec");
            return (Criteria) this;
        }

        public Criteria andMpUncdIsNull() {
            addCriterion("MP_UNCD is null");
            return (Criteria) this;
        }

        public Criteria andMpUncdIsNotNull() {
            addCriterion("MP_UNCD is not null");
            return (Criteria) this;
        }

        public Criteria andMpUncdEqualTo(String value) {
            addCriterion("MP_UNCD =", value, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdNotEqualTo(String value) {
            addCriterion("MP_UNCD <>", value, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdGreaterThan(String value) {
            addCriterion("MP_UNCD >", value, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdGreaterThanOrEqualTo(String value) {
            addCriterion("MP_UNCD >=", value, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdLessThan(String value) {
            addCriterion("MP_UNCD <", value, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdLessThanOrEqualTo(String value) {
            addCriterion("MP_UNCD <=", value, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdLike(String value) {
            addCriterion("MP_UNCD like", value, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdNotLike(String value) {
            addCriterion("MP_UNCD not like", value, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdIn(List<String> values) {
            addCriterion("MP_UNCD in", values, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdNotIn(List<String> values) {
            addCriterion("MP_UNCD not in", values, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdBetween(String value1, String value2) {
            addCriterion("MP_UNCD between", value1, value2, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andMpUncdNotBetween(String value1, String value2) {
            addCriterion("MP_UNCD not between", value1, value2, "mpUncd");
            return (Criteria) this;
        }

        public Criteria andStatesIsNull() {
            addCriterion("STATES is null");
            return (Criteria) this;
        }

        public Criteria andStatesIsNotNull() {
            addCriterion("STATES is not null");
            return (Criteria) this;
        }

        public Criteria andStatesEqualTo(Integer value) {
            addCriterion("STATES =", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotEqualTo(Integer value) {
            addCriterion("STATES <>", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThan(Integer value) {
            addCriterion("STATES >", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATES >=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThan(Integer value) {
            addCriterion("STATES <", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesLessThanOrEqualTo(Integer value) {
            addCriterion("STATES <=", value, "states");
            return (Criteria) this;
        }

        public Criteria andStatesIn(List<Integer> values) {
            addCriterion("STATES in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotIn(List<Integer> values) {
            addCriterion("STATES not in", values, "states");
            return (Criteria) this;
        }

        public Criteria andStatesBetween(Integer value1, Integer value2) {
            addCriterion("STATES between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andStatesNotBetween(Integer value1, Integer value2) {
            addCriterion("STATES not between", value1, value2, "states");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNull() {
            addCriterion("UP_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpTimeIsNotNull() {
            addCriterion("UP_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpTimeEqualTo(Date value) {
            addCriterion("UP_TIME =", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotEqualTo(Date value) {
            addCriterion("UP_TIME <>", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThan(Date value) {
            addCriterion("UP_TIME >", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UP_TIME >=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThan(Date value) {
            addCriterion("UP_TIME <", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeLessThanOrEqualTo(Date value) {
            addCriterion("UP_TIME <=", value, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeIn(List<Date> values) {
            addCriterion("UP_TIME in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotIn(List<Date> values) {
            addCriterion("UP_TIME not in", values, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeBetween(Date value1, Date value2) {
            addCriterion("UP_TIME between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andUpTimeNotBetween(Date value1, Date value2) {
            addCriterion("UP_TIME not between", value1, value2, "upTime");
            return (Criteria) this;
        }

        public Criteria andConfigIsNull() {
            addCriterion("CONFIG is null");
            return (Criteria) this;
        }

        public Criteria andConfigIsNotNull() {
            addCriterion("CONFIG is not null");
            return (Criteria) this;
        }

        public Criteria andConfigEqualTo(Integer value) {
            addCriterion("CONFIG =", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotEqualTo(Integer value) {
            addCriterion("CONFIG <>", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThan(Integer value) {
            addCriterion("CONFIG >", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONFIG >=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThan(Integer value) {
            addCriterion("CONFIG <", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigLessThanOrEqualTo(Integer value) {
            addCriterion("CONFIG <=", value, "config");
            return (Criteria) this;
        }

        public Criteria andConfigIn(List<Integer> values) {
            addCriterion("CONFIG in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotIn(List<Integer> values) {
            addCriterion("CONFIG not in", values, "config");
            return (Criteria) this;
        }

        public Criteria andConfigBetween(Integer value1, Integer value2) {
            addCriterion("CONFIG between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andConfigNotBetween(Integer value1, Integer value2) {
            addCriterion("CONFIG not between", value1, value2, "config");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsIsNull() {
            addCriterion("MONITOR_ELEMENTS is null");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsIsNotNull() {
            addCriterion("MONITOR_ELEMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsEqualTo(String value) {
            addCriterion("MONITOR_ELEMENTS =", value, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsNotEqualTo(String value) {
            addCriterion("MONITOR_ELEMENTS <>", value, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsGreaterThan(String value) {
            addCriterion("MONITOR_ELEMENTS >", value, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsGreaterThanOrEqualTo(String value) {
            addCriterion("MONITOR_ELEMENTS >=", value, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsLessThan(String value) {
            addCriterion("MONITOR_ELEMENTS <", value, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsLessThanOrEqualTo(String value) {
            addCriterion("MONITOR_ELEMENTS <=", value, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsLike(String value) {
            addCriterion("MONITOR_ELEMENTS like", value, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsNotLike(String value) {
            addCriterion("MONITOR_ELEMENTS not like", value, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsIn(List<String> values) {
            addCriterion("MONITOR_ELEMENTS in", values, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsNotIn(List<String> values) {
            addCriterion("MONITOR_ELEMENTS not in", values, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsBetween(String value1, String value2) {
            addCriterion("MONITOR_ELEMENTS between", value1, value2, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andMonitorElementsNotBetween(String value1, String value2) {
            addCriterion("MONITOR_ELEMENTS not between", value1, value2, "monitorElements");
            return (Criteria) this;
        }

        public Criteria andSytLongIsNull() {
            addCriterion("SYT_LONG is null");
            return (Criteria) this;
        }

        public Criteria andSytLongIsNotNull() {
            addCriterion("SYT_LONG is not null");
            return (Criteria) this;
        }

        public Criteria andSytLongEqualTo(BigDecimal value) {
            addCriterion("SYT_LONG =", value, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongNotEqualTo(BigDecimal value) {
            addCriterion("SYT_LONG <>", value, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongGreaterThan(BigDecimal value) {
            addCriterion("SYT_LONG >", value, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYT_LONG >=", value, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongLessThan(BigDecimal value) {
            addCriterion("SYT_LONG <", value, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYT_LONG <=", value, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongIn(List<BigDecimal> values) {
            addCriterion("SYT_LONG in", values, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongNotIn(List<BigDecimal> values) {
            addCriterion("SYT_LONG not in", values, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYT_LONG between", value1, value2, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLongNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYT_LONG not between", value1, value2, "sytLong");
            return (Criteria) this;
        }

        public Criteria andSytLatIsNull() {
            addCriterion("SYT_LAT is null");
            return (Criteria) this;
        }

        public Criteria andSytLatIsNotNull() {
            addCriterion("SYT_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andSytLatEqualTo(BigDecimal value) {
            addCriterion("SYT_LAT =", value, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatNotEqualTo(BigDecimal value) {
            addCriterion("SYT_LAT <>", value, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatGreaterThan(BigDecimal value) {
            addCriterion("SYT_LAT >", value, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SYT_LAT >=", value, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatLessThan(BigDecimal value) {
            addCriterion("SYT_LAT <", value, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SYT_LAT <=", value, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatIn(List<BigDecimal> values) {
            addCriterion("SYT_LAT in", values, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatNotIn(List<BigDecimal> values) {
            addCriterion("SYT_LAT not in", values, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYT_LAT between", value1, value2, "sytLat");
            return (Criteria) this;
        }

        public Criteria andSytLatNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SYT_LAT not between", value1, value2, "sytLat");
            return (Criteria) this;
        }

        public Criteria andEquiStatesIsNull() {
            addCriterion("EQUI_STATES is null");
            return (Criteria) this;
        }

        public Criteria andEquiStatesIsNotNull() {
            addCriterion("EQUI_STATES is not null");
            return (Criteria) this;
        }

        public Criteria andEquiStatesEqualTo(Integer value) {
            addCriterion("EQUI_STATES =", value, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesNotEqualTo(Integer value) {
            addCriterion("EQUI_STATES <>", value, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesGreaterThan(Integer value) {
            addCriterion("EQUI_STATES >", value, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("EQUI_STATES >=", value, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesLessThan(Integer value) {
            addCriterion("EQUI_STATES <", value, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesLessThanOrEqualTo(Integer value) {
            addCriterion("EQUI_STATES <=", value, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesIn(List<Integer> values) {
            addCriterion("EQUI_STATES in", values, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesNotIn(List<Integer> values) {
            addCriterion("EQUI_STATES not in", values, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesBetween(Integer value1, Integer value2) {
            addCriterion("EQUI_STATES between", value1, value2, "equiStates");
            return (Criteria) this;
        }

        public Criteria andEquiStatesNotBetween(Integer value1, Integer value2) {
            addCriterion("EQUI_STATES not between", value1, value2, "equiStates");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdIsNull() {
            addCriterion("YCZDJ_DIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdIsNotNull() {
            addCriterion("YCZDJ_DIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdEqualTo(Long value) {
            addCriterion("YCZDJ_DIC_ID =", value, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdNotEqualTo(Long value) {
            addCriterion("YCZDJ_DIC_ID <>", value, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdGreaterThan(Long value) {
            addCriterion("YCZDJ_DIC_ID >", value, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdGreaterThanOrEqualTo(Long value) {
            addCriterion("YCZDJ_DIC_ID >=", value, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdLessThan(Long value) {
            addCriterion("YCZDJ_DIC_ID <", value, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdLessThanOrEqualTo(Long value) {
            addCriterion("YCZDJ_DIC_ID <=", value, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdIn(List<Long> values) {
            addCriterion("YCZDJ_DIC_ID in", values, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdNotIn(List<Long> values) {
            addCriterion("YCZDJ_DIC_ID not in", values, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdBetween(Long value1, Long value2) {
            addCriterion("YCZDJ_DIC_ID between", value1, value2, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andYczdjDicIdNotBetween(Long value1, Long value2) {
            addCriterion("YCZDJ_DIC_ID not between", value1, value2, "yczdjDicId");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkIsNull() {
            addCriterion("DEV_VER_MARK is null");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkIsNotNull() {
            addCriterion("DEV_VER_MARK is not null");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkEqualTo(Short value) {
            addCriterion("DEV_VER_MARK =", value, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkNotEqualTo(Short value) {
            addCriterion("DEV_VER_MARK <>", value, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkGreaterThan(Short value) {
            addCriterion("DEV_VER_MARK >", value, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkGreaterThanOrEqualTo(Short value) {
            addCriterion("DEV_VER_MARK >=", value, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkLessThan(Short value) {
            addCriterion("DEV_VER_MARK <", value, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkLessThanOrEqualTo(Short value) {
            addCriterion("DEV_VER_MARK <=", value, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkIn(List<Short> values) {
            addCriterion("DEV_VER_MARK in", values, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkNotIn(List<Short> values) {
            addCriterion("DEV_VER_MARK not in", values, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkBetween(Short value1, Short value2) {
            addCriterion("DEV_VER_MARK between", value1, value2, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andDevVerMarkNotBetween(Short value1, Short value2) {
            addCriterion("DEV_VER_MARK not between", value1, value2, "devVerMark");
            return (Criteria) this;
        }

        public Criteria andMpSortIsNull() {
            addCriterion("MP_SORT is null");
            return (Criteria) this;
        }

        public Criteria andMpSortIsNotNull() {
            addCriterion("MP_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andMpSortEqualTo(Long value) {
            addCriterion("MP_SORT =", value, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortNotEqualTo(Long value) {
            addCriterion("MP_SORT <>", value, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortGreaterThan(Long value) {
            addCriterion("MP_SORT >", value, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortGreaterThanOrEqualTo(Long value) {
            addCriterion("MP_SORT >=", value, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortLessThan(Long value) {
            addCriterion("MP_SORT <", value, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortLessThanOrEqualTo(Long value) {
            addCriterion("MP_SORT <=", value, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortIn(List<Long> values) {
            addCriterion("MP_SORT in", values, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortNotIn(List<Long> values) {
            addCriterion("MP_SORT not in", values, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortBetween(Long value1, Long value2) {
            addCriterion("MP_SORT between", value1, value2, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpSortNotBetween(Long value1, Long value2) {
            addCriterion("MP_SORT not between", value1, value2, "mpSort");
            return (Criteria) this;
        }

        public Criteria andMpCaliIsNull() {
            addCriterion("MP_CALI is null");
            return (Criteria) this;
        }

        public Criteria andMpCaliIsNotNull() {
            addCriterion("MP_CALI is not null");
            return (Criteria) this;
        }

        public Criteria andMpCaliEqualTo(String value) {
            addCriterion("MP_CALI =", value, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliNotEqualTo(String value) {
            addCriterion("MP_CALI <>", value, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliGreaterThan(String value) {
            addCriterion("MP_CALI >", value, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliGreaterThanOrEqualTo(String value) {
            addCriterion("MP_CALI >=", value, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliLessThan(String value) {
            addCriterion("MP_CALI <", value, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliLessThanOrEqualTo(String value) {
            addCriterion("MP_CALI <=", value, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliLike(String value) {
            addCriterion("MP_CALI like", value, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliNotLike(String value) {
            addCriterion("MP_CALI not like", value, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliIn(List<String> values) {
            addCriterion("MP_CALI in", values, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliNotIn(List<String> values) {
            addCriterion("MP_CALI not in", values, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliBetween(String value1, String value2) {
            addCriterion("MP_CALI between", value1, value2, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpCaliNotBetween(String value1, String value2) {
            addCriterion("MP_CALI not between", value1, value2, "mpCali");
            return (Criteria) this;
        }

        public Criteria andMpMunuceIsNull() {
            addCriterion("MP_MUNUCE is null");
            return (Criteria) this;
        }

        public Criteria andMpMunuceIsNotNull() {
            addCriterion("MP_MUNUCE is not null");
            return (Criteria) this;
        }

        public Criteria andMpMunuceEqualTo(String value) {
            addCriterion("MP_MUNUCE =", value, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceNotEqualTo(String value) {
            addCriterion("MP_MUNUCE <>", value, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceGreaterThan(String value) {
            addCriterion("MP_MUNUCE >", value, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceGreaterThanOrEqualTo(String value) {
            addCriterion("MP_MUNUCE >=", value, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceLessThan(String value) {
            addCriterion("MP_MUNUCE <", value, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceLessThanOrEqualTo(String value) {
            addCriterion("MP_MUNUCE <=", value, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceLike(String value) {
            addCriterion("MP_MUNUCE like", value, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceNotLike(String value) {
            addCriterion("MP_MUNUCE not like", value, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceIn(List<String> values) {
            addCriterion("MP_MUNUCE in", values, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceNotIn(List<String> values) {
            addCriterion("MP_MUNUCE not in", values, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceBetween(String value1, String value2) {
            addCriterion("MP_MUNUCE between", value1, value2, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andMpMunuceNotBetween(String value1, String value2) {
            addCriterion("MP_MUNUCE not between", value1, value2, "mpMunuce");
            return (Criteria) this;
        }

        public Criteria andPiclineIsNull() {
            addCriterion("PicLine is null");
            return (Criteria) this;
        }

        public Criteria andPiclineIsNotNull() {
            addCriterion("PicLine is not null");
            return (Criteria) this;
        }

        public Criteria andPiclineEqualTo(String value) {
            addCriterion("PicLine =", value, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineNotEqualTo(String value) {
            addCriterion("PicLine <>", value, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineGreaterThan(String value) {
            addCriterion("PicLine >", value, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineGreaterThanOrEqualTo(String value) {
            addCriterion("PicLine >=", value, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineLessThan(String value) {
            addCriterion("PicLine <", value, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineLessThanOrEqualTo(String value) {
            addCriterion("PicLine <=", value, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineLike(String value) {
            addCriterion("PicLine like", value, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineNotLike(String value) {
            addCriterion("PicLine not like", value, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineIn(List<String> values) {
            addCriterion("PicLine in", values, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineNotIn(List<String> values) {
            addCriterion("PicLine not in", values, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineBetween(String value1, String value2) {
            addCriterion("PicLine between", value1, value2, "picline");
            return (Criteria) this;
        }

        public Criteria andPiclineNotBetween(String value1, String value2) {
            addCriterion("PicLine not between", value1, value2, "picline");
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