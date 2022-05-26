package May26;
import java.util.concurrent.ConcurrentHashMap;   
import java.util.Iterator;   

public class FailSafeEx11 {
	


	    public static void main(String[] args)   
	    {   
	      
	        ConcurrentHashMap<String, Integer> m   
	            = new ConcurrentHashMap<String, Integer>();   
	        m.put("Bisuit", 10); //Adding values  
	        m.put("Water", 20);   
	        m.put("Maggie", 5);   
	        m.put("Bread", 18);   
	      
	        Iterator it = m.keySet().iterator();   
	        while (it.hasNext()) {   
	            String key = (String)it.next();   
	            System.out.println(key + " : " + m.get(key));   
	         
	            m.put("NINE", 9);   
	        }   
	    }   
	}  


/* o/p--> 
Water : 20
Bisuit : 10
Maggie : 5
Bread : 18
*/