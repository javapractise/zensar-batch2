package Saichand_day15;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.DayOfWeek;



public class TemporalAdjusters {
   public static void main(String args[]) {
      TemporalAdjusters java8tester = new TemporalAdjusters();
      java8tester.testAdjusters(); 	  
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

private static TemporalAdjuster next(DayOfWeek saturday) {
	// TODO Auto-generated method stub
	return null;
}

private static TemporalAdjuster nextOrSame(DayOfWeek saturday) {
	// TODO Auto-generated method stub
	return null;
}	
}
/* output:'
 Current date: 2022-05-31
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.time.temporal.TemporalAdjuster.adjustInto(java.time.temporal.Temporal)" because "adjuster" is null
	at java.base/java.time.LocalDate.with(LocalDate.java:938)
	at hello/Saichand_day15.TemporalAdjusters.testAdjusters(TemporalAdjusters.java:20)
	at hello/Saichand_day15.TemporalAdjusters.main(TemporalAdjusters.java:11)
*/
