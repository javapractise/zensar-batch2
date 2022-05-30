package May30_2;
import java.util.function.Predicate;  

public class FunInPre {
	
	   public static void main(String[] args) {  
	        Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
	        System.out.println(pr.test(10));    // Calling Predicate method    
	    }  

}

/*o/p:
false
*/