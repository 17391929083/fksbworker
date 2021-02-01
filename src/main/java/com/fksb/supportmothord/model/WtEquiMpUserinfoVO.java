package com.fksb.supportmothord.model;

import java.util.Date;

public class WtEquiMpUserinfoVO {
    private Long id;

    private Date addtime;

    private Boolean delstatus;

    private String username;

    private String phone;

    private String idcard;

    private String orgcd;

    private Integer status;

    private Date ts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Boolean getDelstatus() {
        return delstatus;
    }

    public void setDelstatus(Boolean delstatus) {
        this.delstatus = delstatus;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getOrgcd() {
        return orgcd;
    }

    public void setOrgcd(String orgcd) {
        this.orgcd = orgcd;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }
}