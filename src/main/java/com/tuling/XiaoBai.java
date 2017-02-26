package com.tuling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;

public class XiaoBai {
	private static final Logger logger = Logger.getLogger(XiaoBai.class);
	public static void main(String[] args) throws IOException {
		System.out.println(getAnswer("我们什么时候认识的"));
		
	}
	
	public static String getAnswer(String question) {
		String APIKEY = "9753cfbae7e980c035a640b51c0b5687";
		String INFO = "";
		String userId = "ouyangxidexiaobai";
		StringBuffer sb = new StringBuffer();
		try {
			INFO = URLEncoder.encode(question, "utf-8");
			String getURL = "http://www.tuling123.com/openapi/api?key="
					+ APIKEY + "&info=" + INFO+"&userid="+userId;
			URL getUrl = new URL(getURL);
			HttpURLConnection connection = (HttpURLConnection) getUrl
					.openConnection();
			connection.connect();

			// 取得输入流，并使用Reader读取
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					connection.getInputStream(), "utf-8"));
			String line = "";
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			// 断开连接
			connection.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String result = sb.toString();
		Map<String, String> resultMap = JSON.parseObject(result, Map.class);
		return resultMap.get("text");
	}
	
}
