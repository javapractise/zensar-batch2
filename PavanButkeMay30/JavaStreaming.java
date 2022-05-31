package May30_2;

import java.util.stream.*;  
public class JavaStreaming{  
    public static void main(String[] args){  
        Stream.iterate(1, element->element+1)  
        .filter(element->element%10==0)  
        .limit(5)  
        .forEach(System.out::println);  
    }  
} 

/*o/p:
10
20
30
40
50
*/