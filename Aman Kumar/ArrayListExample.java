package Day11;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	 public static void main(String args[]){
		 ArrayList<String> list=new ArrayList<String>();//creating Arraylist
		 list.add("Neeha");//Adding object in Arraylist
		 list.add("Niharika");
		 list.add("Ravi");
		 list.add("Ajay");
		 //Traversing list through iterator
		 Iterator<String> itr=list.iterator();
		 while(itr.hasNext())
		 {
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