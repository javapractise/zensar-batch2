import java.util.*;  
public class LambdaExpressionForeachLoop{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("punam");  
        list.add("mona");  
        list.add("jay");  
        list.add("komal");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  
//Output:
punam
mona
jay
komal
