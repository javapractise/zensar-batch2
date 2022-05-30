import java.util.stream.*;  
public class JavaStreamiterating {  
    public static void main(String[] args){  
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  
    }  
}  
//OutPut: 
5
10
15
20
25
