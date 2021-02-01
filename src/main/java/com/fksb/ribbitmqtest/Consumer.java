package com.fksb.ribbitmqtest;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class Consumer {

    public static void main(String[] args) throws IOException, TimeoutException {

        //获取长链接
        Connection connection = RabbitMqUtill.getConnection();
        //创建通道,建立虚拟连接
        Channel channel = connection.createChannel();
        channel.queueDeclare(RabbitMqConstant.QUEUE_HELLOWOLRD,false,false,false,null);
        channel.basicConsume(RabbitMqConstant.QUEUE_HELLOWOLRD,false,new Reciver(channel));
    }

    static class  Reciver extends DefaultConsumer {
        private Channel channel;


        public Reciver(Channel channel) {
            super(channel);
            this.channel=channel;
        }

        @Override
        public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
            super.handleDelivery(consumerTag, envelope, properties, body);
            String message=new String(body);
            System.out.println("消费者拿到的消息"+message);
            System.out.println("消息的标签"+envelope.getDeliveryTag());
            //签收消息
            channel.basicAck(envelope.getDeliveryTag(),false);

        }
    }
}


