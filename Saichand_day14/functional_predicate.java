package Saichand_day14;
import java.util.function.Predicate;
public class functional_predicate {

	
	    public static void main(String[] args)
	    {
	        Predicate<Integer> greaterThanTen = (i) -> i > 10;
	  
	        // Creating predicate
	        Predicate<Integer> lowerThanTwenty = (i) -> i < 20; 
	        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
	        System.out.println(result);
	  
	        // Calling Predicate method
	        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
	        System.out.println(result2);
	    }
	}

/* Output:
true
false
*/