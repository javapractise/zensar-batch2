package Day12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort2 {
	public static void main(String []args) {
		ArrayList<String> al =new ArrayList<String>();
		
		al.add("Virat");
		al.add("Dhoni");
		al.add("Rahul");
		al.add("Gambhir");
		
		Collections.sort(al,Collections.reverseOrder());
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
	}

}
//output:
//Virat
//Rahul
//Gambhir
//Dhoni

