package com.wordpress.admin;

import java.text.DateFormatSymbols;

import org.joda.time.DateTime;

public class testTime {

	public static void main(String[] args) {
		DateTime nowUTC = new DateTime();
		int month = nowUTC.getMonthOfYear();
		String monthValue = new DateFormatSymbols().getShortMonths()[month-1];
		System.out.println(month);
		System.out.println(monthValue);
	}

}
