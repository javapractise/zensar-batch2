package srilaxmi_pillalamarri;

import java.util.*;
import java.util.Collections;
class ReverseOrder{
public static void main(String args[]){
  

ArrayList<String> a1=new ArrayList<String>();
  	a1.add("viru");
	a1.add ("Saurav");
	a1.add("Mukesh");
	a1.add("Tahir");

Collections.sort(a1,Collections.reverseOrder());
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}


/*

output:

viru
Tahir
Saurav
Mukesh

*/