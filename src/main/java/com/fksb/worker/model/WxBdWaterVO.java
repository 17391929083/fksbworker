package com.fksb.worker.model;

import com.sun.istack.internal.NotNull;

public class WxBdWaterVO {

    private Long id;
    @NotNull
    private String phone;
    @NotNull
    private String openid;
    @NotNull
    private String workername;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getWorkername() {
        return workername;
    }

    public void setWorkername(String workername) {
        this.workername = workername;
    }
}