package com.fksb.ribbitmqtest;

import com.rabbitmq.client.*;

import java.io.IOException;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class WorkQueueConsumer2 {

    public static void main(String[] args) throws IOException {
        Connection connection = RabbitMqUtill.getConnection();
        final Channel channel=connection.createChannel();
        channel.queueDeclare(RabbitMqConstant.QUEUE_SMS,false,false,false,null);
        channel.basicQos(1);
        channel.basicConsume(RabbitMqConstant.QUEUE_SMS, false, new DefaultConsumer(channel){

            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties, byte[] body) throws IOException {
                super.handleDelivery(consumerTag, envelope, properties, body);

                   String sms=new String(body);

                System.out.println(sms);

                channel.basicAck(envelope.getDeliveryTag(),false);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
             
                
            }
        });
        




    }


}
