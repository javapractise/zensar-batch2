package May26;
import java.util.*;  


public class WrapperClassColl {
	
	 
	public static void main(String args[]){  
	  
	ArrayList al=new ArrayList();  
	al.add(Integer.valueOf(1));  
	al.add(Integer.valueOf(101));  
	al.add(20);
	  
	Collections.sort(al);  
	  
	Iterator itr=al.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	 }  
	}  
	} 

/*o/p-->
1
20
101
*/