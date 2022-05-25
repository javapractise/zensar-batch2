import java.util.*;  
class TreeMap103{  
 public static void main(String args[]){  
   NavigableMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
       
      System.out.println("descendingMap: "+map.descendingMap());  
     
      System.out.println("headMap: "+map.headMap(102,true));  
      
      System.out.println("tailMap: "+map.tailMap(102,true));  
      System.out.println("subMap: "+map.subMap(100, false, 102, true));   
 }  
}  

/*o/p:
descendingMap: {103=Rahul, 102=Ravi, 101=Vijay, 100=Amit}
headMap: {100=Amit, 101=Vijay, 102=Ravi}
tailMap: {102=Ravi, 103=Rahul}
subMap: {101=Vijay, 102=Ravi}
*/