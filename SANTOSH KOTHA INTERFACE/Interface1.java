package Training;
interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw() {System.out.println("drawing rectanglr");}
}
class Circle implements Drawable{
	public void draw() {System.out.println("drawing circle");}
}

public class Interface1 {
	public static void main(String[] args) {
		Drawable d=new Circle();
		
		d.draw();
	}

}
