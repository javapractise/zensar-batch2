package May31;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class JavaMinus {  
public static void main(String[] args) {  
  LocalDateTime datetime1 = LocalDateTime.of(2017, 1, 14, 10, 34);  
  LocalDateTime datetime2 = datetime1.minusDays(100);  
  System.out.println("Before Formatting: " + datetime2);  
  DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");  
  String formatDateTime = datetime2.format(format);   
  System.out.println("After Formatting: " + formatDateTime );  
}  
}  

/*o/p:
Before Formatting: 2016-10-06T10:34
After Formatting: 06-10-2016 10:34
*/