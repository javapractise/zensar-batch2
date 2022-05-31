package May31;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.DayOfWeek;

public class TemporalAdjustor {
   public static void main(String args[]) {
	   TemporalAdjustor java8tester = new TemporalAdjustor();
      java8tester.testAdjusters(); 	  
   }

   public void testAdjusters() {
      
      LocalDate date1 = LocalDate.now();
      System.out.println("Current date: " + date1);	  

    
      LocalDate nextTuesday = date1.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
      System.out.println("Next Tuesday on : " + nextTuesday);

     
      LocalDate firstInYear = LocalDate.of(date1.getYear(),date1.getMonth(), 1);

      LocalDate secondSaturday = firstInYear.with(
         TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY)).with(
         TemporalAdjusters.next(DayOfWeek.SATURDAY));
      System.out.println("Second saturday on : " + secondSaturday);	   
   }	
}


/*o/p:
Current date: 2022-05-31
Next Tuesday on : 2022-06-07
Second saturday on : 2022-05-14
*/