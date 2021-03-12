package com.fksb.fksbmaintain.model;

import com.fksb.worker.model.WxBdWaterVO;

import java.math.BigDecimal;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class FksbMainTainVO {


    private String oldEquiid;

    private BigDecimal waterNum;
    
    private String  newEquiid;

    private String  pciLine;

    private String orgcd;

    private String mpcd;

    private WxBdWaterVO wxBdWaterVOS;

    public String getOldEquiid() {
        return oldEquiid;
    }

    public void setOldEquiid(String oldEquiid) {
        this.oldEquiid = oldEquiid;
    }

    public BigDecimal getWaterNum() {
        return waterNum;
    }

    public void setWaterNum(BigDecimal waterNum) {
        this.waterNum = waterNum;
    }

    public String getNewEquiid() {
        return newEquiid;
    }

    public void setNewEquiid(String newEquiid) {
        this.newEquiid = newEquiid;
    }

    public String getPciLine() {
        return pciLine;
    }

    public void setPciLine(String pciLine) {
        this.pciLine = pciLine;
    }

    public String getOrgcd() {
        return orgcd;
    }

    public void setOrgcd(String orgcd) {
        this.orgcd = orgcd;
    }

    public String getMpcd() {
        return mpcd;
    }

    public void setMpcd(String mpcd) {
        this.mpcd = mpcd;
    }


    public WxBdWaterVO getWxBdWaterVOS() {
        return wxBdWaterVOS;
    }

    public void setWxBdWaterVOS(WxBdWaterVO wxBdWaterVOS) {
        this.wxBdWaterVOS = wxBdWaterVOS;
    }
}
