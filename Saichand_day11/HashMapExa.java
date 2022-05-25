package Treads;


	import java.util.HashMap;
	import java.util.Map;

	public class HashMapExa {
		public static void main(String args[]){
			HashMap<Integer,String>map=new HashMap<Integer,String>();//creating HasMap
			map.put(1,"gold");//put elements in map
			map.put(2,"Silver");
			map.put(3,"Diamond");
			map.put(4,"copper");
			System.out.println("iterating Hashmap...");
			for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+""+m.getValue());
			}
		}

}
