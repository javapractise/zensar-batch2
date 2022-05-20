
public class Enum_Example {
	//defining the Enum inside the class
		public enum Season{WINTER,SPRING,SUMMER,FALL}
	public static void main(String[] args) {
		
		//traversing the Enum
		for (Season s: Season.values())
			
		System.out.println(s);

	}
}


/*

Output:
WINTER
SPRING
SUMMER
FALL

*/