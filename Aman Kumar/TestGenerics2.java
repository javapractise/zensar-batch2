package day12;

import java.util.*;

class TestGenerics2 {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Jai");
//list.add(32);//Compile time error

		String s = list.get(1);// type casting is not required
		System.out.println("Element at index 1 is: " + s);

		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}

/*

Output:
Element at index 1 is: Jai
Rahul
Jai

*/