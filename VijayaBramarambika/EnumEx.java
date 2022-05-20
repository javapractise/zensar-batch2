
public class EnumEx {
	public enum season {WINTER,SPRING,SUMMER,FALL}  // defining enum
	public static void main(String args[]) {
		//traversing
		for(season s:season.values()) 
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
