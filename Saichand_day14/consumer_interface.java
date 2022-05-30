package Saichand_day14;
import java.util.function.Consumer;
public class consumer_interface {
	  
	  
	    static void printMessage(String name){  
	        System.out.println("Hello "+name);  
	    }  
	    static void printValue(int val){  
	        System.out.println(val);  
	    }  
	    public static void main(String[] args) {  
	        // Referring method to String type Consumer interface   
	        Consumer<String> consumer1 = consumer_interface::printMessage;  
	        consumer1.accept("saichand");   // Calling Consumer method  
	        // Referring method to Integer type Consumer interface  
	        Consumer<Integer> consumer2 = consumer_interface::printValue;  
	        consumer2.accept(12);   // Calling Consumer method  
	    }  
}
/* output:
Hello saichand
12
*/