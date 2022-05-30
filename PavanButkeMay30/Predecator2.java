package May30_2;
import java.util.function.Predicate;  
public class Predecator2 {

	   static Boolean checkAge(int age){  
	        if(age>17)  
	            return true;  
	        else return false;  
	    }  
	    public static void main(String[] args){  
 
	        Predicate<Integer> predicate =  Predecator2::checkAge;  
	         
	        boolean result = predicate.test(25);  
	        System.out.println(result);  
	    }
}

/*o/p:
true
*/