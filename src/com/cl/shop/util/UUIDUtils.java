package com.cl.shop.util;

import java.util.UUID;
//生成随机生成的字符串
public class UUIDUtils {
	/**
	 * 获得随机的字符串
	 * @return
	 */
	public static String getUUID(){
		//replace("-", "");去掉生成的-
		return UUID.randomUUID().toString().replace("-", "");
	}
}
