package Saichand_day15;
import java.util.*;
public class Timezone_getOffset {
	

	
	   public static void main( String args[] ) {

	      // create time zone object     
	      TimeZone timezone = TimeZone.getTimeZone("Asia/Kolkata");

	      // checking offset value for date      
	      System.out.println("Offset value:" + 
	      timezone.getOffset(Calendar.ZONE_OFFSET));
	   }    

}
/* output:
Offset value:19800000 */
