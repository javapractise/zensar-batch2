package May26;

import java.util.HashMap;   
import java.util.Iterator;   
import java.util.Map;   

public class FailFast {
  
        public static void main(String[] args)   
        {   
            Map<String, String> empName = new HashMap<String, String>();   
            empName.put("Sam Hanks", "New york");   
            empName.put("Will Smith", "LA");   
            empName.put("Scarlett", "Chicago");   
            Iterator iterator = empName.keySet().iterator();   
            while (iterator.hasNext()) {   
               
                empName.put("Istanbul", "Turkey");   
            }   
        }   
    }

