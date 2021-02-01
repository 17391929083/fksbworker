package com.fksb.utill;
import com.alibaba.fastjson.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;








public class HttpUtil {

	/**
	 * Get 获得json
	 * @param url
	 * @return
	 */
    public static JSONObject sendJson(String url) {
  	  JSONObject jsonObject = null;
      BufferedReader in = null;
      StringBuffer buffer = new StringBuffer();
      try {
          String urlNameString = url;
          URL realUrl = new URL(urlNameString);
          // 打开和URL之间的连接
          URLConnection connection = realUrl.openConnection();
          // 设置通用的请求属性
          connection.setRequestProperty("accept", "*/*");
          connection.setRequestProperty("connection", "Keep-Alive");
          connection.setRequestProperty("user-agent",
                  "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
          // 建立实际的连接
          connection.connect();
          // 获取所有响应头字段
          Map<String, List<String>> map = connection.getHeaderFields();
          // 定义 BufferedReader输入流来读取URL的响应
          in = new BufferedReader(new InputStreamReader(
                  connection.getInputStream(),"UTF-8"));
          String line;
          while ((line = in.readLine()) != null) {
          	 buffer.append(line);
          }
         jsonObject = (JSONObject) JSONObject.parse(buffer.toString());
      } catch (Exception e) {
          System.out.println("发送GET请求出现异常！" + e);
          e.printStackTrace();
      }
      // 使用finally块来关闭输入流
      finally {
          try {
              if (in != null) {
                  in.close();
              }
          } catch (Exception e2) {
              e2.printStackTrace();
          }
      }
      return jsonObject;
  }




    /**
     * 向指定 URL 发送POST方法的请求
     *
     * @param

     * @param

     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String sendUrl, String sendParam,
                                  String backEncodType) {
        StringBuffer receive = new StringBuffer();
        BufferedWriter wr = null;
        try {
            if (backEncodType == null || backEncodType.equals("")) {
                backEncodType = "UTF-8";
            }

            URL url = new URL(sendUrl);
            HttpURLConnection URLConn = (HttpURLConnection) url
                    .openConnection();

            URLConn.setDoOutput(true);
            URLConn.setDoInput(true);
            ((HttpURLConnection) URLConn).setRequestMethod("POST");
            URLConn.setUseCaches(false);
            URLConn.setAllowUserInteraction(true);
            HttpURLConnection.setFollowRedirects(true);
            URLConn.setInstanceFollowRedirects(true);

            URLConn.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded;charset=UTF-8");
            URLConn.setRequestProperty("Content-Length", String
                    .valueOf(sendParam.getBytes().length));

            DataOutputStream dos = new DataOutputStream(URLConn
                    .getOutputStream());
            dos.writeBytes(sendParam);

            BufferedReader rd = new BufferedReader(new InputStreamReader(
                    URLConn.getInputStream(), backEncodType));
            String line;
            while ((line = rd.readLine()) != null) {
                receive.append(line).append("\r\n");
            }
            rd.close();
        } catch (java.io.IOException e) {
            receive.append("访问产生了异常-->").append(e.getMessage());
            e.printStackTrace();
        } finally {
            if (wr != null) {
                try {
                    wr.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                wr = null;
            }
        }

        return receive.toString();
    }

	
}
