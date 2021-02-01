package com.fksb.utill;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/*
 *@Author 常胜杰  QQ1209939478
 *@Slogin  致敬大师 致敬未来的你
 */
public class WeiXinInfoUtill {

    private static  String GET_WEIJIEHAO_URL = "http://123.56.158.209/jeewx/openDataController.do?JiekouWeixinToken&weixinId=WEIXINID";
    private static  String APPID = "wxdab3c000e1d5d3d2";



    public static JSONObject selWeixin(HttpServletRequest request)
    {
        JSONObject json = HttpUtil.sendJson(GET_WEIJIEHAO_URL.replace("WEIXINID", "gh_97eaf6ef183d"));
         /*
         * 生成随机字符串
         * */
        String noncestr = WXPayUtil.generateNonceStr();
          //时间
        String timestamp = new SimpleDateFormat("MMddHHmmss").format(new Date());
       //票据
        String jsapi_ticket = json.getString("jsapiticket");
         //openid    "";
        String openid =request.getSession().getAttribute("userFromName")==null?"oX9y-uD3PV5ArZA6WdEooFpXnSqA":request.getSession().getAttribute("userFromName").toString();

        //url
        String url =request.getParameter("url"); //REQ_URL.replace("USERNAME", "324").replace("ID", "1").replace("fromUsername",openid);
        //签名
        String signature = getSign(timestamp, noncestr, jsapi_ticket, url);
        Map map = new HashMap();
        map.put("appId", APPID);
        map.put("timestamp", timestamp);
        map.put("nonceStr", noncestr);
        map.put("jsapi_ticket", jsapi_ticket);
        map.put("signature", signature);
        return (com.alibaba.fastjson.JSONObject)com.alibaba.fastjson.JSONObject.toJSON(map);
    }

    public static String getSign(String timestamp, String noncestr, String jsapi_ticket, String url) {
        String[] arr = { "jsapi_ticket=" + jsapi_ticket, "noncestr=" + noncestr, "timestamp=" + timestamp, "url=" + url };
        Arrays.sort(arr);
        String str = "";
        str = arr[0] + "&" + arr[1] + "&" + arr[2] + "&" + arr[3];
        System.out.println(str);
        String mParms = null;
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-1");
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        digest.update(str.getBytes());
        byte[] messageDigest = digest.digest();

        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < messageDigest.length; i++) {
            String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
            if (shaHex.length() < 2) {
                hexString.append(0);
            }
            hexString.append(shaHex);
        }
        mParms = hexString.toString();
        return mParms;
    }

    /*获取用户信息*/



}
