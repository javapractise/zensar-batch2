import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx{
	 public static void main(String args[]){
		 ArrayList<String> list=new ArrayList<String>();//creating arraylist
		 list.add("Neeha"); //Adding object in arraylist
		 list.add("Niharika");
		 list.add("Ravi");
		 list.add("Ajay");
	//Travesing list through iterator
		 Iterator itr=list.iterator();
		 while(itr.hasNext()){
			 System.out.println(itr.next());

		 }
	 }
}

/*

output:

Neeha
Niharika
Ravi
Ajay


*/