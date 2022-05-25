import java.util.*;  
public class TreeMapSorted{  
	public static void main(String args[]){  
		SortedMap<Integer,String> map=new TreeMap<Integer,String>();    
		map.put(100,"Punam");    
		map.put(102,"Mona");    
		map.put(101,"Raj");    
		map.put(103,"Ajay");    
		//Returns key-value pairs whose keys are less than the specified key.  
		System.out.println("headMap: "+map.headMap(102));  
		//Returns key-value pairs whose keys are greater than or equal to the specified key.  
		System.out.println("tailMap: "+map.tailMap(102));  
		//Returns key-value pairs exists in between the specified key.  
		System.out.println("subMap: "+map.subMap(100, 102));    
	}  
}  
//Output:

headMap: {100=Punam, 101=Raj}
tailMap: {102=Mona, 103=Ajay}
subMap: {100=Punam, 101=Raj}
