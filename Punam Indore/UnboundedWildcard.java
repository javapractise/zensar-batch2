import java.util.Arrays;  
import java.util.List;  
  
public class UnboundedWildcard {  
  
    public static void display(List<?> list)  
    {  
          
        for(Object o:list)  
        {  
            System.out.println(o);  
        }  
          
    }  
      
      
    public static void main(String[] args) {  
          
    List<Integer> l1=Arrays.asList(1,2,3);  
    System.out.println("displaying the Integer values");  
    display(l1);  
    List<String> l2=Arrays.asList("One","Two","Three");  
      System.out.println("displaying the String values");  
        display(l2);  
    }  
  
}  
//Output:
displaying the Integer values
1
2
3
displaying the String values
One
Two
Three
