
import java.util.*;
public class SortStringObject{
	public static void main(String args[]){
		ArrayList<String> al=new ArrayList<String>();
		al.add("Viru");
		al.add("saurav");
		al.add("Mukesh");
		al.add("Thair");
		Collections.sort(al); 
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}

/*
Output:
	Mukesh
	Thair
	Viru
	saurav
*/