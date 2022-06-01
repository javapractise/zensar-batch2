
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class LocalDateTimeMinusPlusDays {  
public static void main(String[] args) {  
  LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);  
  LocalDateTime datetime2 = datetime1.minusDays(100);  
  System.out.println("Before Formatting: " + datetime2);  
  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
  String formatDateTime = datetime2.format(format);   
  System.out.println("After Formatting(minus Days): " + formatDateTime );  
  LocalDateTime datetime3 = datetime1.plusDays(120); 
  String formatDateTime2 = datetime3.format(format);   
  System.out.println("After Formatting(Plus Days): " + formatDateTime2 );  
}  
}  


/*Output:
Before Formatting: 2016-10-06T10:34
After Formatting(minus Days): 06-10-2016 10:34
After Formatting(Plus Days): 14-05-2017 10:34
*/