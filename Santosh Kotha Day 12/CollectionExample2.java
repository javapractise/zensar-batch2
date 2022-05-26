package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample2 {
	public static void main(String args[]) {
		
		List<Integer>list = new ArrayList<Integer>();
		
		list.add(46);
		list.add(66);
		list.add(88);
		list.add(99);
		list.add(9);
		list.add(1);
		System.out.println("Value of Maaximum elements from the collections:"+Collections.max(list));
		
	}

}

//output:
//Value of Maaximum elements from the collections:99
