package com.fksb.rabbitconsumer;

import com.alibaba.fastjson.JSONObject;
import com.fksb.utill.HttpUtil;
import com.fksb.worker.model.SendMessageVO;
import com.rabbitmq.client.Channel;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.amqp.rabbit.listener.api.ChannelAwareMessageListener;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URLEncoder;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@RestController
public class ConsumerListener implements ChannelAwareMessageListener {
    @Override
    public void onMessage(Message message, Channel channel) throws IOException {
        //1、获取消息的id
        long deliveryTag = message.getMessageProperties().getDeliveryTag();
        try{
            SendMessageVO sendMessageVO = JSONObject.parseObject(message.getBody(),SendMessageVO.class);
          
            System.out.println(sendMessageVO.getPhone());
            System.out.println(sendMessageVO.getCode());
            System.out.println(sendMessageVO.getContent());
            String encode = URLEncoder.encode(sendMessageVO.getContent(), "UTF-8");
 
            String  sucesssign= HttpUtil.sendPost("https://sdk2.028lk.com/sdk2/BatchSend2.aspx",
                    "CorpID=XAJS002125&Pwd=watertech@&Mobile="+sendMessageVO.getPhone()+"&Content="+encode+"","UTF-8");
            System.out.println(sucesssign);


            //消息签收
         channel.basicAck(deliveryTag,false);
        }catch (Exception ex){
            channel.basicNack(deliveryTag,true,true);
            ex.printStackTrace();


        }

        
    }
}
