import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TA{


   public static void main(String args[]) {
      TA t = new TA();
      t.testAdjusters(); 	  
   }

   public void testAdjusters() {
      //Get the current date
      LocalDate date1 = LocalDate.now();
      System.out.println("Current date: " + date1);	  

      //get the next tuesday
      LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
      System.out.println("Next Tuesday on : " + nextTuesday);

      //get the second saturday of next month
      LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);

      LocalDate secondSaturday = firstInYear.with(
         TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(
         TemporalAdjusters.next(DayOfWeek.SATURDAY));
      System.out.println("Second saturday on : " + secondSaturday);	   
   }	
}

/**
Current date: 2022-05-31
Next Tuesday on : 2022-06-07
Second saturday on : 2022-05-14
**/