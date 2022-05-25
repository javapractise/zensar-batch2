import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExa{
	public static void main(String args[]){
		LinkedList<String>al=new LinkedList<String>();
		al.add("Neeha");
		al.add("Mona");
		al.add("Punam");
		al.add("Ajay");
		Iterator<String>itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}


//Output:
Neeha
Mona
Punam
Ajay
