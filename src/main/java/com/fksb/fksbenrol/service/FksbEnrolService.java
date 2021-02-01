package com.fksb.fksbenrol.service;

import com.fksb.fksbenrol.model.FksbInserModel;
import com.fksb.fksbenrol.model.FksbenrolVO;
import com.fksb.fksbenrol.model.WtAdBVO;
import com.fksb.fksbenrol.model.WtOrgBVO;
import com.fksb.supportmothord.model.WtAdTownVO;
import com.fksb.supportmothord.model.WtAdVillageVO;

import java.util.List;


/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public interface FksbEnrolService {

    /*查询区域*/
    FksbenrolVO selectAdAre(String orgCd);

    /*查询所属机构*/
   WtOrgBVO selectOrgCDNm(String orgCd);


    /*查询所属村镇*/
    List<WtAdVillageVO>  selectVillageNm(String townId);


    boolean  isNullEquiid(FksbInserModel fksbInserModel);
}
