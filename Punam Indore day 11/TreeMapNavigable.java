import java.util.*;  
public class TreeMapNavigable{  
	public static void main(String args[]){  
		NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
		map.put(100,"Punam");    
		map.put(102,"Mona");    
		map.put(101,"Raj");    
		map.put(103,"Ajay");    
		//Maintains descending order  
		System.out.println("descendingMap: "+map.descendingMap());  
		//Returns key-value pairs whose keys are less than or equal to the specified key.  
		System.out.println("headMap: "+map.headMap(102,true));  
		//Returns key-value pairs whose keys are greater than or equal to the specified key.  
		System.out.println("tailMap: "+map.tailMap(102,true));  
		//Returns key-value pairs exists in between the specified key.  
		System.out.println("subMap: "+map.subMap(100, false, 102, true));   
	}  
} 
//Output:

descendingMap: {103=Ajay, 102=Mona, 101=Raj, 100=Punam}
headMap: {100=Punam, 101=Raj, 102=Mona}
tailMap: {102=Mona, 103=Ajay}
subMap: {101=Raj, 102=Mona}
