package basics;

import java.util.HashSet;

public class Basics {

	public static void main(String[] args) {
		 String s = "abcabca";
		 int i = 0;
		 int j = 0;
		    
		 HashSet<Character> h = new HashSet();
		 
		 while (j < s.length()) {
			 if(!(h.contains(s.charAt(j)))) {
				 h.add(s.charAt(j));
				 j++;
			 }else {
				 h.remove(s.charAt(i));
				 i++;
			 }
		 }
		 
		 System.out.println(h);
	}
	

}

/*
Output - [a,b,c]
*/