
import java.util.*;
public class GenericsExa{
	public static void main(String args[]){
		ArrayList<String> list=new ArrayList<String>();
		list.add("rahul");
		list.add("jai");
		//list.add(32);//Compile time error
		String s=list.get(1);//type casting is  not required
		System.out.println("elemnt is:"+s);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}	
	}
}


/*
Ouput:
elemnt is:jai
rahul
jai	
*/