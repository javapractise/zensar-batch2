package May26;
import java.util.Arrays;  
import java.util.List;

public class UnboundedEx {
	
  
	  
	    public static void display(List<?> list)  
	    {  
	          
	        for(Object o:list)  
	        {  
	            System.out.println(o);  
	        }  
	          
	    }  
	      
	      
	    public static void main(String[] args) {  
	          
	    List<Integer> l1=Arrays.asList(1,2,3);  
	    System.out.println("Integer Values First ");  
	    display(l1);  
	    List<String> l2=Arrays.asList("One","Two","Three");  
	      System.out.println("Now String Values ");  
	        display(l2);  
	    }  
	  
	}


/*o/p-->
Integer Values First 
1
2
3
Now String Values 
One
Two
Three
*/