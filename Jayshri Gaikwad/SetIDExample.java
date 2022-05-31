package day15;

import java.util.*;

public class SetIDExample {

	public static void main(String argvs[]) {

		TimeZone tz = TimeZone.getDefault();
		tz.setID("GMT + 07:01");
		System.out.println("The Time zone ID is: " + tz.getID());
	}
}

/*

Output:
The Time zone ID is: GMT + 07:01

*/