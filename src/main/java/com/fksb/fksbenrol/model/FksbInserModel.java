package com.fksb.fksbenrol.model;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class FksbInserModel {

    private String  mpCd;

     private String  adCd;

   
     private String  orgCd;

     private int  townid;


     private int  villiid;

     private String  equicd;


     private String  mpUser;

     private String equiPic;

    public String getAdCd() {
        return adCd;
    }

    public void setAdCd(String adCd) {
        this.adCd = adCd;
    }

    public String getOrgCd() {
        return orgCd;
    }

    public void setOrgCd(String orgCd) {
        this.orgCd = orgCd;
    }

    public int getTownid() {
        return townid;
    }

    public void setTownid(int townid) {
        this.townid = townid;
    }

    public int getVilliid() {
        return villiid;
    }

    public void setVilliid(int villiid) {
        this.villiid = villiid;
    }

    public String getEquicd() {
        return equicd;
    }

    public void setEquicd(String equiid) {
        this.equicd = equiid;
    }


    public String getMpUser() {
        return mpUser;
    }

    public void setMpUser(String mpUser) {
        this.mpUser = mpUser;
    }

    public String getMpCd() {
        return mpCd;
    }

    public void setMpCd(String mpCd) {
        this.mpCd = mpCd;
    }

    public String getEquiPic() {
        return equiPic;
    }

    public void setEquiPic(String equiPic) {
        this.equiPic = equiPic;
    }
}
