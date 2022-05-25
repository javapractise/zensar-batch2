/* Example of Arraylist by Pavan Butke */

package zensar;
import java.util.*;

package zensar;
import java.util.*;

public class ArrayList1 {
	
	
 
	 public static void main(String args[]){  
	  ArrayList<String> list=new ArrayList<String>();   
	      list.add("HR");  
	      list.add("Finance");    
	      list.add("IT Suppport");    
	      list.add("Software");    
	      
	      Iterator itr=list.iterator();
	      while(itr.hasNext()){
	      System.out.println(itr.next());
	  
	 }  
	 }
}



/*o/p--> 
HR
Finance
IT Suppport
Software

*/