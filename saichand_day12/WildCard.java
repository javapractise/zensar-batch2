package saichand_day12;


	import java.util.*;
	abstract class shape{
	abstract void draw();
	}
	class Rectangle extends shape{
		void draw() {
			System.out.println("drawing rectangle");}
	}
	class Circle extends shape{
		void draw(){
			System.out.println("drawing circle");}
	}
			class WildCard{
	//creating a method that accepts only child class of shape
	public static void drawShape(List<?extends shape>lists){
	for (shape s:lists){
	s.draw();//calling method of shape class by child class instance
	}
	}
	public static void main(String args[]){
	List<Rectangle>list1=new ArrayList<Rectangle>();
	list1.add(new Rectangle());

	List<Circle>list2=new ArrayList<Circle>();
	list2.add(new Circle());
	list2.add(new Circle());


	drawShape(list1);
	drawShape(list2);
	}

}
			/* output:
			 * drawing rectangle
drawing circle
drawing circle
*/
