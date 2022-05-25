package day11;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String args[]) {
		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Ramya");
		v.add("Raju");
		v.add("Ganesh");
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}


/*

Output:
Ayush
Ramya
Raju
Ganesh

*/