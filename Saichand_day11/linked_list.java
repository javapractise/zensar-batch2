package Treads;
import java.util.Iterator;
import java.util.LinkedList;
public class linked_list {
	

	
		public static void main(String args[]){
			LinkedList<String>al=new LinkedList<String>();
			al.add("saichand");
			al.add("kadiyala");
			al.add("rupa");
			al.add("Hanuman");
			Iterator<String>itr=al.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}

}
/* out put:
saichand
kadiyala
rupa
Hanuman
*/