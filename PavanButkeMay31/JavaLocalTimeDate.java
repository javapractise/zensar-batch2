package May31;


import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
public class JavaLocalTimeDate {  
    public static void main(String[] args) {  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
    }  
}  

/*o/p:
Before Formatting: 2017-01-13T17:09:42.411
After Formatting: 13-01-2017 17:09:42
*/