package com.cognizant.truyum.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date convertToDate(String date) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy")
		Date date=sdf.parse(date);
		return date;
		
	}
}
