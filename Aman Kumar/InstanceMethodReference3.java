package day14;

import java.util.function.BiFunction;

class Arthmetic {
	public int add(int a, int b) {
		return a + b;
	}
}

public class InstanceMethodReference3 {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new Arthmetic()::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}

/*

Output: 30


*/