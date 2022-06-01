
import java.util.*;  

public class TimeZonesetId   
{  
     
// main method  
public static void main( String argvs[] )   
{  
  
// creating an object of the class TimeZone   
TimeZone tz = TimeZone.getDefault();  
  
// setting the time zone ID  
tz.setID("GMT + 07:01");  
  
// checking for the time zone ID  
System.out.println("The Time zone ID is: " + tz.getID());  
}      
}  

/*
Output:
The Time zone ID is: GMT + 07:01
*/