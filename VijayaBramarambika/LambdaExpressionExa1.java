
interface Drawable{
	public void draw();
}
public class LambdaExpressionExa1 {
	public static void main(String args[]) {
		int width = 10;
		Drawable d = ()->{
			System.out.println("The width is " +width);
		};
		d.draw();
	}
}


/*
Output:
	The width is 10
*/