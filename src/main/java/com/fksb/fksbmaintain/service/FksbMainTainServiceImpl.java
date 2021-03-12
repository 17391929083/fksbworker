package com.fksb.fksbmaintain.service;

import com.fksb.fksbenrol.mapper.WtEquiMprMapper;
import com.fksb.fksbenrol.model.WtEquiMprVO;
import com.fksb.fksbenrol.model.WtEquiMprVOExample;
import com.fksb.fksbmaintain.model.FksbMainTainVO;
import com.fksb.fksbselect.service.FksbSelectService;
import com.fksb.worker.model.WxBdWaterVO;
import com.fksb.worker.utill.RandUtil;
import com.rabbitmq.client.Return;
import com.rabbitmq.client.ReturnCallback;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Service("fksbMainTainService")
public class FksbMainTainServiceImpl  implements FksbMainTainService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private HttpSession session;

    @Autowired
    private WtEquiMprMapper wtEquiMprMapper;

    /*
    * 更换水表设备
    *
    * */
    @Override
    public int  changEquiid(FksbMainTainVO fksbMainTainVO){


          int sign=2;
        /*
        * 判断当前设备是否存在
        * */
        WtEquiMprVOExample wtEquiMprVOExample = new WtEquiMprVOExample();
        WtEquiMprVOExample.Criteria criteria = wtEquiMprVOExample.createCriteria();
        criteria.andEquiCdEqualTo(fksbMainTainVO.getOldEquiid());
        criteria.andOrgCdEqualTo(session.getAttribute("orgCd").toString());
        String mpcd = wtEquiMprMapper.selMaxMpcd(wtEquiMprVOExample);
        if(StringUtils.isEmpty(mpcd)){
            return sign;  //设备不存在
        }
        try{
            fksbMainTainVO.setOrgcd(session.getAttribute("orgCd").toString());
            fksbMainTainVO.setMpcd(mpcd);
            fksbMainTainVO.setWxBdWaterVOS((WxBdWaterVO) session.getAttribute("userinfo"));

            rabbitTemplate.setMessageConverter(new Jackson2JsonMessageConverter());
            rabbitTemplate.convertAndSend(RandUtil.FKSB_MAINTAIN_EXCGABGE, RandUtil.FKSB_MAINTAIN_key, fksbMainTainVO);
            sign=0;//表示正常
        }catch (Exception ex){
            sign=1;

        }
        return sign;
    }

}
