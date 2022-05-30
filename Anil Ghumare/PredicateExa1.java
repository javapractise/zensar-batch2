import java.util.function.Predicate;  
public class PredicateEx1 {  
    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method    
    }  
}  

/*
 
Output:
false
*/