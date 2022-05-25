import java.util.*;  
public class TreeMapExa2 {  
   public static void main(String args[]) {  
	   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	   map.put(100,"Punam");    
	   map.put(102,"Mona");    
	   map.put(101,"Raj");    
	   map.put(103,"Ajay");    
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

//OutPut:

  Before invoking remove() method
	100 Punam
	101 Mona
	102 Raj
	103 Ajay
	After invoking remove() method
	100 Punam
	101 Mona
	103 Ajay
