package com.gxr.com.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @Description: TODO 邮箱验证
 * @author A18ccms A18ccms_gmail_com
 * @date 2016年4月11日 下午2:23:36
 * @verson V1.0
 */
public class EmailUtis {

	/**
	 * 验证邮箱格式是否正确
	 * 
	 * @param email
	 *            邮件
	 * @return
	 * 
	 * **/
	public boolean isEmail(String email) {
		String str = "^([a-zA-Z0-9]*[-_.]?[a-zA-Z0-9]+)*@([a-zA-Z0-9]*[-_]?[a-zA-Z0-9]+)+[\\.][A-Za-z]{2,3}([\\.][A-Za-z]{2})?$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(email);
		return m.matches();
	}
}
