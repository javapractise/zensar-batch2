import java.util.Iterator;
import java.util.Vector;
public class VectorExa{
	public static void main(String args[]){
		Vector<String>v= new Vector<String>();
		v.add("Punam");
		v.add("Mona");
		v.add("Komal");
		v.add("Neha");
		Iterator<String>itr=v.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

//Output:
    Punam
    Mona
    Komal
    Neha
