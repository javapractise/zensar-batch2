import java.util.*;  
public class LambdaExpressionForeachLoop{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Jayshri");  
        list.add("vani");  
        list.add("shivani");  
        list.add("manasi");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  
//Output:
Jayshri
vani
shivani
manasi