package Saichand_day14;
// with out lambda expression;
interface Drawable1{
	public void draw();
	}
	public class Lambdaexample2 {
	
			public static void main(String[] args){
				int width= 10;

				//with out lambda
				Drawable1 d = new Drawable1() {
					public void draw() {
				System.out.println("Drawing"+width);
					}
				};
				d.draw();
				}

}
	/*  out put:
	 Drawing10
	 */ 
