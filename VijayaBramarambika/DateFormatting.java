
import java.text.DateFormat;
import java.util.Date;
public class DateFormatting{
	public static void main(String[] args) {
		Date currentDate = new Date();
		System.out.println("current Date:"+currentDate);
		String dateToStr=DateFormat.getInstance().format(currentDate);
		System.out.println("Date Format using getInstance():"+dateToStr);
   }
 }

/* Output:
current Date:Wed Jun 01 19:12:48 IST 2022
Date Format using getInstance():6/1/22, 7:12 PM
*/