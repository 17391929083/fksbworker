package com.fksb.workenter.service;

import com.fksb.workenter.model.SysAccountVO;
import com.fksb.workenter.model.SysAccountVOExample;
import com.fksb.workenter.model.SysUserVO;

import java.util.List;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public interface WorkerEnterService {

    /*
    * 查询账号密码
    *
    * */

    SysUserVO selectByExample(SysAccountVO sysAccountVO);


    /*
    * 核验用户是否实名认证
    *
    * */
    long  checkBdWater(String userFromName);
}
