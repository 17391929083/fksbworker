package com.fksb.fksbenrol.model;

import java.math.BigDecimal;
import java.util.Date;

public class WtAdBVO {
    private String adCd;

    private String adNm;

    private String adShnm;

    private BigDecimal adA;

    private String operCd;

    private Date ts;

    private String nt;

    private BigDecimal adLong;

    private BigDecimal adLat;

    private String parentCd;

    private Short isdisplay;

    public String getAdCd() {
        return adCd;
    }

    public void setAdCd(String adCd) {
        this.adCd = adCd;
    }

    public String getAdNm() {
        return adNm;
    }

    public void setAdNm(String adNm) {
        this.adNm = adNm;
    }

    public String getAdShnm() {
        return adShnm;
    }

    public void setAdShnm(String adShnm) {
        this.adShnm = adShnm;
    }

    public BigDecimal getAdA() {
        return adA;
    }

    public void setAdA(BigDecimal adA) {
        this.adA = adA;
    }

    public String getOperCd() {
        return operCd;
    }

    public void setOperCd(String operCd) {
        this.operCd = operCd;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public String getNt() {
        return nt;
    }

    public void setNt(String nt) {
        this.nt = nt;
    }

    public BigDecimal getAdLong() {
        return adLong;
    }

    public void setAdLong(BigDecimal adLong) {
        this.adLong = adLong;
    }

    public BigDecimal getAdLat() {
        return adLat;
    }

    public void setAdLat(BigDecimal adLat) {
        this.adLat = adLat;
    }

    public String getParentCd() {
        return parentCd;
    }

    public void setParentCd(String parentCd) {
        this.parentCd = parentCd;
    }

    public Short getIsdisplay() {
        return isdisplay;
    }

    public void setIsdisplay(Short isdisplay) {
        this.isdisplay = isdisplay;
    }
}