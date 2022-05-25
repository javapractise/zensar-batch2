
import java.util.*;  
public class TreeMapExa2 {  
   public static void main(String args[]) {  
	   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	   map.put(100,"Amit");    
	   map.put(102,"Ravi");    
	   map.put(101,"Vijay");    
	   map.put(103,"Rahul");    
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


/*
Output:
	Before invoking remove() method
	100 Amit
	101 Vijay
	102 Ravi
	103 Rahul
	After invoking remove() method
	100 Amit
	101 Vijay
	103 Rahul
	*/
