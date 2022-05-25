/* Program to illustrate an LinkedList in Jav*/


package zensar;
import java.util.*;

public class LinkedList1 {
	
	  
	 public static void main(String args[]){  
	  
	  LinkedList<String> al=new LinkedList<String>();  
	  al.add("HR");  
	  al.add("Sales");  
	  al.add("Tech");  
	  al.add("Finance");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  



/*o/p:
Sales
Tech
Finance
*/