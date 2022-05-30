package basics;
import java.util.*;
import java.util.function.Predicate;

class Basics{
	
	public static void main(String[] args) {
		
//		1.implementing Runnable using Lambda expression
//		2.Using Lambda expression and Functional interface Predicate
//		3.How to combine Predicate in Lambda Expressions

		//1
		Runnable r = () -> {
			System.out.println("The thread is running");
		};
		
		new Thread(r).start();
		
		//2
		Predicate<Integer> age = a -> a >= 18;
		// It results in a boolean value, used for condtions
		System.out.println(age.test(20));
		
		//3
		List<String> names = new ArrayList<String>();
		names.add("Syed");
		names.add("Raj");
		names.add("Joseph");
		names.add("lucy");
		names.stream().
				filter(x -> x.toLowerCase().startsWith("s"))
				.forEach(System.out::print);
	}
	

}

/**
The thread is running
true
Syed
**/
