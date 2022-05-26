import java.util.*;  
class TestSort1{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("Viru");  
al.add("Saurav");  
al.add("Mukesh");  
al.add("Tahir");  
  
Collections.sort(al);  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
 } 
System.out.println();
 
Collections.sort(al,Collections.reverseOrder()); 
Iterator it=al.iterator();  
while(it.hasNext()){  
System.out.println(it.next());  
 } 
}  
}

/**
Mukesh
Saurav
Tahir
Viru

Viru
Tahir
Saurav
Mukesh

**/