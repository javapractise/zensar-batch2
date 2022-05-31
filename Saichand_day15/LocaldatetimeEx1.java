package Saichand_day15;
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter;  
  
public class LocaldatetimeEx1 {
	
	    public static void main(String[] args) {  
	        LocalDateTime now = LocalDateTime.now();  
	        System.out.println("yesterday: " + now);  
	        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");  
	        String Tommorow = now.format(format);  
	        System.out.println("After Formatting: " + Tommorow);  
	    }  

}
