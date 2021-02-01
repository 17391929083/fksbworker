package com.fksb.rabbitconsumer;


import com.sun.istack.internal.logging.Logger;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Component
public class RabbitTemplateConfig implements RabbitTemplate.ConfirmCallback, RabbitTemplate.ReturnCallback {
    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @PostConstruct
    public void init() {
        rabbitTemplate.setConfirmCallback(this);// 指定 ConfirmCallback
        rabbitTemplate.setReturnCallback(this);// 指定 ReturnCallback
    }

    /**
     * 确认消息是否发送到Exchange
     */
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        if (ack) {
            logger.info("消息发送成功:" + correlationData);
        } else {
            logger.info("消息发送失败:" + cause);
        }

    }



    @Override
    public void returnedMessage(Message message,  int replyCode, String replyText, String exchange, String routingKey) {
        logger.info(message.getMessageProperties().getCorrelationId() + " 发送失败");
        logger.info("消息主体 message : " + message);
        logger.info("描述：" + replyText);
        logger.info("消息使用的交换器 exchange : " + exchange);
        logger.info("消息使用的路由键 routing : " + routingKey);
    }
}