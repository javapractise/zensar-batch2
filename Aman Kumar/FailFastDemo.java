package day12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FailFastDemo {
	public static void main(String[] args) {
		Map<String, String> empName = new HashMap<String, String>();
		empName.put("sam Hanks", "New york");
		empName.put("will smith", "LA");
		empName.put("Scarlett", "Chicago");
		Iterator iterator = empName.keySet().iterator();
		try {
			while (iterator.hasNext()) {

				System.out.println(empName.get(iterator.next()));
//adding an element to map exception will be thrown on next call of next()method.

				empName.put("Istanbul", "Turkey");

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

/*

Output:
LA
java.util.ConcurrentModificationException

*/