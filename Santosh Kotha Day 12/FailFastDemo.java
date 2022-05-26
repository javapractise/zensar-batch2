package Day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class FailFastDemo {
	private static Object iterator;

	public static void main(String []args) {
		Map<String,String>empName = new HashMap<String,String>();
		empName.put("Will Smith","NewYork");
		empName.put("Subharao","Chicago");
		empName.put("Dasu","LA");
		
         iterator = empName.keySet().iterator();
         
         while (iterator.has.Next()) {   
             System.out.println(empName.get(iterator.Next()));   
			//adding an element to map
				//exception will be thrown on next call
				// of next()method.
				empName.put("Istanbul","Turkey");
			}
	}
}


		
