
import java.util.*;
public class TimeZoneExample {
	public static void main(String args[]){
		TimeZone  zone=TimeZone.getTimeZone("Hyd/kolkata");
		System.out.println("The offset value of TimeZone(Hyd/kolkata):"+zone.getOffset(Calendar.ZONE_OFFSET));
		TimeZone Zone1= TimeZone.getDefault();
		String name=Zone1.getDisplayName();
		System.out.println("Display name for default time zone:"+name);
		System.out.println("The ID of the default TimeZone is: " + Zone1.getID());
 }
}

/*
Output:
The offset value of TimeZone(Hyd/kolkata):0
Display name for default time zone:India Standard Time
The ID of the default TimeZone is: Asia/Calcutta
*/