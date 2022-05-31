package Day15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
public static void main(String[] args) {
	
	

	LocalDateTime datetime11 = LocalDateTime.now();
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd_MM_yyyy HH:mm:ss");
	

	String formatDateTime = datetime11.format(format);
	System.out.println(formatDateTime);
	
}
}

//output:
//31_05_2022 18:18:14
