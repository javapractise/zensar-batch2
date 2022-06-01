
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class LocalDateTimeFormat{
 public static void main(String[] args){
  LocalDateTime now =LocalDateTime.now();
  System.out.println("Before Formatting:"+now);
  DateTimeFormatter Format = DateTimeFormatter.ofPattern("dd-MM-yyyy-HH:mm:ss");
  String FormatDateTime =now.format(Format);
  System.out.println("After Formatting:"+FormatDateTime);

	}
}

/*
Output:
Before Formatting:2022-06-01T18:55:34.396026100
After Formatting:01-06-2022-18:55:34
*/