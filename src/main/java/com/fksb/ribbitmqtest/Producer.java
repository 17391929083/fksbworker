package com.fksb.ribbitmqtest;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class Producer {

    public static void main(String[] args) throws IOException, TimeoutException {


         //获取长链接
        Connection connection = RabbitMqUtill.getConnection();

        //创建通道,建立虚拟连接
        Channel channel = connection.createChannel();
        channel.queueDeclare(RabbitMqConstant.QUEUE_HELLOWOLRD,false,false,false,null);
        String msg="-----大家辛苦了";
        channel.basicPublish("",RabbitMqConstant.QUEUE_HELLOWOLRD,null,msg.getBytes());
        channel.close();
        connection.close();
        System.out.println("发送成功");
    }

    



}
