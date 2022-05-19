
public class Autoboxing {

	public static void main(String[] args) {
		//Autoboxing example of int to Integer
		int a = 25;
		//Converting int into Integer 
		Integer b = Integer.valueOf(a); //converting int into Integer explicitly
		Integer c = a; //autoboxing
		
		System.out.println(a+" "+b+" "+c);
	}

}


/*
Output: 25 25 25
*/