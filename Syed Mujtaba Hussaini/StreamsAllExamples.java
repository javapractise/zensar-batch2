import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		IntStream
		.range(1, 10)
		.forEach(System.out::print);
	System.out.println();
	
	// 2. Integer Stream with skip
	IntStream
		.range(1, 10)
		.skip(5)
		.forEach(x -> System.out.println(x));
	System.out.println();
	
	// 3. Integer Stream with sum
	System.out.println(
	IntStream
		.range(1, 5)
		.sum());
	System.out.println();
		
	// 4. Stream.of, sorted and findFirst
	Stream.of("Ava", "Aneri", "Alberto")
		.sorted()
		.findFirst()
		.ifPresent(System.out::println);
		
	// 5. Stream from Array, sort, filter and print
	String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
	Arrays.stream(names)	// same as Stream.of(names)
		.filter(x -> x.startsWith("S"))
		.sorted()
		.forEach(System.out::println);
				
	// 6. average of squares of an int array
	Arrays.stream(new int[] {2, 4, 6, 8, 10})
		.map(x -> x * x)
		.average()
		.ifPresent(System.out::println);
	
	// 7. Stream from List, filter and print
	List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah");
	people
		.stream()
		.map(String::toLowerCase)
		.filter(x -> x.startsWith("a"))
		.forEach(System.out::println);
	
	
	Arrays
		.stream(new int[] {20,12,34,56})
		.filter(x -> x >= 21)
		.forEach(System.out::println);
	
	}

}

/**
123456789
6
7
8
9

10

Alberto
Sarah
Sarika
Shivika
44.0
al
ankit
amanda
34
56
**/