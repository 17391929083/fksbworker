package com.fksb.ribbitmqtest;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class TopicProducer {

    public static void main(String[] args) throws IOException, TimeoutException {
          //获取rabbitmq 长链接
        Connection connection = RabbitMqUtill.getConnection();
        //键盘输入
        Map area = new LinkedHashMap<String, String>();
        area.put("china.hunan.changsha.20201127", "中国湖南长沙20201127天气数据");
        area.put("china.hubei.wuhan.20201129", "中国湖北武汉20201129天气数据");
        area.put("china.hunan.zhuzhou.20201129", "中国湖南株洲20201129天气数据");
        area.put("us.cal.lsj.20201127", "美国加州洛杉矶20201127天气数据");

        area.put("china.hebei.shijiazhuang.20201128", "中国河北石家庄20201128天气数据");
        area.put("china.hubei.wuhan.20201128", "中国湖北武汉20201128天气数据");
        area.put("china.henan.zhengzhou.20201128", "中国河南郑州20201128天气数据");
        area.put("us.cal.lsj.20201128", "美国加州洛杉矶20201128天气数据");


        //创建临时连接
        Channel channel = connection.createChannel();
        //开启监听模式
        channel.confirmSelect();
        //重写监听器
        channel.addConfirmListener(new ConfirmListener() {
            @Override
            public void handleAck(long l, boolean b) throws IOException {
                System.out.println("消息已经被顺利接收"+l);
            }

            @Override
            public void handleNack(long l, boolean b) throws IOException {
                System.out.println("消息已被拒绝接收"+l);

            }
        });
        channel.addReturnListener(new ReturnCallback() {
            public void handle(Return r) {
                System.err.println("===========================");
                System.err.println("Return编码：" + r.getReplyCode() + "-Return描述:" + r.getReplyText());
                System.err.println("交换机:" + r.getExchange() + "-路由key:" + r.getRoutingKey() );
                System.err.println("Return主题：" + new String(r.getBody()));
                System.err.println("===========================");
            }
        });



        Iterator<Map.Entry<String,String>> iterator = area.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> em=iterator.next();
            channel.basicPublish(RabbitMqConstant.EXCHANGE_WEATHER_TOPIC,em.getKey(),true,null,em.getValue().getBytes());
      }

//        channel.close();
//
//        connection.close();



        



    }
}
