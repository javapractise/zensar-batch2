import java.util.*;
public class Collections {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();  
		list.add("Ravi");
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
  
		Iterator<String> itr=list.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}
		
		System.out.println("Linked List");
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator<String> it=al.iterator();  
		while(it.hasNext())
		{  
			System.out.println(it.next());  
		}
		
		System.out.println("Vector");
		Vector<String> v=new Vector<String>();  
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> i=v.iterator();  
		while(i.hasNext())
		{  
		System.out.println(i.next());  
		}  
		
		System.out.println("Stack");
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> ii=stack.iterator();  
		while(ii.hasNext()){  
		System.out.println(ii.next()); 
		}
		
		System.out.println("Queue");
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator iit=queue.iterator();  
		while(iit.hasNext()){  
		System.out.println(iit.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext())
		{  
		System.out.println(itr2.next());  
		}
		
		//Deque
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		//Traversing elements  
		for (String str : deque) {  
		System.out.println(str);  
		}
		
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		//Traversing elements  
		Iterator<String> iii=set.iterator();  
		while(iii.hasNext()){  
		System.out.println(iii.next());  
		}
		
		LinkedHashSet<String> set=new LinkedHashSet<String>();  
		set.add("Ravi");  
		set.add("Vijay");  
		set.add("Ravi");  
		set.add("Ajay");  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}

}

/**
Ravi
Vijay
Ravi
Ajay
Linked List
Ravi
Vijay
Ravi
Ajay
Vector
Ayush
Amit
Ashish
Garima
Stack
Ayush
Garvit
Amit
Ashish
Queue
head:Amit Sharma
head:Amit Sharma
iterating the queue elements:
Amit Sharma
Raj
JaiShankar
Vijay Raj
after removing two elements:
Raj
Vijay Raj
Gautam
Karan
Ajay
Vijay
Ravi
Ajay
Vijay
Ravi
Ajay
**/
