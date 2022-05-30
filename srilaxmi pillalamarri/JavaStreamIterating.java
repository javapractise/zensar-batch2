//java stream iterating
import java.util.stream.*;
public class JavaStreamIterating{
   public static void main(String[] args){
     Stream.iterate(1, element->element+1)
      .filter(element->element%5==0)
      .limit(5)
      .forEach(System.out::println);

}
}

/*
 
 output:
 
 5
10
15
20
25

*/
 
