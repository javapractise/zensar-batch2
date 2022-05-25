import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExa{
	public static void main(String args[]){
		LinkedList<String>al=new LinkedList<String>();
		al.add("Neeha");
		al.add("Niharika");
		al.add("Ravi");
		al.add("Ajay");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}


/*
Output:
Neeha
Niharika
Ravi
Ajay
*/