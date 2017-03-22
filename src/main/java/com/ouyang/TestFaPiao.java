package com.ouyang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import com.ouyang.util.net.HttpClientUtil;

public class TestFaPiao {
	public static void main(String[] args) throws Exception {
		while (true) {
			String url = "http://wsbs.sc-n-tax.gov.cn/fpcy/query.htm";
			List<NameValuePair> nvps = new ArrayList<>();
			nvps.add(new BasicNameValuePair("fpcy.fpdm", "15101167Z004"));
			nvps.add(new BasicNameValuePair("fpcy.fphm", "09032270"));
			nvps.add(new BasicNameValuePair("fpcy.type", "0"));
			Map<String, String> header = new HashMap<>();
			header.put("Cookie", "JSESSIONID=33995403A15E1648CBB373E8F7E79AE2; sid=2f045a12-d5bd-42be-9146-9869c4d8f968; wsbs_city_code=510100; last_update_city_time=Sun%20Mar%2012%202017%2022%3A55%3A47%20GMT%2B0800");
			header.put("Referer", "http://wsbs.sc-n-tax.gov.cn/fpcy/init.htm");
			String result = HttpClientUtil.postWithHeader(header, url, nvps);
			System.out.println(result);
		}
	}
}
