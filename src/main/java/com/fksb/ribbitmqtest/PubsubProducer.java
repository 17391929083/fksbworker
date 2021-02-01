package com.fksb.ribbitmqtest;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class PubsubProducer {

    public static void main(String[] args) throws IOException, TimeoutException {
          //获取rabbitmq 长链接
        Connection connection = RabbitMqUtill.getConnection();
        //键盘输入
        String input = new Scanner(System.in).next();
        //创建临时连接
        Channel channel = connection.createChannel();

        channel.basicPublish(RabbitMqConstant.EXCHANGE_QUEUE,"",null,input.getBytes());

        channel.close();

        connection.close();



        



    }
}
