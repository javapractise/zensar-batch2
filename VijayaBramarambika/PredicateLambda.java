
import java.util.function.Predicate;
public class PredicateLambda {
	public static void main(String args[]) {
		Predicate<Integer> predicate = marks->(marks>60);
		System.out.println(predicate.test(70));
	}

}


/*
Output:
	true
*/