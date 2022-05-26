package day12;

import java.lang.reflect.Array;
import java.util.*;

public class UnboundedWildcards {
	public static void display(List<?> list) {

		for (Object o : list) {
			System.out.print(o + "  ");
		}
	}

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3);
		System.out.println("Displaying the integer values");
		display(l1);
		List<String> l2 = Arrays.asList("One", "Two", "Three");
		System.out.println("\nDisplaying the string  values");
		display(l2);
	}
}

/*

Output:
Displaying the integer values
1  2  3  
Displaying the string  values
One  Two  Three  


*/