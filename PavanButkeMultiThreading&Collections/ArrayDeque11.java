package zensar;
import java.util.*;  

public class ArrayDeque11 {
	
 
	public static void main(String[] args) {  
	
	Deque<String> dequeCities = new ArrayDeque<String>();  
	dequeCities.add("Gautam");  
	dequeCities.add("Karan");  
	dequeCities.add("Ajay");  
	  
	for (String str : dequeCities) {  
	System.out.println(str);  
	}  
	}  
	}  


/*o/p:
Gautam
Karan
Ajay
*/