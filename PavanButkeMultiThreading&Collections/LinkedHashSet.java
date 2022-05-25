import java.util.*;  
public class LiHashSet{  
public static void main(String args[]){  
LinkedHashSet<String> set=new LinkedHashSet<String>();  
set.add("A");  
set.add("B");  
set.add("A");  
set.add("C");  
Iterator<String> itr=set.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  


/*o/p:
A
B
C*/