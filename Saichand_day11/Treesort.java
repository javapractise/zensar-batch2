package Treads;
import java.util.*;
public class Treesort {
	  
	  
		public static void main(String args[]){  
			SortedMap<Integer,String> map=new TreeMap<Integer,String>();    
			map.put(100,"saichand");    
			map.put(102,"uma");    
			map.put(101,"tejaswini");    
			map.put(103,"rupa");    
			//Returns key-value pairs whose keys are less than the specified key.  
			System.out.println("headMap: "+map.headMap(102));  
			//Returns key-value pairs whose keys are greater than or equal to the specified key.  
			System.out.println("tailMap: "+map.tailMap(102));  
			//Returns key-value pairs exists in between the specified key.  
			System.out.println("subMap: "+map.subMap(100, 102));    
		}  
}
/* output:
headMap: {100=saichand, 101=tejaswini}
tailMap: {102=uma, 103=rupa}
subMap: {100=saichand, 101=tejaswini}
*/