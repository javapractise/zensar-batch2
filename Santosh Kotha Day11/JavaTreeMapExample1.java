package MultiThreading;

import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMapExample1 {
	public static void main(String[] args) {
		
		TreeMap<Integer,String> map =new TreeMap<Integer,String>();
		
		map.put(100, "Gambir");
		map.put(200,"Suresh");
		map.put(140, "Rahul");
		map.put(180,"Virat");
		
		for(Map.Entry m:map.entrySet()){
			
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
