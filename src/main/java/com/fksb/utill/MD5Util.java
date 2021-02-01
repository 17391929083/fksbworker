package com.fksb.utill;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import sun.misc.BASE64Encoder;

/** 
 * 功能描述: MD5加密工具类
 * 作者： 朱朋涛
 * 日期： 2013-4-11 上午8:43:59 
 * 版本：V1.0
 */
public final class MD5Util {

	/**
	 * 
	
	* @Description: 把密码生成摘要
	
	* @param pwd	原始密码
	* @return    设定文件 
	
	* @return String    加密后生成的摘要
	
	* @throws
	 */
	@SuppressWarnings("restriction")
	public static String getValue(String pwd) {
		String password = null;
		try {
			MessageDigest md = MessageDigest.getInstance("md5");
			byte[] buf = md.digest(pwd.getBytes());
			BASE64Encoder encoder = new BASE64Encoder();
			password = encoder.encode(buf);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return password;
	}
}
