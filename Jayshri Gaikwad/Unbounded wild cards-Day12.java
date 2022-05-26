import java.util.Arrays;
import java.util.List;
public class UnboundedWildCards{
	public static void display(List<?>list)
	{
		for (Object o:list)
		{
			System.out.println(o);
		}
	}
	public static void main(String[] args){
		List<Integer>l1=Arrays.asList(1,2,3);
		System.out.println("displaying the integer values");
		display(l1);
		List<String>l2=Arrays.asList("One","Two","Three");
		System.out.println("displaying the string  values");
		display(l2);
	}
}

/*
Output:
displaying the integer values
1
2
3
displaying the string  values
One
Two
Three
*/