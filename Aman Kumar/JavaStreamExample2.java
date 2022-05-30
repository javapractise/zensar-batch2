package day14;

import java.util.stream.*;

public class JavaStreamExample2 {
	public static void main(String[] args) {
		Stream.iterate(1, elements -> elements + 1).filter(elements -> elements % 5 == 0).limit(5)
				.forEach(System.out::println);

	}
}

/*

Output:
5
10
15
20
25

*/