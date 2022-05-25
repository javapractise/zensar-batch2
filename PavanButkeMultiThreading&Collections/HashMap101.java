	package zensar;
import java.util.*; 

public class HashMap101 {

	
 

	public static void main(String args[]){  
	  
	HashSet<String> set=new HashSet<String>();  
	set.add("A");  
	set.add("B");  
	set.add("C");  
	set.add("D");  
	
	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  


/*o/p-->
A
B
C
D
*/