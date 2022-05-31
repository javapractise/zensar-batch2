package May31;
import java.util.*;  

public class TzClass {

	
	
 
	public static void main( String argvs[] )   
	{  
	  
	  
	TimeZone tz = TimeZone.getDefault();  
	  

	tz.setID("GMT + 07:01");  
	  
	
	
	System.out.println("The Time zone ID is: " + tz.getID());  
	}      
	
}


/*o/p:The Time zone ID is: GMT + 07:01
*/