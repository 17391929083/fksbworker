package com.fksb.fksbuser.model;

import java.math.BigDecimal;

public class WtEquiMpZncdVO {
    private Long id;

    private String mpCd;

    private Long townid;

    private Long villageid;

    private String houseno;

    private String household;

    private String phone;

    private String idcard;

    private Short watermetertype;

    private Short watertype;

    private BigDecimal area;

    private Short usestate;

    private Integer status;

    private String usestatedes;

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

    public Long getTownid() {
        return townid;
    }

    public void setTownid(Long townid) {
        this.townid = townid;
    }

    public Long getVillageid() {
        return villageid;
    }

    public void setVillageid(Long villageid) {
        this.villageid = villageid;
    }

    public String getHouseno() {
        return houseno;
    }

    public void setHouseno(String houseno) {
        this.houseno = houseno;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
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

    public Short getWatermetertype() {
        return watermetertype;
    }

    public void setWatermetertype(Short watermetertype) {
        this.watermetertype = watermetertype;
    }

    public Short getWatertype() {
        return watertype;
    }

    public void setWatertype(Short watertype) {
        this.watertype = watertype;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public Short getUsestate() {
        return usestate;
    }

    public void setUsestate(Short usestate) {
        this.usestate = usestate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUsestatedes() {
        return usestatedes;
    }

    public void setUsestatedes(String usestatedes) {
        this.usestatedes = usestatedes;
    }
}