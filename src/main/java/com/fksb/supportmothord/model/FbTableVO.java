package com.fksb.supportmothord.model;

public class FbTableVO {
    private Integer id;

    private String orgcd;

    private String tablename;

    private Byte historysign;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrgcd() {
        return orgcd;
    }

    public void setOrgcd(String orgcd) {
        this.orgcd = orgcd;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename;
    }

    public Byte getHistorysign() {
        return historysign;
    }

    public void setHistorysign(Byte historysign) {
        this.historysign = historysign;
    }
}