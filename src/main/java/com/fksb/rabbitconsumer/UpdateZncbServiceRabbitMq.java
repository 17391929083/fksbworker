package com.fksb.rabbitconsumer;

import com.alibaba.fastjson.JSONObject;
import com.fksb.fksbenrol.mapper.WtEquiMprMapper;
import com.fksb.fksbenrol.model.WtEquiMprVO;
import com.fksb.fksbenrol.model.WtEquiMprVOExample;
import com.fksb.fksbmaintain.model.FksbMainTainVO;
import com.fksb.fksbselect.mapper.WtFksbDataRtrMapper;
import com.fksb.fksbselect.model.FksbInfoZncbVO;
import com.fksb.fksbselect.model.WtFksbDataRtrVO;
import com.fksb.fksbselect.model.WtFksbDataRtrVOExample;
import com.fksb.fksbuser.mapper.WtEquiMpZncdMapper;
import com.fksb.fksbuser.model.WtEquiMpZncdVO;
import com.fksb.fksbuser.model.WtEquiMpZncdVOExample;
import com.fksb.supportmothord.mapper.FbTableMapper;
import com.fksb.supportmothord.model.FbTableVO;
import com.fksb.supportmothord.model.FbTableVOExample;
import com.fksb.utill.CacheUtil;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@RestController
public class UpdateZncbServiceRabbitMq implements ChannelAwareMessageListener {

    @Autowired
    private WtEquiMpZncdMapper wtEquiMpZncdMapper;


    @Override
    public void onMessage(Message message, Channel channel) throws Exception {
        //获取消息的id 用于签收
        long deliveryTag = message.getMessageProperties().getDeliveryTag();

        WtEquiMpZncdVO  wtEquiMpZncdVO = JSONObject.parseObject(message.getBody(), WtEquiMpZncdVO.class);

        try {



        int changeequiid = this.changZncb(wtEquiMpZncdVO);
  
        channel.basicAck(deliveryTag,false);
        }catch (Exception ex){
            ex.printStackTrace();

        }


    }

    private int changZncb(WtEquiMpZncdVO wtEquiMpZncdVO){

        WtEquiMpZncdVOExample wtEquiMpZncdVOExample = new WtEquiMpZncdVOExample();
        WtEquiMpZncdVOExample.Criteria criteria = wtEquiMpZncdVOExample.createCriteria();
        criteria.andMpCdEqualTo(wtEquiMpZncdVO.getMpCd());
        int changsign = wtEquiMpZncdMapper.updateByExampleSelective(wtEquiMpZncdVO, wtEquiMpZncdVOExample);
        return changsign;

    }






}
