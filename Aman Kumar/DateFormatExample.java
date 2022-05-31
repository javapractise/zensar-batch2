package day15;

import java.text.DateFormat;
import java.util.Date;

public class DateFormatExample {
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("Current Date:" + currentDate);
		String dateToStr = DateFormat.getInstance().format(currentDate);
		System.out.println("Date Format using getInstance():" + dateToStr);

	}
}

/*

Output:
Current Date:Tue May 31 15:33:31 IST 2022
Date Format using getInstance():5/31/22, 3:33 PM

*/