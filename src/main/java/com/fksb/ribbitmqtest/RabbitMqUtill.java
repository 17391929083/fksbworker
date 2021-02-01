package com.fksb.ribbitmqtest;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class RabbitMqUtill {


    private static ConnectionFactory connectionFactory=new ConnectionFactory();

     static {
         connectionFactory.setHost("182.92.59.108");
         connectionFactory.setPort(5672);
         connectionFactory.setUsername("water");
         connectionFactory.setPassword("water");
         connectionFactory.setVirtualHost("/water");
      }

    public static Connection getConnection() {
        Connection connection=null;

        try {
            connection=connectionFactory.newConnection();
            return connection;
        }catch (Exception ex){
               throw  new RuntimeException();

            
        }

    }
}
