package com.fksb.Interceptor;

import com.sun.istack.internal.logging.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class LoginInterceptor implements HandlerInterceptor {
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
  
        HandlerMethod handMethod=null;
        if(handler instanceof HandlerMethod) {
             handMethod = (HandlerMethod) handler;
            System.out.println("-------类["+handMethod.getBean().getClass().getName()+"]" +
                    "方法名["+handMethod.getMethod().getName()+"]" +
                    "参数["+ Arrays.toString(handMethod.getMethodParameters()) +"]前执行--------preHandle");

        }

        String userAgent = request.getHeader("user-agent").toLowerCase();
        if(userAgent.indexOf("micromessenger")>-1){//微信客户端
            request.setAttribute("isWx", "1");

        }else{
            request.setAttribute("isWx", "0");
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write("请使用微信客户端访问!");
            return false;
        }

        /*判断session 中是否有openid*/
        if(!StringUtils.isEmpty(request.getSession().getAttribute("fromUserName"))){
            logger.info(request.getSession().getAttribute("fromUserName")+"=====查看登录user===========");
            request.getSession().setMaxInactiveInterval(3600*24*3);
            return true;
        }else{
            response.sendRedirect(request.getContextPath()+"/wxbdController/sessionout");
            return false;
         }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
