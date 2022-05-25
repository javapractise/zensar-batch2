import java.util.*;  
public class TreeMapExa{  
 public static void main(String args[]){  
   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Punam");    
      map.put(102,"Mona");    
      map.put(101,"Raj");    
      map.put(103,"Ajay");    
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  
//Output:
        100 Punam
	      101 Mona
	      102 Raj
	      103 Ajay
