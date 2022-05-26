package saichand_day12;
import java.util.*;
public class TestSort {



public static void main(String args[]){

	ArrayList<String> al=new ArrayList<String>();
	al.add("saichand");
	al.add("kadiyala");
	al.add("medikonduru");
	al.add("guntur");



	Collections.sort(al); 
	Iterator itr=al.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
	}
	}

/* output:
guntur
kadiyala
medikonduru
saichand
*/