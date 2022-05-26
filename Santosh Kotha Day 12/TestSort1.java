package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort1 {
	public static void main(String []args) {
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("Virat");
		al.add("Dhoni");
		al.add("Rahul");
		al.add("Gambhir");
		
		Collections.sort(al);
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
//output:
//Dhoni
//Gambhir
//Rahul
//Virat
