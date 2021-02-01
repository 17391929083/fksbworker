package com.fksb.worker.utill;

import com.alibaba.fastjson.JSONObject;
import com.fksb.worker.model.SendMessageVO;
import org.springframework.stereotype.Component;

import java.util.Random;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Component("randUtil")
public class RandUtil {
    public  static final String PHONE_MESSAGE="phone_message";
    public  static final String SPRING_FANOUT_QUEUE_2="spring_fanout_queue_2";



    public  static final String FKSB_MAINTAIN_QUEUE="fksb_maintain_queue";
    public  static final String FKSB_MAINTAIN_key="maintain";
    public  static final String FKSB_ZNCB_key="updateZncb";
    public  static final String FKSB_MAINTAIN_EXCGABGE="fksb_maintain_exchange";




    public static String getRandNum() {
        String randNum = new Random().nextInt(1000000)+"";
        if (randNum.length()!=6) {   //如果生成的不是6位数随机数则返回该方法继续生成
            return getRandNum();
        }
        return randNum;
    }


    public static SendMessageVO sendMessages(String phone,String code){
        SendMessageVO sendMessageVO = new SendMessageVO();
        sendMessageVO.setPhone(phone);
        sendMessageVO.setCode(code);
        StringBuffer message=new StringBuffer();
        message.append("验证码"+code+"(注册验证码,请完成验证),如非本人操作请忽略此短信【云之慧】");
        sendMessageVO.setContent(message.toString());
        JSONObject object=(JSONObject) JSONObject.toJSON(sendMessageVO);
        System.out.println(object);
        return sendMessageVO;


    }
}
