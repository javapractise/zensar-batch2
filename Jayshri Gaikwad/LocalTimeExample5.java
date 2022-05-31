package day15;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample5 {
	public static void main(String... args) {
		ZoneId zone1 = ZoneId.of("Asia/Kolkata");
		ZoneId zone2 = ZoneId.of("Asia/Tokyo");
		LocalTime time1 = LocalTime.now(zone1);
		System.out.println("India Time Zone: " + time1);
		LocalTime time2 = LocalTime.now(zone2);
		System.out.println("Japan Time Zone: " + time2);
		long hours = ChronoUnit.HOURS.between(time1, time2);
		System.out.println("Hours between two Time Zone: " + hours);
		long minutes = ChronoUnit.MINUTES.between(time1, time2);
		System.out.println("Minutes between two time zone: " + minutes);
	}
}

/*

Output:
India Time Zone: 15:13:39.926114400
Japan Time Zone: 18:43:39.927114200
Hours between two Time Zone: 3
Minutes between two time zone: 210

*/