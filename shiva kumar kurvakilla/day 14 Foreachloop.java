import java.util.*;  
public class Foreachloop{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  

Output:
java -cp /tmp/r0sPMGjxde Foreachloop
ankit
mayank
irfan
jai