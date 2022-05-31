import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

public class DateAPI {

	public static void main(String args[]) {
	      DateAPI d = new DateAPI();
	      d.testLocalDateTime();
	   }
		
	   public void testLocalDateTime() {
	      // Get the current date and time
	      LocalDateTime currentTime = LocalDateTime.now();
	      System.out.println("Current DateTime: " + currentTime);
			
	      LocalDate date1 = currentTime.toLocalDate();
	      System.out.println("date1: " + date1);
			
	      Month month = currentTime.getMonth();
	      int day = currentTime.getDayOfMonth();
	      int seconds = currentTime.getSecond();
			
	      System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);
			
	      LocalDateTime date2 = currentTime.withDayOfMonth(10).withYear(2022);
	      System.out.println("date2: " + date2);
			
	  
	      LocalDate date3 = LocalDate.of(2022, Month.DECEMBER, 12);
	      System.out.println("date3: " + date3);
			
	      //22 hour 15 minutes
	      LocalTime date4 = LocalTime.of(22, 15);
	      System.out.println("date4: " + date4);
			
	      //parse a string
	      LocalTime date5 = LocalTime.parse("20:15:30");
	      System.out.println("date5: " + date5);
	   }

}

/**
Current DateTime: 2022-05-31T15:22:43.694736500
date1: 2022-05-31
Month: MAYday: 31seconds: 43
date2: 2022-05-10T15:22:43.694736500
date3: 2022-12-12
date4: 22:15
date5: 20:15:30
**/