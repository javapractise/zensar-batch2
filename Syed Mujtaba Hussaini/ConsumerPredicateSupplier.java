import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerPredicateSupplier {

	public static void main(String[] args) {
		
		//Consumer
		 Consumer<Integer> consumer = t -> System.out.println("Printing  : " + t);
		  
		 consumer.accept(10);
		 
		 //Predicate
		 List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);

		 list1.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.println("print  Even: " + t));

		 //Supplier
		 List<String> list2 = Arrays.asList();

		 System.out.println(list2.stream().findAny().orElseGet(() -> "Hi viewers"));
	}

}

/**

Printing  : 10
print  Even: 2
print  Even: 4
Hi viewers

**/