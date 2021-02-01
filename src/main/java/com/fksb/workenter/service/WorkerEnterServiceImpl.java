package com.fksb.workenter.service;

import com.fksb.utill.MD5Util;
import com.fksb.workenter.mapper.SysAccountMapper;
import com.fksb.workenter.mapper.SysUserVOMapper;
import com.fksb.workenter.model.SysAccountVO;
import com.fksb.workenter.model.SysAccountVOExample;
import com.fksb.workenter.model.SysUserVO;
import com.fksb.worker.mapper.WxBdWaterMapper;
import com.fksb.worker.model.WxBdWaterVOExample;
import com.fksb.worker.service.WxBdWaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Service("workerEnterService")
public  class WorkerEnterServiceImpl implements WorkerEnterService {

    @Autowired
    private SysAccountMapper sysAccountMapper;


    @Autowired
    private SysUserVOMapper sysUserVOMapper;

    @Autowired
    private WxBdWaterMapper wxBdWaterMapper;

    
    @Override
    public SysUserVO selectByExample(SysAccountVO sysAccountVO) {
        SysAccountVOExample sysAccountVOExample=   new  SysAccountVOExample();
        sysAccountVOExample.setDistinct(true);
        SysAccountVOExample.Criteria criteria = sysAccountVOExample.createCriteria();
        criteria.andLoginnameEqualTo(sysAccountVO.getLoginname());
        criteria.andLoginpasswordEqualTo(MD5Util.getValue(sysAccountVO.getLoginpassword()));
        List<SysAccountVOExample.Criteria> list=sysAccountVOExample.getOredCriteria();
        list.add(criteria);
        List<SysAccountVO> sysAccountVOS = sysAccountMapper.selectByExample(sysAccountVOExample);
        SysUserVO sysUserVO=null;
        if(sysAccountVOS.size()>0){
             sysUserVO = sysUserVOMapper.selectByPrimaryKey(sysAccountVOS.get(0).getUserid());
        }
        return  sysUserVO;
    }

    @Override
    public long checkBdWater(String userFromName) {
        WxBdWaterVOExample wxBdWaterVOExample = new WxBdWaterVOExample();
        WxBdWaterVOExample.Criteria criteria=wxBdWaterVOExample.createCriteria();
        criteria.andOpenidEqualTo(userFromName);
        long checkBdWater = wxBdWaterMapper.countByExample(wxBdWaterVOExample);

        return checkBdWater;
    }
}
