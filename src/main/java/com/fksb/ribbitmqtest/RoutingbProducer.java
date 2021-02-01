package com.fksb.ribbitmqtest;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class RoutingbProducer {

    public static void main(String[] args) throws IOException, TimeoutException {
          //获取rabbitmq 长链接
        Connection connection = RabbitMqUtill.getConnection();
        //键盘输入
        Map area = new LinkedHashMap<String, String>();
        area.put("china.hunan.changsha.20201127", "中国湖南长沙20201127天气数据");
        area.put("china.hubei.wuhan.20201127", "中国湖北武汉20201127天气数据");
        area.put("china.hunan.zhuzhou.20201127", "中国湖南株洲20201128天气数据");
        area.put("us.cal.lsj.20201127", "美国加州洛杉矶20201127天气数据");

        area.put("china.hebei.shijiazhuang.20201128", "中国河北石家庄20201128天气数据");
        area.put("china.hubei.wuhan.20201128", "中国湖北武汉20201128天气数据");
        area.put("china.henan.zhengzhou.20201128", "中国河南郑州20201128天气数据");
        area.put("us.cal.lsj.20201128", "美国加州洛杉矶20201128天气数据");


        //创建临时连接
        Channel channel = connection.createChannel();
        Iterator<Map.Entry<String,String>> iterator = area.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> em=iterator.next();
            channel.basicPublish(RabbitMqConstant.EXCHANGE_WEATHER_ROUTING,em.getKey(),null,em.getValue().getBytes());
      }

        channel.close();

        connection.close();



        



    }
}
