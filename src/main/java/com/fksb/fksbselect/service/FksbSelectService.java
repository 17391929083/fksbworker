package com.fksb.fksbselect.service;

import com.fksb.fksbselect.model.FksbDataMprRtrVO;
import com.fksb.fksbselect.model.FksbInfoZncbVO;
import com.fksb.fksbselect.model.WtFksbDataRtrVO;
import com.fksb.fksbuser.model.WtEquiMpZncdVO;
import org.springframework.ui.Model;

import java.util.List;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public interface FksbSelectService {
    /*
    *
    * 查询水表上报信息
    * */
    FksbDataMprRtrVO selectMprFksbRtr(Model model, String equiid);


    /*
    * 查询水表信息
    *
    * */
    FksbInfoZncbVO selectFksbInfo(String mpCd, String equiid);

    /*
    * 修改水表信息
    * */
    int  updateZncb(WtEquiMpZncdVO wtEquiMpZncdVO);
}
