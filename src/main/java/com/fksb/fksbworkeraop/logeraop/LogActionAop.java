package com.fksb.fksbworkeraop.logeraop;


import com.alibaba.druid.util.StringUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.istack.internal.logging.Logger;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Date;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
@Component
@Aspect
public class LogActionAop {
    private Logger logger = Logger.getLogger(this.getClass());

    private static ThreadLocal<OperatorLog> threadLocal = new ThreadLocal<OperatorLog>();

    private static final int maxLength = 1000;

    @Pointcut("execution(* com.fksb..*.*(..))")
    public void myPoint(){}


    @Before(value = "myPoint()")
    public  void Before(JoinPoint joinPoint){
     try {
        long beginTime = System.currentTimeMillis();
         //获取操作系统等信息
            StringBuffer sb = new StringBuffer();
            sb.append("操作系统名称:" + System.getProperty("os.name"));//操作系统名称
            sb.append("操作系统构架" + System.getProperty("os.arch"));//操作系统构架
            sb.append("操作系统版本" + System.getProperty("os.version"));//操作系统版本

            // 接收到请求，记录请求内容
            ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
            if(attributes==null) return;
            HttpServletRequest request = attributes.getRequest();
            String beanName = joinPoint.getSignature().getDeclaringTypeName();
            String methodName = joinPoint.getSignature().getName();
            String uri = request.getRequestURI();
            String remoteAddr =request.getRemoteAddr();
            String sessionId = request.getSession().getId();
            String user = (String) request.getSession().getAttribute("fromUserName");
            String httpMethod = request.getMethod();
            String params = "";
            String paramsAll = "";
//            if ("POST".equals(httpMethod)) {

            try {
                Object[] paramsArray = joinPoint.getArgs();
                ObjectMapper mapper = new ObjectMapper();
                params = mapper.writeValueAsString(paramsArray);
                paramsAll = params;
                if (!StringUtils.isEmpty(params) && params.length() > maxLength) {
                    params = params.substring(0, maxLength);
                    params = "[参数太长截取 " + maxLength + " 显示]" + params;
                }
            } catch (Exception e) {
                logger.warning("params转换失败，程序不需要处理: {}", joinPoint.getArgs());
            }


            OperatorLog optLog = new OperatorLog();
            optLog.setBeanName(beanName);
            optLog.setCurUser(user);
            optLog.setHttpMethod(httpMethod);
            optLog.setMethod(methodName);
            optLog.setParams("" + paramsAll);
            optLog.setRemoteAddr(remoteAddr);
            optLog.setSessionId(sessionId);
            optLog.setRequestUrl(uri);
            optLog.setRequestStartTime(beginTime);
            optLog.setCreateDate(new Date());
            optLog.setUserAgent(sb.toString());
            // 目标方法不为空

            threadLocal.set(optLog);
        } catch (Exception e) {
            logger.info("***操作请求日志记录失败doBefore()***", e);
        }
}



    @AfterReturning(returning = "returnValue", pointcut = "myPoint()")
    public  void AfterReturning(Object returnValue){
       logger.info("===============================================================");
        info(threadLocal);
        logger.info("返回结果——>"+JSON.toJSONString(returnValue));
        logger.info("===============================================================");
    }

    @AfterThrowing(value = "myPoint()",throwing = "exception")
    public  void  AfterThrowing(Exception exception){
        logger.info("===============================================================");
        info(threadLocal);
        logger.info("异常问题——>"+JSON.toJSONString(exception));
        logger.info("===============================================================");
    }




    private void  info( ThreadLocal<OperatorLog> threadLocal){
        if( threadLocal.get()==null) return;
        logger.info("请求路径——>"+threadLocal.get().getRequestUrl());
        logger.info("请求参数——>"+threadLocal.get().getParams());
        logger.info("IP地址——>"+threadLocal.get().getRemoteAddr());
        logger.info("操作人员——>"+threadLocal.get().getCurUser());



    }



}
