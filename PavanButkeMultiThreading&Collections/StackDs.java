package zensar;

import java.util.*;

public class StackDs {

	
  

public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("Cricket");  
stack.push("Soccer");  
stack.push("Baseball");  
stack.push("Vollyball");  
stack.push("Sweeming");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  



/*o/p:
Cricket
Soccer
Baseball
Vollyball
*/