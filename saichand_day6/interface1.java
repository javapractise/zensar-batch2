package sai;
interface Drawable{
	void draw();
}
class Rectangle implements Drawable{
	public void draw() {System.out.println("drawing rectanglr");}
}
class Circle implements Drawable{
	public void draw() {System.out.println("drawing circle");}
}


public class interface1 {
	public static void main(String[] args) {
		Drawable d=new Circle();
		
		d.draw();
	}

}

output:
	
	drawing circle