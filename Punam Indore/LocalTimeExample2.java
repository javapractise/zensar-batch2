import java.time.LocalTime;  
public class LocalTimeExample2 {  
  public static void main(String[] args) {  
    LocalTime time1 = LocalTime.of(10,43,12);  
    System.out.println("Original time :"+time1);  
    LocalTime time2=time1.minusHours(2);  
    LocalTime time3=time2.minusMinutes(34);  
    System.out.println("Minus Time :"+time3);  
    LocalTime time4=time1.plusHours(4);  
    LocalTime time5=time4.plusMinutes(18);  
    System.out.println("Plus time :"+time5);  
  }  
}  


//Output:
Original time :10:43:12
Minus Time :08:09:12
Plus time :15:01:12

