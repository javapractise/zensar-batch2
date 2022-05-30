import java.util.*;  
public class Foreachloop{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("anil");  
        list.add("mayur");  
        list.add("Vikas");  
        list.add("durgesh");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  

/*
output:
anil
mayur
Vikas
durgesh
*/