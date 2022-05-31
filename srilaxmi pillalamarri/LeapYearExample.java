import java.time.LocalDate;
public class LeapYearExample{
	public static void main(String[] args){
	LocalDate date1= LocalDate.of(2018,1,13);
	System.out.println(date1.isLeapYear());
	LocalDate date2=LocalDate.of(2020,9,23);
	System.out.println(date2.isLeapYear());
	}
}


/*
Output:
false
true
*/