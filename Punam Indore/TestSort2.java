import java.util.*;  
class TestSort2{  
public static void main(String args[]){  
  
ArrayList<String> al=new ArrayList<String>();  
        al.add("Punam");    
        al.add("Mona");    
        al.add("Komal");    
        al.add("Neha");   
          
        Collections.sort(al,Collections.reverseOrder());  
        Iterator i=al.iterator();  
        while(i.hasNext())  
        {  
            System.out.println(i.next());  
        }  
}  
}  
//Output:
Punam
Neha
Mona
Komal
