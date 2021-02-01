package com.fksb.worker.service;

import com.fksb.worker.model.WxBdWaterVO;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public interface WxBdWaterService {
    /*提交工人信息*/
    int insertSelective(WxBdWaterVO record);

}
