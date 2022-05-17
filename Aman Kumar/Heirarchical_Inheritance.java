class Animal{
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barkng...");
	}
}
class Cat extends Animal{
	void drink() {
		System.out.println("drinking milk...");
	}
}
public class Heirarchical_Inheritance {

	public static void main(String[] args) {
		Cat c= new Cat();
		Dog d= new Dog();
		c.drink();
		c.eat();
		
		d.bark();
		d.eat();
	}

}
