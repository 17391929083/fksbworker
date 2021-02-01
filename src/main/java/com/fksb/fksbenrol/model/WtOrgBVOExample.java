package com.fksb.fksbenrol.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WtOrgBVOExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WtOrgBVOExample() {
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

        public Criteria andOrgIdIsNull() {
            addCriterion("ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrgIdIsNotNull() {
            addCriterion("ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrgIdEqualTo(Long value) {
            addCriterion("ORG_ID =", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotEqualTo(Long value) {
            addCriterion("ORG_ID <>", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThan(Long value) {
            addCriterion("ORG_ID >", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ORG_ID >=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThan(Long value) {
            addCriterion("ORG_ID <", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("ORG_ID <=", value, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdIn(List<Long> values) {
            addCriterion("ORG_ID in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotIn(List<Long> values) {
            addCriterion("ORG_ID not in", values, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdBetween(Long value1, Long value2) {
            addCriterion("ORG_ID between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("ORG_ID not between", value1, value2, "orgId");
            return (Criteria) this;
        }

        public Criteria andSuporgidIsNull() {
            addCriterion("suporgid is null");
            return (Criteria) this;
        }

        public Criteria andSuporgidIsNotNull() {
            addCriterion("suporgid is not null");
            return (Criteria) this;
        }

        public Criteria andSuporgidEqualTo(Long value) {
            addCriterion("suporgid =", value, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidNotEqualTo(Long value) {
            addCriterion("suporgid <>", value, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidGreaterThan(Long value) {
            addCriterion("suporgid >", value, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidGreaterThanOrEqualTo(Long value) {
            addCriterion("suporgid >=", value, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidLessThan(Long value) {
            addCriterion("suporgid <", value, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidLessThanOrEqualTo(Long value) {
            addCriterion("suporgid <=", value, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidIn(List<Long> values) {
            addCriterion("suporgid in", values, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidNotIn(List<Long> values) {
            addCriterion("suporgid not in", values, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidBetween(Long value1, Long value2) {
            addCriterion("suporgid between", value1, value2, "suporgid");
            return (Criteria) this;
        }

        public Criteria andSuporgidNotBetween(Long value1, Long value2) {
            addCriterion("suporgid not between", value1, value2, "suporgid");
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

        public Criteria andOrgNmIsNull() {
            addCriterion("ORG_NM is null");
            return (Criteria) this;
        }

        public Criteria andOrgNmIsNotNull() {
            addCriterion("ORG_NM is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNmEqualTo(String value) {
            addCriterion("ORG_NM =", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmNotEqualTo(String value) {
            addCriterion("ORG_NM <>", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmGreaterThan(String value) {
            addCriterion("ORG_NM >", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NM >=", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmLessThan(String value) {
            addCriterion("ORG_NM <", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmLessThanOrEqualTo(String value) {
            addCriterion("ORG_NM <=", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmLike(String value) {
            addCriterion("ORG_NM like", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmNotLike(String value) {
            addCriterion("ORG_NM not like", value, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmIn(List<String> values) {
            addCriterion("ORG_NM in", values, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmNotIn(List<String> values) {
            addCriterion("ORG_NM not in", values, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmBetween(String value1, String value2) {
            addCriterion("ORG_NM between", value1, value2, "orgNm");
            return (Criteria) this;
        }

        public Criteria andOrgNmNotBetween(String value1, String value2) {
            addCriterion("ORG_NM not between", value1, value2, "orgNm");
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

        public Criteria andTownidIsNull() {
            addCriterion("townId is null");
            return (Criteria) this;
        }

        public Criteria andTownidIsNotNull() {
            addCriterion("townId is not null");
            return (Criteria) this;
        }

        public Criteria andTownidEqualTo(Integer value) {
            addCriterion("townId =", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotEqualTo(Integer value) {
            addCriterion("townId <>", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidGreaterThan(Integer value) {
            addCriterion("townId >", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidGreaterThanOrEqualTo(Integer value) {
            addCriterion("townId >=", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLessThan(Integer value) {
            addCriterion("townId <", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidLessThanOrEqualTo(Integer value) {
            addCriterion("townId <=", value, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidIn(List<Integer> values) {
            addCriterion("townId in", values, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotIn(List<Integer> values) {
            addCriterion("townId not in", values, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidBetween(Integer value1, Integer value2) {
            addCriterion("townId between", value1, value2, "townid");
            return (Criteria) this;
        }

        public Criteria andTownidNotBetween(Integer value1, Integer value2) {
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

        public Criteria andVillageidEqualTo(Integer value) {
            addCriterion("villageId =", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidNotEqualTo(Integer value) {
            addCriterion("villageId <>", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidGreaterThan(Integer value) {
            addCriterion("villageId >", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("villageId >=", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidLessThan(Integer value) {
            addCriterion("villageId <", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidLessThanOrEqualTo(Integer value) {
            addCriterion("villageId <=", value, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidIn(List<Integer> values) {
            addCriterion("villageId in", values, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidNotIn(List<Integer> values) {
            addCriterion("villageId not in", values, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidBetween(Integer value1, Integer value2) {
            addCriterion("villageId between", value1, value2, "villageid");
            return (Criteria) this;
        }

        public Criteria andVillageidNotBetween(Integer value1, Integer value2) {
            addCriterion("villageId not between", value1, value2, "villageid");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("projectId is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("projectId is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(Integer value) {
            addCriterion("projectId =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(Integer value) {
            addCriterion("projectId <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(Integer value) {
            addCriterion("projectId >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(Integer value) {
            addCriterion("projectId >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(Integer value) {
            addCriterion("projectId <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(Integer value) {
            addCriterion("projectId <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<Integer> values) {
            addCriterion("projectId in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<Integer> values) {
            addCriterion("projectId not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(Integer value1, Integer value2) {
            addCriterion("projectId between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(Integer value1, Integer value2) {
            addCriterion("projectId not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andOrgTpIsNull() {
            addCriterion("ORG_TP is null");
            return (Criteria) this;
        }

        public Criteria andOrgTpIsNotNull() {
            addCriterion("ORG_TP is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTpEqualTo(String value) {
            addCriterion("ORG_TP =", value, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpNotEqualTo(String value) {
            addCriterion("ORG_TP <>", value, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpGreaterThan(String value) {
            addCriterion("ORG_TP >", value, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_TP >=", value, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpLessThan(String value) {
            addCriterion("ORG_TP <", value, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpLessThanOrEqualTo(String value) {
            addCriterion("ORG_TP <=", value, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpLike(String value) {
            addCriterion("ORG_TP like", value, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpNotLike(String value) {
            addCriterion("ORG_TP not like", value, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpIn(List<String> values) {
            addCriterion("ORG_TP in", values, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpNotIn(List<String> values) {
            addCriterion("ORG_TP not in", values, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpBetween(String value1, String value2) {
            addCriterion("ORG_TP between", value1, value2, "orgTp");
            return (Criteria) this;
        }

        public Criteria andOrgTpNotBetween(String value1, String value2) {
            addCriterion("ORG_TP not between", value1, value2, "orgTp");
            return (Criteria) this;
        }

        public Criteria andAddrIsNull() {
            addCriterion("ADDR is null");
            return (Criteria) this;
        }

        public Criteria andAddrIsNotNull() {
            addCriterion("ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andAddrEqualTo(String value) {
            addCriterion("ADDR =", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotEqualTo(String value) {
            addCriterion("ADDR <>", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThan(String value) {
            addCriterion("ADDR >", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrGreaterThanOrEqualTo(String value) {
            addCriterion("ADDR >=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThan(String value) {
            addCriterion("ADDR <", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLessThanOrEqualTo(String value) {
            addCriterion("ADDR <=", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrLike(String value) {
            addCriterion("ADDR like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotLike(String value) {
            addCriterion("ADDR not like", value, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrIn(List<String> values) {
            addCriterion("ADDR in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotIn(List<String> values) {
            addCriterion("ADDR not in", values, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrBetween(String value1, String value2) {
            addCriterion("ADDR between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andAddrNotBetween(String value1, String value2) {
            addCriterion("ADDR not between", value1, value2, "addr");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("ZIP is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("ZIP is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("ZIP =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("ZIP <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("ZIP >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("ZIP <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("ZIP <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("ZIP like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("ZIP not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("ZIP in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("ZIP not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("ZIP between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("ZIP not between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
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

        public Criteria andCenterLonIsNull() {
            addCriterion("CENTER_LON is null");
            return (Criteria) this;
        }

        public Criteria andCenterLonIsNotNull() {
            addCriterion("CENTER_LON is not null");
            return (Criteria) this;
        }

        public Criteria andCenterLonEqualTo(String value) {
            addCriterion("CENTER_LON =", value, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonNotEqualTo(String value) {
            addCriterion("CENTER_LON <>", value, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonGreaterThan(String value) {
            addCriterion("CENTER_LON >", value, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonGreaterThanOrEqualTo(String value) {
            addCriterion("CENTER_LON >=", value, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonLessThan(String value) {
            addCriterion("CENTER_LON <", value, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonLessThanOrEqualTo(String value) {
            addCriterion("CENTER_LON <=", value, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonLike(String value) {
            addCriterion("CENTER_LON like", value, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonNotLike(String value) {
            addCriterion("CENTER_LON not like", value, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonIn(List<String> values) {
            addCriterion("CENTER_LON in", values, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonNotIn(List<String> values) {
            addCriterion("CENTER_LON not in", values, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonBetween(String value1, String value2) {
            addCriterion("CENTER_LON between", value1, value2, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLonNotBetween(String value1, String value2) {
            addCriterion("CENTER_LON not between", value1, value2, "centerLon");
            return (Criteria) this;
        }

        public Criteria andCenterLatIsNull() {
            addCriterion("CENTER_LAT is null");
            return (Criteria) this;
        }

        public Criteria andCenterLatIsNotNull() {
            addCriterion("CENTER_LAT is not null");
            return (Criteria) this;
        }

        public Criteria andCenterLatEqualTo(String value) {
            addCriterion("CENTER_LAT =", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatNotEqualTo(String value) {
            addCriterion("CENTER_LAT <>", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatGreaterThan(String value) {
            addCriterion("CENTER_LAT >", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatGreaterThanOrEqualTo(String value) {
            addCriterion("CENTER_LAT >=", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatLessThan(String value) {
            addCriterion("CENTER_LAT <", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatLessThanOrEqualTo(String value) {
            addCriterion("CENTER_LAT <=", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatLike(String value) {
            addCriterion("CENTER_LAT like", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatNotLike(String value) {
            addCriterion("CENTER_LAT not like", value, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatIn(List<String> values) {
            addCriterion("CENTER_LAT in", values, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatNotIn(List<String> values) {
            addCriterion("CENTER_LAT not in", values, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatBetween(String value1, String value2) {
            addCriterion("CENTER_LAT between", value1, value2, "centerLat");
            return (Criteria) this;
        }

        public Criteria andCenterLatNotBetween(String value1, String value2) {
            addCriterion("CENTER_LAT not between", value1, value2, "centerLat");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlIsNull() {
            addCriterion("BASEMAP_URL is null");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlIsNotNull() {
            addCriterion("BASEMAP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlEqualTo(String value) {
            addCriterion("BASEMAP_URL =", value, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlNotEqualTo(String value) {
            addCriterion("BASEMAP_URL <>", value, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlGreaterThan(String value) {
            addCriterion("BASEMAP_URL >", value, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlGreaterThanOrEqualTo(String value) {
            addCriterion("BASEMAP_URL >=", value, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlLessThan(String value) {
            addCriterion("BASEMAP_URL <", value, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlLessThanOrEqualTo(String value) {
            addCriterion("BASEMAP_URL <=", value, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlLike(String value) {
            addCriterion("BASEMAP_URL like", value, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlNotLike(String value) {
            addCriterion("BASEMAP_URL not like", value, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlIn(List<String> values) {
            addCriterion("BASEMAP_URL in", values, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlNotIn(List<String> values) {
            addCriterion("BASEMAP_URL not in", values, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlBetween(String value1, String value2) {
            addCriterion("BASEMAP_URL between", value1, value2, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andBasemapUrlNotBetween(String value1, String value2) {
            addCriterion("BASEMAP_URL not between", value1, value2, "basemapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlIsNull() {
            addCriterion("FLOATMAP_URL is null");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlIsNotNull() {
            addCriterion("FLOATMAP_URL is not null");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlEqualTo(String value) {
            addCriterion("FLOATMAP_URL =", value, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlNotEqualTo(String value) {
            addCriterion("FLOATMAP_URL <>", value, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlGreaterThan(String value) {
            addCriterion("FLOATMAP_URL >", value, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlGreaterThanOrEqualTo(String value) {
            addCriterion("FLOATMAP_URL >=", value, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlLessThan(String value) {
            addCriterion("FLOATMAP_URL <", value, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlLessThanOrEqualTo(String value) {
            addCriterion("FLOATMAP_URL <=", value, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlLike(String value) {
            addCriterion("FLOATMAP_URL like", value, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlNotLike(String value) {
            addCriterion("FLOATMAP_URL not like", value, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlIn(List<String> values) {
            addCriterion("FLOATMAP_URL in", values, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlNotIn(List<String> values) {
            addCriterion("FLOATMAP_URL not in", values, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlBetween(String value1, String value2) {
            addCriterion("FLOATMAP_URL between", value1, value2, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andFloatmapUrlNotBetween(String value1, String value2) {
            addCriterion("FLOATMAP_URL not between", value1, value2, "floatmapUrl");
            return (Criteria) this;
        }

        public Criteria andInitLevelIsNull() {
            addCriterion("INIT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andInitLevelIsNotNull() {
            addCriterion("INIT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andInitLevelEqualTo(Short value) {
            addCriterion("INIT_LEVEL =", value, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelNotEqualTo(Short value) {
            addCriterion("INIT_LEVEL <>", value, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelGreaterThan(Short value) {
            addCriterion("INIT_LEVEL >", value, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelGreaterThanOrEqualTo(Short value) {
            addCriterion("INIT_LEVEL >=", value, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelLessThan(Short value) {
            addCriterion("INIT_LEVEL <", value, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelLessThanOrEqualTo(Short value) {
            addCriterion("INIT_LEVEL <=", value, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelIn(List<Short> values) {
            addCriterion("INIT_LEVEL in", values, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelNotIn(List<Short> values) {
            addCriterion("INIT_LEVEL not in", values, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelBetween(Short value1, Short value2) {
            addCriterion("INIT_LEVEL between", value1, value2, "initLevel");
            return (Criteria) this;
        }

        public Criteria andInitLevelNotBetween(Short value1, Short value2) {
            addCriterion("INIT_LEVEL not between", value1, value2, "initLevel");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andReorderIsNull() {
            addCriterion("REORDER is null");
            return (Criteria) this;
        }

        public Criteria andReorderIsNotNull() {
            addCriterion("REORDER is not null");
            return (Criteria) this;
        }

        public Criteria andReorderEqualTo(String value) {
            addCriterion("REORDER =", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotEqualTo(String value) {
            addCriterion("REORDER <>", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderGreaterThan(String value) {
            addCriterion("REORDER >", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderGreaterThanOrEqualTo(String value) {
            addCriterion("REORDER >=", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderLessThan(String value) {
            addCriterion("REORDER <", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderLessThanOrEqualTo(String value) {
            addCriterion("REORDER <=", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderLike(String value) {
            addCriterion("REORDER like", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotLike(String value) {
            addCriterion("REORDER not like", value, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderIn(List<String> values) {
            addCriterion("REORDER in", values, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotIn(List<String> values) {
            addCriterion("REORDER not in", values, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderBetween(String value1, String value2) {
            addCriterion("REORDER between", value1, value2, "reorder");
            return (Criteria) this;
        }

        public Criteria andReorderNotBetween(String value1, String value2) {
            addCriterion("REORDER not between", value1, value2, "reorder");
            return (Criteria) this;
        }

        public Criteria andSendmsgIsNull() {
            addCriterion("SENDMSG is null");
            return (Criteria) this;
        }

        public Criteria andSendmsgIsNotNull() {
            addCriterion("SENDMSG is not null");
            return (Criteria) this;
        }

        public Criteria andSendmsgEqualTo(Integer value) {
            addCriterion("SENDMSG =", value, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgNotEqualTo(Integer value) {
            addCriterion("SENDMSG <>", value, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgGreaterThan(Integer value) {
            addCriterion("SENDMSG >", value, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgGreaterThanOrEqualTo(Integer value) {
            addCriterion("SENDMSG >=", value, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgLessThan(Integer value) {
            addCriterion("SENDMSG <", value, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgLessThanOrEqualTo(Integer value) {
            addCriterion("SENDMSG <=", value, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgIn(List<Integer> values) {
            addCriterion("SENDMSG in", values, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgNotIn(List<Integer> values) {
            addCriterion("SENDMSG not in", values, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgBetween(Integer value1, Integer value2) {
            addCriterion("SENDMSG between", value1, value2, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andSendmsgNotBetween(Integer value1, Integer value2) {
            addCriterion("SENDMSG not between", value1, value2, "sendmsg");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNull() {
            addCriterion("PAYMENT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIsNotNull() {
            addCriterion("PAYMENT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentStateEqualTo(Integer value) {
            addCriterion("PAYMENT_STATE =", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotEqualTo(Integer value) {
            addCriterion("PAYMENT_STATE <>", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThan(Integer value) {
            addCriterion("PAYMENT_STATE >", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_STATE >=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThan(Integer value) {
            addCriterion("PAYMENT_STATE <", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_STATE <=", value, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateIn(List<Integer> values) {
            addCriterion("PAYMENT_STATE in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotIn(List<Integer> values) {
            addCriterion("PAYMENT_STATE not in", values, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_STATE between", value1, value2, "paymentState");
            return (Criteria) this;
        }

        public Criteria andPaymentStateNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_STATE not between", value1, value2, "paymentState");
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