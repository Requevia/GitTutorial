package org.avr.ztest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMath {

	public static void main(String[] args) {
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime( today );
		cal.add( Calendar.DATE , 7 );
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println( sdf.format("$"+ cal.getTime() ) );
	}

}
