package day15;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneExample2 {
	public static void main(String args[]) {
		TimeZone zone = TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("The offset value of TimeZone:" + zone.getOffset(Calendar.ZONE_OFFSET));
	}
}


/*

Output:
The offset value of TimeZone:19800000

*/