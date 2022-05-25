package zensar;
import java.util.*; 


public class HashSet11 {
	
	 
	public static void main(String args[]){  
	  
	HashSet<String> set=new HashSet<String>();  
	set.add("X");  
	set.add("Y");  
	set.add("Z");  
	set.add("W");  

	Iterator<String> itr=set.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  


/*o/p:-->
W
X
Y
Z
*/

