package May26;
import java.util.*;  

public class GenericsEx {

	
	
 
	public static void main(String args[]){  
	ArrayList<String> list=new ArrayList<String>();  
	list.add("Mummy Ki !");  
	list.add("Jay");  
	//list.add(32);//compile time error  
	  
	String s=list.get(1);
	System.out.println("Element is: "+s);  
	  
	Iterator<String> itr=list.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
}  

/*o/p-->
Element is: Jay
Mummy Ki !
Jay
*/

