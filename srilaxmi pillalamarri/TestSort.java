package srilaxmi_pillalamarri;

import java.util.*;
class TestSort{
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
 output:
 
Mukesh
Thair
Viru
saurav

 */

