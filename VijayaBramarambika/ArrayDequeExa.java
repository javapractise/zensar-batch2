
import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExa{
	public static void main (String[]args){
		//creating Deque and adding elements
		Deque<String>deque=new ArrayDeque<String>();
		deque.add("kiran");
		deque.add("Gowtham");
		deque.add("Ajay");
		//Traversing elements
		for (String str:deque){
			System.out.println(str);
		}
	}
}


/*
Ouput:
	kiran
	Gowtham
	Ajay
*/
