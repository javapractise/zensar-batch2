package May31;

import java.time.LocalTime;  
public class JavaLocalTime4{  
  public static void main(String[] args) {  
    LocalTime time1 = LocalTime.of(10,43,12);  
    System.out.println(time1);  
    LocalTime time2=time1.plusHours(4);  
    LocalTime time3=time2.plusMinutes(18);  
    System.out.println(time3);  
  }  
}  

/*o/p:
10:43:12
15:01:12
*/