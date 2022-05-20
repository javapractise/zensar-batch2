
class Outer {
	static int a =10;
	static class Inner{
		void run() {
			System.out.println("The value of a is "+a);
		}
	}
}
public class StaticInner {
	public static void main(String args[]) {
		Outer.Inner obj = new Outer.Inner();
		obj.run();
		
	}

}



/*
Output:
	The value of a is 10
*/