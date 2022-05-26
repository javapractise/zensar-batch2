package May26;
import java.util.*;

public class MaxRunsScored {

	
	public static void main(String a[]){
		List<Integer> runs=new ArrayList<Integer>();
		runs.add(46);
		runs.add( 67);
		runs.add( 24);
		runs.add(16);
		runs.add(8);
		runs.add( 12);
		runs.add(89);
		runs.add(12);
		
		
		System.out.println("Which batsman scored the most runs?-->"+Collections.max(runs));
	}


	
}


/* o/p: Which batsman scored the most runs?-->89 */