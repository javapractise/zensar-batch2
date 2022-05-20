package basics;

import java.util.HashSet;

import basics.Basics.Color.Pen;

public class Basics {
	
	//Inner static class
	static class Animals{
		static class Cat{
			static void describe() {
				System.out.println("Cat does meow");
			}
		}
	}
	
	//Private inner class
	static class Juice{			
			private class Mango{
				void describe() {
					System.out.println("Mango is tasty");
				}
			}
			
			void drink() {				
				Mango m = new Mango();
				m.describe();
			}
	}

	//Accessing dish member name outside from inner class
	static class Food{
		String dish = "Roll";
		private class Plate{
			void eat() {
				System.out.println("I like to eat " + dish);
			}
		}
		
		void taste() {
			Plate p = new Plate();
			p.eat();
			
		}
	}
	
	enum Color{
		RED,GREEN,BLUE;
		
		static class Pen{
			void write() {
				System.out.println("We use a pen to write");
			}
		}
	}

	public static void main(String[] args) {
		
		Animals.Cat.describe();
		
		Juice j = new Juice();
		Juice.Mango m = j.new Mango();
		m.describe();
		
		Food f = new Food();
		Food.Plate p = f.new Plate();
		p.eat();
		
		Color.Pen c = new Color.Pen();
		c.write();
		
		for(Color cc: Color.values()) {
			System.out.println(cc);
		}
	}
	

}

/**
Cat does meow
Mango is tasty
I like to eat Roll
We use a pen to write
RED
GREEN
BLUE
**/