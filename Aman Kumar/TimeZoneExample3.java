package day15;

import java.util.*;

public class TimeZoneExample3 {
	public static void main(String args[]) {
		TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");
		System.out.println("Value of ID is: " + timezone.getID());
	}
}

/*

Output:
Value of ID is: Asia/Kolkata

*/