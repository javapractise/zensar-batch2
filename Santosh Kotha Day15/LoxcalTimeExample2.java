package Day15;

import java.time.LocalTime;

public class LoxcalTimeExample2 {

	public static void main(String []args) {
		LocalTime time1 = LocalTime.of(11,44,12);
		System.out.println(time1);
		LocalTime time2 = time1.minusHours(2);
		LocalTime time3 = time2.minusMinutes(34);
		System.out.println(time3);
	}
}

//output:
//11:44:12
//09:10:12
