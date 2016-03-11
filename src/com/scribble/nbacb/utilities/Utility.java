package com.scribble.nbacb.utilities;

import java.util.Calendar;
import java.util.Date;

public class Utility {

	public static Boolean isPastDate(Date matchDate) {
		Calendar matchDateCalendar = Calendar.getInstance();
		matchDateCalendar.setTime(matchDate);
		Calendar currentDateCalendar = Calendar.getInstance();
		return (matchDateCalendar.get(Calendar.YEAR) < currentDateCalendar.get(Calendar.YEAR))
				|| (matchDateCalendar.get(Calendar.YEAR) == currentDateCalendar.get(Calendar.YEAR) && matchDateCalendar.get(Calendar.MONTH) < currentDateCalendar.get(Calendar.MONTH))
				|| (matchDateCalendar.get(Calendar.YEAR) == currentDateCalendar.get(Calendar.YEAR) 
					&& matchDateCalendar.get(Calendar.MONTH) == currentDateCalendar.get(Calendar.MONTH) && matchDateCalendar.get(Calendar.DATE) < currentDateCalendar.get(Calendar.DATE));
	}

	public static Boolean isToday(Date matchDate) {
		Calendar matchDateCalendar = Calendar.getInstance();
		matchDateCalendar.setTime(matchDate);
		Calendar currentDateCalendar = Calendar.getInstance();
		return (matchDateCalendar.get(Calendar.YEAR) == currentDateCalendar.get(Calendar.YEAR) 
				&& matchDateCalendar.get(Calendar.MONTH) == currentDateCalendar.get(Calendar.MONTH) 
				&& matchDateCalendar.get(Calendar.DATE) == currentDateCalendar.get(Calendar.DATE));
	}
	
}
