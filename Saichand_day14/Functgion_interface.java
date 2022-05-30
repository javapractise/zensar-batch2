package Saichand_day14;
import java.util.function.Function; 
public class Functgion_interface {
 
	 
	    static String show(String message){  
	        return " Hello saichand "+message;  
	    }  
	    public static void main(String[] args) {  
	        // Function interface referring to a method  
	        Function<String, String> fun = Functgion_interface::show;  
	        // Calling Function interface method  
	        System.out.println(fun.apply("kadiyala"));  
	    }  
	}  


/* output:
Hello saichand kadiyala
*/