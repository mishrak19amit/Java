package org.amit.time;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CheckDate {

	public static void main(String[] args) {
		SimpleDateFormat datetimeFormatter1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Date lFromDate1;
		try {
			lFromDate1 = datetimeFormatter1.parse("2016-03-22 20:25:28");
			Timestamp fromTS1 = new Timestamp(lFromDate1.getTime());
		} catch (ParseException e) {
			System.out.println("Wrong line format ("+e+"): ");
		}
		
	
		
	}
}
