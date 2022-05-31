import java.time.*;  
public class LocalDateExample {  
  public static void main(String[] args) {  
    LocalDate date = LocalDate.of(2018, 6, 6);  
    LocalDateTime datetime = date.atTime(1,50,9);      
    System.out.println(datetime);   
  }  
}  


/*
Output:
2018-06-06T01:50:09

*/