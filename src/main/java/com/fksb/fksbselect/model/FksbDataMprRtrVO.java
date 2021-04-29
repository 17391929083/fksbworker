package com.fksb.fksbselect.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.util.Date;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class FksbDataMprRtrVO {


    private String orgNm;

    private String mpcd;
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date time;

    private BigDecimal accumuWater;

    private BigDecimal totalQty;

    private Long fmStates;

    private Long signals;

    private BigDecimal v;

    private Long eqStates;

    private BigDecimal waterMoney;

    private int deductingType;


    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }

    public String getMpcd() {
        return mpcd;
    }

    public void setMpcd(String mpcd) {
        this.mpcd = mpcd;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public BigDecimal getAccumuWater() {
        return accumuWater;
    }

    public void setAccumuWater(BigDecimal accumuWater) {
        this.accumuWater = accumuWater;
    }

    public BigDecimal getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(BigDecimal totalQty) {
        this.totalQty = totalQty;
    }

    public Long getFmStates() {
        return fmStates;
    }

    public void setFmStates(Long fmStates) {
        this.fmStates = fmStates;
    }

    public Long getSignals() {
        return signals;
    }

    public void setSignals(Long signals) {
        this.signals = signals;
    }

    public BigDecimal getV() {
        return v;
    }

    public void setV(BigDecimal v) {
        this.v = v;
    }

    public Long getEqStates() {
        return eqStates;
    }

    public void setEqStates(Long eqStates) {
        this.eqStates = eqStates;
    }

    public BigDecimal getWaterMoney() {
        return waterMoney;
    }

    public void setWaterMoney(BigDecimal waterMoney) {
        this.waterMoney = waterMoney;
    }

    public int getDeductingType() {
        return deductingType;
    }

    public void setDeductingType(int deductingType) {
        this.deductingType = deductingType;
    }
}
