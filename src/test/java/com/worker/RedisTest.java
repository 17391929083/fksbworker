package com.worker;

import com.fksb.fksbenrol.service.FksbEnrolService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Map;
import java.util.Set;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class RedisTest {


 
    ClassPathXmlApplicationContext ioc;

    private RedisTemplate redisTemplate;
    @Before
    public void before(){
        // 加载spring容器
        //ApplicationContext spring的顶层核心接口
        // ClassPathXmlApplicationContext 根据项目路径的xml配置来实例化spring容器
        // FileSystemXmlApplicationContext 根据磁盘路径的xml配置来实例化spring容器
        // AnnotationConfigApplicationContext 根据javaconfig 来配置实例化spring容器
        // 在容器实例化的时候 就会加载所有的bean
        ioc=new ClassPathXmlApplicationContext("spring-redis.xml");
         redisTemplate = ioc.getBean("redisTemplate", RedisTemplate.class);
    }



    @Test
    public void testDirect(){
//        Set<String> keys = redisTemplate.keys("*");
//        redisTemplate.delete(keys);
        //2.发送消息
        //redisTemplate.opsForHash().put("ruleOrgcd","610113010",0);
      
        System.out.println(redisTemplate.opsForHash().entries("equuidTompcd"));
    }



    @Autowired
    private FksbEnrolService fksbEnrolService;


}
