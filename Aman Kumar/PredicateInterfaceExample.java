package day14;

import java.util.function.Predicate;  
public class PredicateInterfaceExample {  
    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method    
    }  
} 

/*

Output:
false

*/