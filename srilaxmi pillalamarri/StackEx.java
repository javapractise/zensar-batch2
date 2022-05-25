import java.util.Iterator;
import java.util.Stack;
	public class StackEx{
		public static void main(String args[]){
		Stack<String>stack=new Stack<String>();
		stack.push("Neeha");
		stack.push("Niharika");
		stack.pop();
		Iterator<String> itr=stack.iterator();
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
		}
		}
/*
	
	output:
	
	Neeha
	
	*/