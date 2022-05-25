package zensar;
import java.util.*;

public class TreeMapRemove {

	
  
	
	   public static void main(String args[]) {  
	    TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Banana Chips");    
	      map.put(10,"Water");    
	      map.put(88,"Glasses");    
	      map.put(7800,"Ticket");    
	      System.out.println("Before invoking remove() method");  
	      for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      map.remove(102);      
	      System.out.println("After invoking remove() method");  
	      for(Map.Entry m:map.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	      }  
	}  

/*o/p:->
Before invoking remove() method
10 Water
88 Glasses
100 Banana Chips
7800 Ticket
After invoking remove() method
10 Water
88 Glasses
100 Banana Chips
7800 Ticket
*/
