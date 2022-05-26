package srilaxmi_pillalamarri;

import java.util.concurrent.ConcurrentHashMap;   
import java.util.Iterator;   
public class FailSafeEx1 {   
    public static void main(String[] args)   
    {   
        // Initializing a ConcurrentHashMap   
        ConcurrentHashMap<String, Integer> m   
            = new ConcurrentHashMap<String, Integer>();   
        m.put("ONE", 1); //Adding values  
        m.put("SEVEN", 7);   
        m.put("FIVE", 5);   
        m.put("EIGHT", 8);   
        // Getting an iterator using map  
        Iterator it = m.keySet().iterator();   
        while (it.hasNext()) {   
            String key = (String)it.next();   
            System.out.println(key + " : " + m.get(key));   
            // This will reflect in iterator.   
            // This means it has not created separate copy of objects  
            m.put("NINE", 9);   
        }   
    }   
} 


/*

output:

EIGHT : 8
FIVE : 5
NINE : 9
ONE : 1
SEVEN : 7

*/