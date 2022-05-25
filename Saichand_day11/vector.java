package Treads;
import java.util.Iterator;
import java.util.Vector;
public class vector {
	;
	
		public static void main(String args[]){
			Vector<String>v= new Vector<String>();
			v.add("rupesh");
			v.add("subbarao");
			v.add("rambabu");
			v.add("gona");
			Iterator<String>itr=v.iterator();
			while(itr.hasNext()){
				System.out.println(itr.next());
			}
		}

}
/* out put:
rupesh
subbarao
rambabu
gona
*/