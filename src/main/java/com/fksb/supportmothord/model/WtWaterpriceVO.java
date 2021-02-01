package com.fksb.supportmothord.model;

import java.math.BigDecimal;

public class WtWaterpriceVO {
    private Long id;

    private Long pid;

    private String wpName;

    private BigDecimal wpPrice;

    private String wpDes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public String getWpName() {
        return wpName;
    }

    public void setWpName(String wpName) {
        this.wpName = wpName;
    }

    public BigDecimal getWpPrice() {
        return wpPrice;
    }

    public void setWpPrice(BigDecimal wpPrice) {
        this.wpPrice = wpPrice;
    }

    public String getWpDes() {
        return wpDes;
    }

    public void setWpDes(String wpDes) {
        this.wpDes = wpDes;
    }
}