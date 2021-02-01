package com.fksb.fksbuser.service;

import com.fksb.fksbuser.model.FksbUserVO;
import com.fksb.supportmothord.model.WtWaterpriceVO;

import java.util.List;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public interface FksbUserService {


    /*获取用水类型列表*/
    public List<WtWaterpriceVO> waterType();


    /*存储测点数据和用户数据*/

    public int inserMprZncb(FksbUserVO fksbUserVO);






}
