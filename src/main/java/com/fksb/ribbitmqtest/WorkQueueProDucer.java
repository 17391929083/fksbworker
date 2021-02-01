package com.fksb.ribbitmqtest;

import com.alibaba.fastjson.JSONObject;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class WorkQueueProDucer {

    public static void main(String[] args) throws IOException, TimeoutException {


      Connection connection=RabbitMqUtill.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(RabbitMqConstant.QUEUE_SMS,false,false,false,null);

        for (int i = 0; i <10 ; i++) {
            SMSVO sms=new  SMSVO("乘客"+i,"17391929083","订票成功"+i);
            String SMS="乘客"+i+"订单号"+i+"已订票成功!";
            String s = JSONObject.toJSON(sms).toString();
            channel.basicPublish("",RabbitMqConstant.QUEUE_SMS,null,s.getBytes());
        }
        System.out.println("==发送成功==");
        channel.close();
        connection.close();



        


    }

}
