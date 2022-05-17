package Training;
class Animal{
	void eat(){System.out.println("drinking");}
}
class Lion extends Animal{
	void roar() {System.out.println("roaring");}
	
}

class Eagle extends Animal{
	void fly() {System.out.println("flying");}
}

public class TestInheritance3 {
	public static void main(String[] args) {
		Eagle e =new Eagle();
		e.eat();
		e.fly();
		
	}

}
