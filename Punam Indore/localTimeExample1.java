import java.time.LocalTime;
public class localTimeExample1{
public static void main(String[] args){
LocalTime time = LocalTime.now();
System.out.println("LocalTime Example for now : "+time);
LocalTime time2=LocalTime.of(10,43,12);
System.out.println("Local time Example for of :"+time2);
}
}



//Output:
LocalTime Example for now : 15:43:05.376767100
Local time Example for of :10:43:12
