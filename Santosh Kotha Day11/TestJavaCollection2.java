package ArrayList;

import java.util.Iterator;
import java.util.Vector;

public class TestJavaCollection2 {
	public static void main(String args[]) {
		Vector<String>v= new Vector<String>();
		
		v.add("Bheem");
		v.add("Venkat");
		v.add("Ganesh");
		v.add("Tarak");
		v.add("Krishna");
	
	Iterator<String>itr = v.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		
	}
	}

	
}
//output*
//Bheem
//Venkat
//Ganesh
//Tarak
//Krishna
