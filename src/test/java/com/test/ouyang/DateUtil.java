package com.test.ouyang;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	
	public static String fmtLong2String(long time){
		return sf.format(new Date(time));
	}
}
