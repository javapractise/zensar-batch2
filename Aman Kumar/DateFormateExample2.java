package day15;

import java.text.DateFormat;
import java.util.Date;

public class DateFormateExample2 {
	public static void main(String[] args) throws Exception {
		Date d = DateFormat.getDateInstance().parse("31 Mar, 2015");
		System.out.println("Date is: " + d);
	}
}