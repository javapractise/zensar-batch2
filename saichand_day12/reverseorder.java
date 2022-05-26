package saichand_day12;
import java.util.*;
import java.util.Collections;


class reverseorder{
public static void main(String args[]){
  

ArrayList<String> a1=new ArrayList<String>();
  	a1.add("saichand");
	a1.add ("ram");
	a1.add("suresh");
	a1.add("kishore");

Collections.sort(a1,Collections.reverseOrder());
	Iterator itr=a1.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
/* output:
suresh
saichand
ram
kishore
*/