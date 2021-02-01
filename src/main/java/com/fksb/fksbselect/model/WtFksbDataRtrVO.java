package com.fksb.fksbselect.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class WtFksbDataRtrVO {
    private Long id;

    private String mpCd;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date dtTt;

    private BigDecimal totalQty;

    private BigDecimal surplusQty;

    private BigDecimal v;

    private Integer signals;

    private Integer alarm;

    private Integer valveS;

    private Integer isok;

    private BigDecimal previousMonthQty;

    private BigDecimal monthLastQty;

    private BigDecimal monthTotalQty;

    private BigDecimal yearTotalQty;

    private String sign;

    private Date ts;

    private Double accumuWater;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMpCd() {
        return mpCd;
    }

    public void setMpCd(String mpCd) {
        this.mpCd = mpCd;
    }

    public Date getDtTt() {
        return dtTt;
    }

    public void setDtTt(Date dtTt) {
        this.dtTt = dtTt;
    }

    public BigDecimal getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }

    public BigDecimal getSurplusQty() {
        return surplusQty;
    }

    public void setSurplusQty(BigDecimal surplusQty) {
        this.surplusQty = surplusQty;
    }

    public BigDecimal getV() {
        return v;
    }

    public void setV(BigDecimal v) {
        this.v = v;
    }

    public Integer getSignals() {
        return signals;
    }

    public void setSignals(Integer signals) {
        this.signals = signals;
    }

    public Integer getAlarm() {
        return alarm;
    }

    public void setAlarm(Integer alarm) {
        this.alarm = alarm;
    }

    public Integer getValveS() {
        return valveS;
    }

    public void setValveS(Integer valveS) {
        this.valveS = valveS;
    }

    public Integer getIsok() {
        return isok;
    }

    public void setIsok(Integer isok) {
        this.isok = isok;
    }

    public BigDecimal getPreviousMonthQty() {
        return previousMonthQty;
    }

    public void setPreviousMonthQty(BigDecimal previousMonthQty) {
        this.previousMonthQty = previousMonthQty;
    }

    public BigDecimal getMonthLastQty() {
        return monthLastQty;
    }

    public void setMonthLastQty(BigDecimal monthLastQty) {
        this.monthLastQty = monthLastQty;
    }

    public BigDecimal getMonthTotalQty() {
        return monthTotalQty;
    }

    public void setMonthTotalQty(BigDecimal monthTotalQty) {
        this.monthTotalQty = monthTotalQty;
    }

    public BigDecimal getYearTotalQty() {
        return yearTotalQty;
    }

    public void setYearTotalQty(BigDecimal yearTotalQty) {
        this.yearTotalQty = yearTotalQty;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Double getAccumuWater() {
        return accumuWater;
    }

    public void setAccumuWater(Double accumuWater) {
        this.accumuWater = accumuWater;
    }
}