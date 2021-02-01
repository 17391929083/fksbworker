package com.fksb.fksbworkeraop.logeraop;

import java.util.Date;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class OperatorLog {

    private String beanName;
    private String curUser;
    private String method;
    private String httpMethod;
    private String params;
    private String remoteAddr;
    private String sessionId;
    private String requestUrl;
    private long RequestStartTime;
    private Date createDate;
    private String userAgent;
    private Object result;
    private Long requestTime;
    private Long requestEndTime;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public String getCurUser() {
        return curUser;
    }

    public void setCurUser(String curUser) {
        this.curUser = curUser;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(String remoteAddr) {
        this.remoteAddr = remoteAddr;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public long getRequestStartTime() {
        return RequestStartTime;
    }

    public void setRequestStartTime(long requestStartTime) {
        RequestStartTime = requestStartTime;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public Long getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Long requestTime) {
        this.requestTime = requestTime;
    }

    public Long getRequestEndTime() {
        return requestEndTime;
    }

    public void setRequestEndTime(Long requestEndTime) {
        this.requestEndTime = requestEndTime;
    }


    @Override
    public String toString() {
        return "OperatorLog{" +
                "beanName='" + beanName + '\'' +
                ", curUser='" + curUser + '\'' +
                ", method='" + method + '\'' +
                ", httpMethod='" + httpMethod + '\'' +
                ", params='" + params + '\'' +
                ", remoteAddr='" + remoteAddr + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", requestUrl='" + requestUrl + '\'' +
                ", RequestStartTime=" + RequestStartTime +
                ", createDate=" + createDate +
                ", userAgent='" + userAgent + '\'' +
                ", result=" + result +
                ", requestTime=" + requestTime +
                ", requestEndTime=" + requestEndTime +
                '}';
    }
}
