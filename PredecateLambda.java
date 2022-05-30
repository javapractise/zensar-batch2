package May30_2;


import java.util.*;
import java.util.function.Predicate;

class PredecateLambda {
    public static void main(String args[])
    {

     
        List<String> names = Arrays.asList(
            "Xar", "Yak", "Zodiax", "War", "Wow");

        Predicate<String> p = (s) -> s.startsWith("W");

      
        for (String st : names) {
            
            if (p.test(st))
                System.out.println(st);
        }
    }
    }

/*o/p:
War
Wow
*/