package com.ouyang.util;

import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class PropertiesUtil {
	private static final Logger logger = LogManager
			.getLogger(PropertiesUtil.class);
	private static Properties properties = new Properties();

	private PropertiesUtil() {
		throw new Error("不要实例化!");
	}

	public static void load(String propertyName) {
		InputStream fileStream = null;
		try {
			fileStream = PropertiesUtil.class.getClassLoader()
					.getResourceAsStream(propertyName);
			properties.load(fileStream);
			logger.info("载入系统配置文件成功！");
		} catch (Exception e) {
			logger.error("载入系统配置文件错误：", e);
		} finally {
			try {
				fileStream.close();
			} catch (Exception e2) {
				logger.error("关闭流错误：", e2);
			}
		}
	}
	
	public static String getProperty(String key) {
		return properties.getProperty(key);
	}
	public static String getProperty(String key,String defaultvalue) {
		return properties.getProperty(key,defaultvalue);
	}
}
