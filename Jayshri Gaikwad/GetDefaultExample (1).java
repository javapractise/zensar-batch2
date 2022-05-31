package day15;

import java.util.*;

public class GetDefaultExample {

	public static void main(String[] argvs) {
		TimeZone zone = TimeZone.getDefault();
		System.out.println("The ID of the default TimeZone is: " + zone.getID());

	}
}

/*

Output:
The ID of the default TimeZone is: Asia/Calcutta

*/