package May31;

import java.text.DateFormat;
import java.util.Date;
public class TA2{
 public static void main(String[] args) {
  Date currentDate = new Date();
  System.out.println("current Date:"+currentDate);
  String dateToStr=DateFormat.getDateInstance().format(currentDate);
  System.out.println("Date Format using getInstance():"+dateToStr);

   }
 }


/*o/p:
current Date:Tue May 31 17:26:15 IST 2022
Date Format using getInstance():May 31, 2022
*/