package MultiThreading;

import java.util.*;

public class JavaHashMap {
	public static void main(String args[]) {
		
		HashMap<Integer,String>  map = new HashMap<Integer,String>();//Creating a HashMap
		
		map.put(1,"Apple");//Pit elements in Map
		map.put(2,"Mango");
		map.put(3,"Banana");
		map.put(4,"Grapes");
		
		System.out.println("iterating HashMap...");
		
		for(Map.Entry m : map.entrySet()){
			
			System.out.println(m.getKey()+""+m.getValue());
	}
	
	

	
	}

}
//output*
//iterating HashMap...
//1Apple
//2Mango
//3Banana
//4Grapes

