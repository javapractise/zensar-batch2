package srilaxmi_pillalamarri;

import java.util.*;
class WrapperClass{
public static void main(String args[]){


ArrayList a1=new ArrayList();
	a1.add(Integer.valueOf(201));
	a1.add(Integer.valueOf(101));
	a1.add(230);//internally will be converted into object aas integer.valueOf(230)

Collections.sort(a1);


	Iterator itr=a1.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
    }
    }

/*

output:

101
201
230

*/