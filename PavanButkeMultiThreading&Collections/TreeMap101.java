package zensar;
import java.util.*;

public class TreeMap101 {
	

		 public static void main(String args[]){  
	
		   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(79,"Coke");    
		      map.put(54,"Chips");    
		      map.put(89,"Banana Chips");    
		      map.put(11,"Sausage");    
		        
		      for(Map.Entry m:map.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		       
		 }  
		} 

}


/*o/p:
11 Sausage
54 Chips
79 Coke
89 Banana Chips
*/