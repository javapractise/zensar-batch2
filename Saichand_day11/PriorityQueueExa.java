package Treads;


	import java.util.*;  
	public class PriorityQueueExa{  
		public static void main(String args[]){  
			PriorityQueue<String> queue=new PriorityQueue<String>();  
			queue.add("saichand");  
			queue.add("gopal");  
			queue.add("teja");  
			queue.add("aravind");  
			System.out.println("head:"+queue.element());  
			System.out.println("head:"+queue.peek());  
			System.out.println("iterating the queue elements:");  
			Iterator itr=queue.iterator();  
			while(itr.hasNext()){  
				System.out.println(itr.next());  
			}  
			queue.remove();  
			queue.poll();  
			System.out.println("after removing two elements:");  
			Iterator<String> itr2=queue.iterator();  
			while(itr2.hasNext()){  
				System.out.println(itr2.next());  
			}  
		}  
	}  

/* out put
 *head:aravind
head:aravind
iterating the queue elements:
aravind
gopal
teja
saichand
after removing two elements:
saichand
teja
*/ 
