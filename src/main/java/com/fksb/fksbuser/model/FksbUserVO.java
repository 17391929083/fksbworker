package com.fksb.fksbuser.model;

import java.math.BigDecimal;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class FksbUserVO {

    private  String mpCd;
    private  String userLocal;

    private  String userName;

    private String userPhone;

    private BigDecimal userAre;

    private  int  waterType;

    private  int  userType;


    public String getUserLocal() {
        return userLocal;
    }

    public void setUserLocal(String userLocal) {
        this.userLocal = userLocal;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public BigDecimal getUserAre() {
        return userAre;
    }

    public void setUserAre(BigDecimal userAre) {
        this.userAre = userAre;
    }

    public int getWaterType() {
        return waterType;
    }

    public void setWaterType(int waterType) {
        this.waterType = waterType;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }


    public String getMpCd() {
        return mpCd;
    }

    public void setMpCd(String mpCd) {
        this.mpCd = mpCd;
    }


}
