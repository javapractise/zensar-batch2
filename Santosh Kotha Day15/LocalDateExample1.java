package Day15;

import java.time.LocalDate;

public class LocalDateExample1 {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tommorow = yesterday.plusDays(2);
		System.out.println("Today date;"+date);
		System.out.println("yesterday date:"+yesterday);
		System.out.println("tommorow date:"+tommorow);
		
	}

}

//output:
//Today date;2022-05-31
//yesterday date:2022-05-30
//tommorow date:2022-06-01
