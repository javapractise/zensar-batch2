package May31;

import java.util.*;  

public class HandleTimeZone  
{  
  
public static void main(String[] argvs)  
{  

TimeZone zone = TimeZone.getDefault();     
System.out.println("The ID of the default TimeZone is: " + zone.getID());    
   
}  
}  

/*o/p:The ID of the default TimeZone is: Asia/Calcutta*/