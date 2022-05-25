import java.util.*;  
public class HashSetExa{  
	public static void main(String args[]){  
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Punam");  
		set.add("Mona");  
		set.add("Punam");  
		set.add("Mona");  
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}  

//Output:
        Punam
        Mona
        Punam
        Mona
