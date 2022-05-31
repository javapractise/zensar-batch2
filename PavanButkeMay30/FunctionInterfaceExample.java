package May30_2;

import java.util.function.Function;  
public class FunctionInterfaceExample {  
    static String show(String message){  
        return "Peter Parker"+message;  
    }  
    public static void main(String[] args) {  
       
        Function<String, String> fun = FunctionInterfaceExample::show;  
         
        System.out.println(fun.apply("is a Spider Man"));  
    }  
}  

/*o/p:
Peter Parker is a Spider Man
*/ 