import java.util.*;  
class TestSort1{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("Punam");  
al.add("Mona");  
al.add("Komal");  
al.add("Neha");  
  
Collections.sort(al);  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 }  
}  
}  
//Output:
Komal
Mona
Neha
Punam
