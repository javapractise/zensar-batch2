package day12;

import java.util.Arrays;
import java.util.List;

public class LowerBoundedWildCard {

	public static void addNumber(List<? super Integer> list) {

		for (Object n : list) {
			System.out.print(n + "  ");
		}

	}

	public static void main(String[] args) {

		List<Integer> l1 = Arrays.asList(1, 2, 3);
		System.out.print("Displaying the integer values: ");
		addNumber(l1);

		List<Number> l2 = Arrays.asList(1.0, 2.0, 3.0);
		System.out.print("\nDisplaying the Number values: ");
		addNumber(l2);
	}
}

/*

Output:
Displaying the integer values: 1  2  3  
Displaying the Number values: 1.0  2.0  3.0

 */