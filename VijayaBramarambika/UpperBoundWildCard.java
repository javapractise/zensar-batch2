
import java.util.ArrayList;
public class UpperBoundWildCard{
	private static Double add(ArrayList<?extends Number> nnum){
		double sum=0.0;
		for (Number n:nnum)
		{
			sum=sum+n.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args){
		ArrayList<Integer>l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		System.out.println("displaying the sum="+add(l1));
		ArrayList<Double>l2=new ArrayList<Double>();
		l2.add(30.0);
		l2.add(40.0);
		System.out.println("displaying the sum="+add(l2));
	}
}

/*
Output:
	displaying the sum=30.0
	displaying the sum=70.0
*/