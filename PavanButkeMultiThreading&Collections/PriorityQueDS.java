package zensar;
import java.util.*;  

public class PriorityQueDs {
	

	 
	public static void main(String args[]){  
	PriorityQueue<String> queue=new PriorityQueue<String>();  
	queue.add("Mind ");  
	queue.add("Heart");  
	queue.add("Leg");  
	queue.add("Knee");  
	System.out.println("head:"+queue.element());  
	System.out.println("head:"+queue.peek());  
	System.out.println("Iterating the elements in Queue:");  
	Iterator itr=queue.iterator();  
	
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	queue.remove();  
	queue.poll(); 
	
	System.out.println("Show me After removal: ");  
	Iterator<String> itr2=queue.iterator();  
	while(itr2.hasNext()){  
	System.out.println(itr2.next());  
	}  
	}  
	

}


/*o/p:
head:Heart
head:Heart
Iterating the elements in Queue:
Heart
Knee
Leg
Mind 
Show me After removal: 
Leg
Mind 
*/