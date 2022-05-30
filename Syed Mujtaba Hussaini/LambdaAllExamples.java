import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lambda {
	
	@FunctionalInterface
	interface Gift{
		void open();
	}
	
	interface Add{
		int sum(int a , int b);
	}
	
	interface Speak{
		String say(String words);
	}
	
	public static void main(String[] args) {
		
		Gift g = () -> {
			System.out.println("I opened the gift");
		};
		
		g.open();
		
		Add add = (a,b)-> {
			return a + b;
		};
		
		System.out.println(add.sum(5, 5));
		
		Speak str = (s) -> {
			return "My name is "  + s;
		};
		
		System.out.println(str.say("Syed"));
		
		List<String> basket = new ArrayList<String>();
		
		basket.add("banana");
		basket.add("apple");
		basket.add("orange");
		basket.add("mangoes");
		
		basket.forEach(
				(b) -> System.out.println(b)
		);
		
		Collections.sort(basket);
		
		System.out.println("\nThe sorted list is");
		basket.forEach(
				(b) -> System.out.println(b)
		);
		
		
	}

}

/**
I opened the gift
10
My name is Syed
banana
apple
orange
mangoes

The sorted list is
apple
banana
mangoes
orange
**/