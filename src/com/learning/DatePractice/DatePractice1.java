package com.learning.DatePractice;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatePractice1 {
	
	public static void main(String[] args) throws ParseException {
		/*System.out.println("Long : "+ new Date().getTime());
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = df.parse(new Date().toString());
        System.out.println("DATE LONG: "+date.getTime());*/
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
		LocalDateTime localDate = LocalDateTime.now();
		System.out.println(Long.parseLong(dtf.format(localDate)));
		//dtf.format(localDate).get;
	}

}
