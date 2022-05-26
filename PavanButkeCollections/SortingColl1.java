package May26;
import java.util.*;  

public class SortingColl {

	public static void main(String args[]){  
	  
	ArrayList<String> AlphabetOrder=new ArrayList<String>();  
	AlphabetOrder.add("Z");  
	AlphabetOrder.add("X");  
	AlphabetOrder.add("A");  
	AlphabetOrder.add("P");  
	  
	Collections.sort(AlphabetOrder);  
	Iterator itr=AlphabetOrder.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	 }  
	}  
} 


/*o/p:
A
P
X
Z*/