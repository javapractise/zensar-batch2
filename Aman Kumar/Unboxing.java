
public class Unboxing {

	public static void main(String[] args) {
		
		
		Integer a= new Integer(22);
		
		int i=a.intValue();//converting Integer to int explicitly
		int j= a; //AutoUnboxing
		System.out.println(a+" "+i+" "+j);
	}

}



/*
Output: 22 22 22
*/