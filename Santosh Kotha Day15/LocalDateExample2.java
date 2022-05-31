package Day15;

import java.time.*;  
public class LocalDateExample2 {  
  public static void main(String[] args) {  
    LocalDate date = LocalDate.of(2017, 1, 13);  
    LocalDateTime datetime = date.atTime(1,50,9);      
    System.out.println(datetime);   
  }  
}  
//output:
//2017-01-13T01:50:09
