package Saichand_day14;
import java.util.function.Predicate;
public class Predicate_interface {
 public static void main(String[] args) {
	 Predicate<Integer> pr = a -> (a > 20);// creating predicate;
	 System.out.println(pr.test(10));// calling predicate
 }
}
/* output:
false */
