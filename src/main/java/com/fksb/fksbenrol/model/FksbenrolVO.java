package com.fksb.fksbenrol.model;

import com.fksb.supportmothord.model.WtAdTownVO;

import java.util.List;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class FksbenrolVO {

    private String  adNm;

    private String  adCd;

    private String  orgNm;
    
    private List<WtAdTownVO> list;

    public String getAdNm() {
        return adNm;
    }

    public void setAdNm(String adNm) {
        this.adNm = adNm;
    }

    public String getAdCd() {
        return adCd;
    }

    public void setAdCd(String adCd) {
        this.adCd = adCd;
    }

    public String getOrgNm() {
        return orgNm;
    }

    public void setOrgNm(String orgNm) {
        this.orgNm = orgNm;
    }


    public List<WtAdTownVO> getList() {
        return list;
    }

    public void setList(List<WtAdTownVO> list) {
        this.list = list;
    }
}
