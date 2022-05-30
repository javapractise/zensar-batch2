package May30_2;

import java.util.function.Function;  
import java.util.List;  
import java.util.ArrayList;  
public class FunctionInterfaceExample1 {  
    static Integer addList(List<Integer> list){  
        return list.stream()  
                   .mapToInt(Integer::intValue)  
                   .sum();  
    }  
    public static void main(String[] args) {  
        // Creating a list and adding values  
        List<Integer> list = new ArrayList<Integer>();  
        list.add(10);  
        list.add(20);  
        list.add(30);  
        list.add(40);  
        // Referring addList() method  
        Function<List<Integer>, Integer> fun = FunctionInterfaceExample::addList;  
        // Calling Function interface method  
        int result = fun.apply(list);  
        System.out.println("Sum of list values: "+result);  
    }  
}  

/*o/p:
Sum of list values: 100
*/