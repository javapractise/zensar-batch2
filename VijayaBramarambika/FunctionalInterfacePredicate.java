
@SuppressWarnings("hiding")
interface Predicate<Integer> {
	boolean QualifyingMarks(int marks);
}
public class FunctionalInterfacePredicate {
	public static void main(String[] args) {
		Predicate<Integer> p = marks->(marks>60);
		System.out.println("The student is qualified : "+p.QualifyingMarks(80));
	}
}

/*
Output:
	The student is qualified : true
*/