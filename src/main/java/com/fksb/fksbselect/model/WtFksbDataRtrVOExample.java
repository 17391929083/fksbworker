package com.fksb.fksbselect.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtFksbDataRtrVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtFksbDataRtrVOExample() {
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

        public Criteria andDtTtIsNull() {
            addCriterion("DT_TT is null");
            return (Criteria) this;
        }

        public Criteria andDtTtIsNotNull() {
            addCriterion("DT_TT is not null");
            return (Criteria) this;
        }

        public Criteria andDtTtEqualTo(Date value) {
            addCriterion("DT_TT =", value, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtNotEqualTo(Date value) {
            addCriterion("DT_TT <>", value, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtGreaterThan(Date value) {
            addCriterion("DT_TT >", value, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtGreaterThanOrEqualTo(Date value) {
            addCriterion("DT_TT >=", value, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtLessThan(Date value) {
            addCriterion("DT_TT <", value, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtLessThanOrEqualTo(Date value) {
            addCriterion("DT_TT <=", value, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtIn(List<Date> values) {
            addCriterion("DT_TT in", values, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtNotIn(List<Date> values) {
            addCriterion("DT_TT not in", values, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtBetween(Date value1, Date value2) {
            addCriterion("DT_TT between", value1, value2, "dtTt");
            return (Criteria) this;
        }

        public Criteria andDtTtNotBetween(Date value1, Date value2) {
            addCriterion("DT_TT not between", value1, value2, "dtTt");
            return (Criteria) this;
        }

        public Criteria andTotalQtyIsNull() {
            addCriterion("TOTAL_QTY is null");
            return (Criteria) this;
        }

        public Criteria andTotalQtyIsNotNull() {
            addCriterion("TOTAL_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalQtyEqualTo(BigDecimal value) {
            addCriterion("TOTAL_QTY =", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_QTY <>", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_QTY >", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_QTY >=", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyLessThan(BigDecimal value) {
            addCriterion("TOTAL_QTY <", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_QTY <=", value, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyIn(List<BigDecimal> values) {
            addCriterion("TOTAL_QTY in", values, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_QTY not in", values, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_QTY between", value1, value2, "totalQty");
            return (Criteria) this;
        }

        public Criteria andTotalQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_QTY not between", value1, value2, "totalQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyIsNull() {
            addCriterion("SURPLUS_QTY is null");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyIsNotNull() {
            addCriterion("SURPLUS_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyEqualTo(BigDecimal value) {
            addCriterion("SURPLUS_QTY =", value, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyNotEqualTo(BigDecimal value) {
            addCriterion("SURPLUS_QTY <>", value, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyGreaterThan(BigDecimal value) {
            addCriterion("SURPLUS_QTY >", value, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SURPLUS_QTY >=", value, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyLessThan(BigDecimal value) {
            addCriterion("SURPLUS_QTY <", value, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SURPLUS_QTY <=", value, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyIn(List<BigDecimal> values) {
            addCriterion("SURPLUS_QTY in", values, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyNotIn(List<BigDecimal> values) {
            addCriterion("SURPLUS_QTY not in", values, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SURPLUS_QTY between", value1, value2, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andSurplusQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SURPLUS_QTY not between", value1, value2, "surplusQty");
            return (Criteria) this;
        }

        public Criteria andVIsNull() {
            addCriterion("V is null");
            return (Criteria) this;
        }

        public Criteria andVIsNotNull() {
            addCriterion("V is not null");
            return (Criteria) this;
        }

        public Criteria andVEqualTo(BigDecimal value) {
            addCriterion("V =", value, "v");
            return (Criteria) this;
        }

        public Criteria andVNotEqualTo(BigDecimal value) {
            addCriterion("V <>", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThan(BigDecimal value) {
            addCriterion("V >", value, "v");
            return (Criteria) this;
        }

        public Criteria andVGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("V >=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThan(BigDecimal value) {
            addCriterion("V <", value, "v");
            return (Criteria) this;
        }

        public Criteria andVLessThanOrEqualTo(BigDecimal value) {
            addCriterion("V <=", value, "v");
            return (Criteria) this;
        }

        public Criteria andVIn(List<BigDecimal> values) {
            addCriterion("V in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVNotIn(List<BigDecimal> values) {
            addCriterion("V not in", values, "v");
            return (Criteria) this;
        }

        public Criteria andVBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("V between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andVNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("V not between", value1, value2, "v");
            return (Criteria) this;
        }

        public Criteria andSignalsIsNull() {
            addCriterion("SIGNALS is null");
            return (Criteria) this;
        }

        public Criteria andSignalsIsNotNull() {
            addCriterion("SIGNALS is not null");
            return (Criteria) this;
        }

        public Criteria andSignalsEqualTo(Integer value) {
            addCriterion("SIGNALS =", value, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsNotEqualTo(Integer value) {
            addCriterion("SIGNALS <>", value, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsGreaterThan(Integer value) {
            addCriterion("SIGNALS >", value, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsGreaterThanOrEqualTo(Integer value) {
            addCriterion("SIGNALS >=", value, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsLessThan(Integer value) {
            addCriterion("SIGNALS <", value, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsLessThanOrEqualTo(Integer value) {
            addCriterion("SIGNALS <=", value, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsIn(List<Integer> values) {
            addCriterion("SIGNALS in", values, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsNotIn(List<Integer> values) {
            addCriterion("SIGNALS not in", values, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsBetween(Integer value1, Integer value2) {
            addCriterion("SIGNALS between", value1, value2, "signals");
            return (Criteria) this;
        }

        public Criteria andSignalsNotBetween(Integer value1, Integer value2) {
            addCriterion("SIGNALS not between", value1, value2, "signals");
            return (Criteria) this;
        }

        public Criteria andAlarmIsNull() {
            addCriterion("AlARM is null");
            return (Criteria) this;
        }

        public Criteria andAlarmIsNotNull() {
            addCriterion("AlARM is not null");
            return (Criteria) this;
        }

        public Criteria andAlarmEqualTo(Integer value) {
            addCriterion("AlARM =", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotEqualTo(Integer value) {
            addCriterion("AlARM <>", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmGreaterThan(Integer value) {
            addCriterion("AlARM >", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmGreaterThanOrEqualTo(Integer value) {
            addCriterion("AlARM >=", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmLessThan(Integer value) {
            addCriterion("AlARM <", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmLessThanOrEqualTo(Integer value) {
            addCriterion("AlARM <=", value, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmIn(List<Integer> values) {
            addCriterion("AlARM in", values, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotIn(List<Integer> values) {
            addCriterion("AlARM not in", values, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmBetween(Integer value1, Integer value2) {
            addCriterion("AlARM between", value1, value2, "alarm");
            return (Criteria) this;
        }

        public Criteria andAlarmNotBetween(Integer value1, Integer value2) {
            addCriterion("AlARM not between", value1, value2, "alarm");
            return (Criteria) this;
        }

        public Criteria andValveSIsNull() {
            addCriterion("VALVE_S is null");
            return (Criteria) this;
        }

        public Criteria andValveSIsNotNull() {
            addCriterion("VALVE_S is not null");
            return (Criteria) this;
        }

        public Criteria andValveSEqualTo(Integer value) {
            addCriterion("VALVE_S =", value, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSNotEqualTo(Integer value) {
            addCriterion("VALVE_S <>", value, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSGreaterThan(Integer value) {
            addCriterion("VALVE_S >", value, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSGreaterThanOrEqualTo(Integer value) {
            addCriterion("VALVE_S >=", value, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSLessThan(Integer value) {
            addCriterion("VALVE_S <", value, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSLessThanOrEqualTo(Integer value) {
            addCriterion("VALVE_S <=", value, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSIn(List<Integer> values) {
            addCriterion("VALVE_S in", values, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSNotIn(List<Integer> values) {
            addCriterion("VALVE_S not in", values, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSBetween(Integer value1, Integer value2) {
            addCriterion("VALVE_S between", value1, value2, "valveS");
            return (Criteria) this;
        }

        public Criteria andValveSNotBetween(Integer value1, Integer value2) {
            addCriterion("VALVE_S not between", value1, value2, "valveS");
            return (Criteria) this;
        }

        public Criteria andIsokIsNull() {
            addCriterion("ISOK is null");
            return (Criteria) this;
        }

        public Criteria andIsokIsNotNull() {
            addCriterion("ISOK is not null");
            return (Criteria) this;
        }

        public Criteria andIsokEqualTo(Integer value) {
            addCriterion("ISOK =", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotEqualTo(Integer value) {
            addCriterion("ISOK <>", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThan(Integer value) {
            addCriterion("ISOK >", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokGreaterThanOrEqualTo(Integer value) {
            addCriterion("ISOK >=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThan(Integer value) {
            addCriterion("ISOK <", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokLessThanOrEqualTo(Integer value) {
            addCriterion("ISOK <=", value, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokIn(List<Integer> values) {
            addCriterion("ISOK in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotIn(List<Integer> values) {
            addCriterion("ISOK not in", values, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokBetween(Integer value1, Integer value2) {
            addCriterion("ISOK between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andIsokNotBetween(Integer value1, Integer value2) {
            addCriterion("ISOK not between", value1, value2, "isok");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyIsNull() {
            addCriterion("PREVIOUS_MONTH_QTY is null");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyIsNotNull() {
            addCriterion("PREVIOUS_MONTH_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyEqualTo(BigDecimal value) {
            addCriterion("PREVIOUS_MONTH_QTY =", value, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyNotEqualTo(BigDecimal value) {
            addCriterion("PREVIOUS_MONTH_QTY <>", value, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyGreaterThan(BigDecimal value) {
            addCriterion("PREVIOUS_MONTH_QTY >", value, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PREVIOUS_MONTH_QTY >=", value, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyLessThan(BigDecimal value) {
            addCriterion("PREVIOUS_MONTH_QTY <", value, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PREVIOUS_MONTH_QTY <=", value, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyIn(List<BigDecimal> values) {
            addCriterion("PREVIOUS_MONTH_QTY in", values, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyNotIn(List<BigDecimal> values) {
            addCriterion("PREVIOUS_MONTH_QTY not in", values, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREVIOUS_MONTH_QTY between", value1, value2, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andPreviousMonthQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREVIOUS_MONTH_QTY not between", value1, value2, "previousMonthQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyIsNull() {
            addCriterion("MONTH_LAST_QTY is null");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyIsNotNull() {
            addCriterion("MONTH_LAST_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyEqualTo(BigDecimal value) {
            addCriterion("MONTH_LAST_QTY =", value, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyNotEqualTo(BigDecimal value) {
            addCriterion("MONTH_LAST_QTY <>", value, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyGreaterThan(BigDecimal value) {
            addCriterion("MONTH_LAST_QTY >", value, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_LAST_QTY >=", value, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyLessThan(BigDecimal value) {
            addCriterion("MONTH_LAST_QTY <", value, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_LAST_QTY <=", value, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyIn(List<BigDecimal> values) {
            addCriterion("MONTH_LAST_QTY in", values, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyNotIn(List<BigDecimal> values) {
            addCriterion("MONTH_LAST_QTY not in", values, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_LAST_QTY between", value1, value2, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthLastQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_LAST_QTY not between", value1, value2, "monthLastQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyIsNull() {
            addCriterion("MONTH_TOTAL_QTY is null");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyIsNotNull() {
            addCriterion("MONTH_TOTAL_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyEqualTo(BigDecimal value) {
            addCriterion("MONTH_TOTAL_QTY =", value, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyNotEqualTo(BigDecimal value) {
            addCriterion("MONTH_TOTAL_QTY <>", value, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyGreaterThan(BigDecimal value) {
            addCriterion("MONTH_TOTAL_QTY >", value, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_TOTAL_QTY >=", value, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyLessThan(BigDecimal value) {
            addCriterion("MONTH_TOTAL_QTY <", value, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MONTH_TOTAL_QTY <=", value, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyIn(List<BigDecimal> values) {
            addCriterion("MONTH_TOTAL_QTY in", values, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyNotIn(List<BigDecimal> values) {
            addCriterion("MONTH_TOTAL_QTY not in", values, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_TOTAL_QTY between", value1, value2, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andMonthTotalQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MONTH_TOTAL_QTY not between", value1, value2, "monthTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyIsNull() {
            addCriterion("YEAR_TOTAL_QTY is null");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyIsNotNull() {
            addCriterion("YEAR_TOTAL_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyEqualTo(BigDecimal value) {
            addCriterion("YEAR_TOTAL_QTY =", value, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyNotEqualTo(BigDecimal value) {
            addCriterion("YEAR_TOTAL_QTY <>", value, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyGreaterThan(BigDecimal value) {
            addCriterion("YEAR_TOTAL_QTY >", value, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_TOTAL_QTY >=", value, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyLessThan(BigDecimal value) {
            addCriterion("YEAR_TOTAL_QTY <", value, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("YEAR_TOTAL_QTY <=", value, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyIn(List<BigDecimal> values) {
            addCriterion("YEAR_TOTAL_QTY in", values, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyNotIn(List<BigDecimal> values) {
            addCriterion("YEAR_TOTAL_QTY not in", values, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_TOTAL_QTY between", value1, value2, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andYearTotalQtyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("YEAR_TOTAL_QTY not between", value1, value2, "yearTotalQty");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("SIGN is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("SIGN =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("SIGN <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("SIGN >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("SIGN <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("SIGN <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("SIGN like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("SIGN not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("SIGN in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("SIGN not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("SIGN between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("SIGN not between", value1, value2, "sign");
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

        public Criteria andAccumuWaterIsNull() {
            addCriterion("Accumu_Water is null");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterIsNotNull() {
            addCriterion("Accumu_Water is not null");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterEqualTo(Double value) {
            addCriterion("Accumu_Water =", value, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterNotEqualTo(Double value) {
            addCriterion("Accumu_Water <>", value, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterGreaterThan(Double value) {
            addCriterion("Accumu_Water >", value, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterGreaterThanOrEqualTo(Double value) {
            addCriterion("Accumu_Water >=", value, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterLessThan(Double value) {
            addCriterion("Accumu_Water <", value, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterLessThanOrEqualTo(Double value) {
            addCriterion("Accumu_Water <=", value, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterIn(List<Double> values) {
            addCriterion("Accumu_Water in", values, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterNotIn(List<Double> values) {
            addCriterion("Accumu_Water not in", values, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterBetween(Double value1, Double value2) {
            addCriterion("Accumu_Water between", value1, value2, "accumuWater");
            return (Criteria) this;
        }

        public Criteria andAccumuWaterNotBetween(Double value1, Double value2) {
            addCriterion("Accumu_Water not between", value1, value2, "accumuWater");
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