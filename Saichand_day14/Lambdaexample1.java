package Saichand_day14;
interface Drawable{
public void draw();
}
public class Lambdaexample1 {
	public static void main(String[] args){
		int width= 10;

		//with lambda
		Drawable d2=()->{
		System.out.println("Drawing"+width);
		};
		d2.draw();
		}
}


/* out put:
Drawing10
*/