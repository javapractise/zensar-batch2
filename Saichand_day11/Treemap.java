package Treads;
import java.util.*;
public class Treemap {
	  
	  
	 public static void main(String args[]){  
	   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"teja");    
	      map.put(102,"saichand");    
	      map.put(101,"uma");    
	      map.put(103,"subbarao");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	 }  

}
/* out put:
100 teja
101 uma
102 saichand
103 subbarao
*/