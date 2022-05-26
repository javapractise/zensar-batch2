package Day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionExample {
	public static void main(String args[]) {
		List<String>list = new ArrayList<String>();
		list.add("c");
		list.add("Core Java");
		list.add("Advance Java");
		System.out.println("initial Collection Value:"+list);
		Collections.addAll(list, "servelt","JSP");
		System.out.println("After adding elements collection value:"+list);
		String[] strArr= {"C#",".Net"};
		Collections.addAll(list, strArr);
		System.out.println("After adding array collection value:" + list);
		}
	}


//output:
//initial Collection Value:[c, Core Java, Advance Java]
//After adding elements collection value:[c, Core Java, Advance Java, servelt, JSP]
//After adding array collection value:[c, Core Java, Advance Java, servelt, JSP, C#, .Net]
