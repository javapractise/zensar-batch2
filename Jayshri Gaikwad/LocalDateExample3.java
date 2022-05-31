package day15;

import java.time.*;

public class LocalDateExample3 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2017, 1, 13);
		LocalDateTime datetime = date.atTime(2, 58, 9);
		System.out.println(datetime);
	}
}


/*

Output:
2017-01-13T02:58:09


*/