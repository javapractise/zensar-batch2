package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestSort3 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		ArrayList al = new ArrayList();
		
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(299));
		al.add(234);
		//internally will be converted into object as integer.valueOf(239)
		
		Collections.sort(al);
		
		@SuppressWarnings("rawtypes")
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
