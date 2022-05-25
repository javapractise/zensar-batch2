import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayDequeExa{
	public static void main (String[]args){
		//creating Deque and adding elements
		Deque<String>deque=new ArrayDeque<String>();
		deque.add("Punam");
		deque.add("Mona");
		deque.add("Komal");
		//Traversing elements
		for (String str:deque){
			System.out.println(str);
		}
	}
}
//Output:

        Punam
	      Mona
	      Komal
