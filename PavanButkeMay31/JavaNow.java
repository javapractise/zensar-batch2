package May31;

import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class JavaNow {  
  public static void main(String[] args) {  
    LocalDateTime datetime1 = LocalDateTime.now();  
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
    String formatDateTime = datetime1.format(format);   
    System.out.println(formatDateTime);    
  }  
}  


/*o/p:31-05-2022 16:48:23*/
