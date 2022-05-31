package day15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample2 {
	public static void main(String[] args) {
		LocalDateTime datetime1 = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyy HH:mm:ss");
		String formatDateTime = datetime1.format(format);
		System.out.println(formatDateTime);
	}
}

/*

Output:
31-19-2022 15:19:30

*/