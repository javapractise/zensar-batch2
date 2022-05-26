
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionExample{
	public static void main(String a[]){
		List<String> list=new ArrayList<String>();
		list.add("c");
		list.add("Core Java");
		list.add("Advance Java");
		System.out.println("Initial Collection Value:"+list);
		Collections.addAll(list,"servelt","Jsp");
		System.out.println("After adding elements collection value:"+list);
		String[] strArr={"C#",".Net"};
		Collections.addAll(list,strArr);
		System.out.println("After adding array collection value:"+list);
	}
}


/*
Output:
Initial Collection Value:[c, Core Java, Advance Java]
After adding elements collection value:[c, Core Java, Advance Java, servelt, Jsp]
After adding array collection value:[c, Core Java, Advance Java, servelt, Jsp, C#, .Net]
*/