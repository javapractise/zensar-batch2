import java.util.Arrays;
import java.util.List;
public class LowerBoundWildCards{

	public static void addNumber(List<?super Integer>list) {
		for(Object n:list)
		{
			System.out.println(n);
		}
	}
	public static void main(String[] args){
		List<Integer>l1=Arrays.asList(1,2,3);
		System.out.println("displaying the integer values");
		addNumber(l1);
		List<Number>l2=Arrays.asList(1.0,2.0,3.0);
		System.out.println("displaying the Number values");
		addNumber(l2);
	}
}

/*
Output:
displaying the integer values
1
2
3
displaying the Number values
1.0
2.0
3.0
*/