package com.fksb.ribbitmqtest;

import com.rabbitmq.client.*;

import java.io.IOException;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class PubsubConsumer1 {

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitMqUtill.getConnection();
        final Channel channel = connection.createChannel();

        channel.queueDeclare(RabbitMqConstant.QUEUE_SINA,false,false,false,null);

        channel.queueBind(RabbitMqConstant.QUEUE_SINA,RabbitMqConstant.EXCHANGE_QUEUE,"");

        channel.basicQos(1);

        channel.basicConsume(RabbitMqConstant.QUEUE_SINA,false,new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                System.out.println("新浪的天气预报为:"+new String(body));

                channel.basicAck(envelope.getDeliveryTag(),false);
                


            }
        });
    }
}
