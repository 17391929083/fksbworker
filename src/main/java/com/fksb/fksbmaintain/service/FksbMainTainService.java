package com.fksb.fksbmaintain.service;

import com.fksb.fksbmaintain.model.FksbMainTainVO;
import com.rabbitmq.client.ReturnCallback;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public interface FksbMainTainService {
    /*
    * 更换水表设备
    *
    * */
    int  changEquiid(FksbMainTainVO fksbMainTainVO);
}
