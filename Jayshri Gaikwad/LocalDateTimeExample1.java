package day15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample1 {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Before Formatting:" + now);
		DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss");
		String FormatDateTime = now.format(Format);
		System.out.println("After Formatting:" + FormatDateTime);

	}
}

/*

Output:
Before Formatting:2022-05-31T15:16:39.083175600
After Formatting:31-05-2022-15:16:39

*/