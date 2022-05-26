package Day12;
import java.util.concurrent.CopyOnWriteArrayList;


import java.util.Iterator;

public class FailSafeDemo {
	public static void main(String []args) {
		
	CopyOnWriteArrayList<Integer> list   
        = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 7, 9, 11 });   
    Iterator itr = list.iterator();   
    while (itr.hasNext()) {   
        Integer i = (Integer)itr.next();   
        System.out.println(i);   
        if (i == 7)   
            list.add(15); 
			//it will not be printed
			//This means it has craeted a separate copy of the collection
				}
}
}

//output:
//1
//7
//9
//11

