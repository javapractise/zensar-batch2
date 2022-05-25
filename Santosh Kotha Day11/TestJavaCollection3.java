package ArrayList;


import java.util.Iterator;
import java.util.Stack;


public class TestJavaCollection3 {
	public static void main(String args[]) {
		Stack<String>stack = new Stack<String>();
		
		stack.push("Bheem");
		stack.push("Ram");
		stack.push("Ganesh");
		stack.push("Venkat");
		
	
		stack.pop();
	Iterator<String>itr = stack.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		
	}
	

	
}
}
//output*
//Bheem
//Ram
//Ganesh

