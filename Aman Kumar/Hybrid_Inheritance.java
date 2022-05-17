class A{
	void Display() {
		System.out.println("Display of Mobile...");
	}
}
class B extends A{
	void Input() {
		System.out.println("Touch the screen..");
	}
}
class C extends B{
	void Making_call() {
		System.out.println("Calling....");
	}
}
class D extends A{
	void Game() {
		System.out.println("Starting the game...");
	}
}
class E extends D{
	void Play() {
		System.out.println("playing....");
	}
}
class Hybrid_Inheritance {

	public static void main(String[] args) {
		C Obj1 = new C();
		E Obj2 = new E();
		
		Obj1.Display();
		Obj1.Input();
		Obj1.Making_call();
		
		Obj2.Display();
		Obj2.Game();
		Obj2.Play();

	}

}
