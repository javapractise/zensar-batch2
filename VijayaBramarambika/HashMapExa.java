import java.util.HashMap;
import java.util.Map;

public class HashMapExa {
	public static void main(String args[]){
		HashMap<Integer,String>map=new HashMap<Integer,String>();//creating HasMap
		map.put(1,"Mango");//put elements in map
		map.put(2,"Apple");
		map.put(3,"Banana");
		map.put(4,"Grapes");
		System.out.println("iterating Hashmap...");
		for(Map.Entry m:map.entrySet()){
		System.out.println(m.getKey()+""+m.getValue());
		}
	}
}


/*
Ouput:
iterating Hashmap...
1Mango
2Apple
3Banana
4Grapes
*/
