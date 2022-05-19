
class Wrapper{
	private int i;
	Wrapper(){}
	Wrapper(int a) {
		i = a;
	}
	public int getValue() {
		return i;
	}
	public void setValue(int a) {
		i =a;
	}
	public String toString() {
		return Integer.toString(i);
	}
	
}
public class Custom {
	public static void main(String args[]) {
		Wrapper obj = new Wrapper(50);
		System.out.println("The value of object is "+obj);
	}
}


/*
Output:
	The value of object is 50
*/