package com.fksb.worker.service;

import com.fksb.worker.mapper.WxBdWaterMapper;
import com.fksb.worker.model.WxBdWaterVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Service
public class WxBdWaterServiceImpl implements WxBdWaterService {
     @Autowired
     private WxBdWaterMapper wxBdWaterMapper;

    public int insertSelective(WxBdWaterVO record) {

      
        return   wxBdWaterMapper.insertSelective(record);
    }
}
