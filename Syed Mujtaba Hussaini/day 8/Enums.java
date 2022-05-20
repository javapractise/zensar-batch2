
public class Main {
	
	class Mine{
		public enum Season { WINTER, SPRING, SUMMER, FALL }  
	}
	
	enum Sports{
		FOOTBALL(10), CRICKET(5), TENNIS(7);
		private int num;
		
		private Sports(int num){
			this.num = num;
		}
	}
	
	enum WeekDays {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;}
	
	public static void main(String[] args) {
		
		WeekDays d = WeekDays.MONDAY;
		System.out.println("The weekdays are");
		
		for(WeekDays w: WeekDays.values()) {
			System.out.println(w);
		}
		System.out.println("\nThe seasons are");
		
		for(Mine.Season m: Mine.Season.values()) {
			System.out.println(m);
		}
		
		for(Sports s: Sports.values()) {
			System.out.println(s + " values are: " + s.num);
		}
	}

}

/**
The weekdays are
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY

The seasons are
WINTER
SPRING
SUMMER
FALL
FOOTBALL values are: 10
CRICKET values are: 5
TENNIS values are: 7
**/