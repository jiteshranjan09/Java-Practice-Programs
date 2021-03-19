package oOpsPart1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Date is class which comes from Java.util package
		
		Date date = new Date();
		String currentDate = date.toString();
		System.out.println(currentDate);
		
		//SimpleDateFormat is class comes from Text package and it helps to format the date.
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		sdf.applyPattern("dd,MM,yyyy");
		sdf.toLocalizedPattern();
		
		System.out.println(sdf.format(date));
		
		//Calendar is class comes from Util package and it has more method than Date class.
		Calendar calc= Calendar.getInstance();
		
		System.out.println(calc.getTimeInMillis());
		System.out.println(calc.getTime());
		System.out.println(calc.getTimeZone());
		System.out.println(calc.getFirstDayOfWeek());
		System.out.println(calc.get(Calendar.DATE));
		System.out.println(calc.get(Calendar.DAY_OF_WEEK));
		System.out.println(calc.get(Calendar.DAY_OF_YEAR));
		System.out.println(calc.get(Calendar.AM_PM));
		System.out.println(calc.getWeeksInWeekYear());

	}

}
