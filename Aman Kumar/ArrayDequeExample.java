package day11;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
	public static void main(String[] args) {
//creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Kiran");
		deque.add("Gowtham");
		deque.add("Ajay");
//Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}
	}
}


/*

Output:
Kiran
Gowtham
Ajay

*/