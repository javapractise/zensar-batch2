
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class FailFastDemo{
	public static  void main(String[] args)
	{
		Map<String,String>empName=new HashMap<String,String>();
		empName.put("sam Hanks","New york");
		empName.put("will smith","LA");
		empName.put("Scarlett","Chicago");
		Iterator iterator=empName.keySet().iterator();
		while(iterator.hasNext()){
			System.out.println(empName.get(iterator.next()));
			//adding an element to map
			//exception will be thrown on next call
			//of next()method.
			empName.put("Istanbul","Turkey");
		}
	}
}


/*
Output:
LA
Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1597)
	at java.base/java.util.HashMap$KeyIterator.next(HashMap.java:1620)
	at FailFastDemo.main(FailFastDemo.java:14)
*/