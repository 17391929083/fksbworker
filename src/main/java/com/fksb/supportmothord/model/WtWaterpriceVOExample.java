package com.fksb.supportmothord.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WtWaterpriceVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtWaterpriceVOExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("PID is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("PID is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Long value) {
            addCriterion("PID =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Long value) {
            addCriterion("PID <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Long value) {
            addCriterion("PID >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Long value) {
            addCriterion("PID >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Long value) {
            addCriterion("PID <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Long value) {
            addCriterion("PID <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Long> values) {
            addCriterion("PID in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Long> values) {
            addCriterion("PID not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Long value1, Long value2) {
            addCriterion("PID between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Long value1, Long value2) {
            addCriterion("PID not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andWpNameIsNull() {
            addCriterion("WP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWpNameIsNotNull() {
            addCriterion("WP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWpNameEqualTo(String value) {
            addCriterion("WP_NAME =", value, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameNotEqualTo(String value) {
            addCriterion("WP_NAME <>", value, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameGreaterThan(String value) {
            addCriterion("WP_NAME >", value, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameGreaterThanOrEqualTo(String value) {
            addCriterion("WP_NAME >=", value, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameLessThan(String value) {
            addCriterion("WP_NAME <", value, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameLessThanOrEqualTo(String value) {
            addCriterion("WP_NAME <=", value, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameLike(String value) {
            addCriterion("WP_NAME like", value, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameNotLike(String value) {
            addCriterion("WP_NAME not like", value, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameIn(List<String> values) {
            addCriterion("WP_NAME in", values, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameNotIn(List<String> values) {
            addCriterion("WP_NAME not in", values, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameBetween(String value1, String value2) {
            addCriterion("WP_NAME between", value1, value2, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpNameNotBetween(String value1, String value2) {
            addCriterion("WP_NAME not between", value1, value2, "wpName");
            return (Criteria) this;
        }

        public Criteria andWpPriceIsNull() {
            addCriterion("WP_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andWpPriceIsNotNull() {
            addCriterion("WP_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andWpPriceEqualTo(BigDecimal value) {
            addCriterion("WP_PRICE =", value, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceNotEqualTo(BigDecimal value) {
            addCriterion("WP_PRICE <>", value, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceGreaterThan(BigDecimal value) {
            addCriterion("WP_PRICE >", value, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WP_PRICE >=", value, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceLessThan(BigDecimal value) {
            addCriterion("WP_PRICE <", value, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WP_PRICE <=", value, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceIn(List<BigDecimal> values) {
            addCriterion("WP_PRICE in", values, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceNotIn(List<BigDecimal> values) {
            addCriterion("WP_PRICE not in", values, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WP_PRICE between", value1, value2, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WP_PRICE not between", value1, value2, "wpPrice");
            return (Criteria) this;
        }

        public Criteria andWpDesIsNull() {
            addCriterion("WP_DES is null");
            return (Criteria) this;
        }

        public Criteria andWpDesIsNotNull() {
            addCriterion("WP_DES is not null");
            return (Criteria) this;
        }

        public Criteria andWpDesEqualTo(String value) {
            addCriterion("WP_DES =", value, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesNotEqualTo(String value) {
            addCriterion("WP_DES <>", value, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesGreaterThan(String value) {
            addCriterion("WP_DES >", value, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesGreaterThanOrEqualTo(String value) {
            addCriterion("WP_DES >=", value, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesLessThan(String value) {
            addCriterion("WP_DES <", value, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesLessThanOrEqualTo(String value) {
            addCriterion("WP_DES <=", value, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesLike(String value) {
            addCriterion("WP_DES like", value, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesNotLike(String value) {
            addCriterion("WP_DES not like", value, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesIn(List<String> values) {
            addCriterion("WP_DES in", values, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesNotIn(List<String> values) {
            addCriterion("WP_DES not in", values, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesBetween(String value1, String value2) {
            addCriterion("WP_DES between", value1, value2, "wpDes");
            return (Criteria) this;
        }

        public Criteria andWpDesNotBetween(String value1, String value2) {
            addCriterion("WP_DES not between", value1, value2, "wpDes");
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