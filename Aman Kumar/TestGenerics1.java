package day12;

import java.util.ArrayList;

class TestGenerics1{
	public static void main(String args[]) {
		ArrayList<Integer> m = new ArrayList<Integer>();
		m.add(2);
//m.add("Vivek");//Compile time error  
		System.out.println(m.get(0));
	}
}

/*

Output: 2


*/