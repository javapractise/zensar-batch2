package day15;

import java.util.TimeZone;

public class TimeZoneExample4 {
	public static void main(String args[]) {
		TimeZone Zone = TimeZone.getDefault();
		String name = Zone.getDisplayName();
		System.out.println("Display name for default time zone: " + name);
	}
}

/*

Output:
Display name for default time zone: India Standard Time

*/