package inheritance;

class Tree {
	void source() {
		System.out.println("This class tree is Base");
	}
}
class Wood extends Tree {
	void mediate() {
		System.out.println("This class wood is derived from Tree");
	}
	
}
class Chair extends Wood {
	void child() {
		System.out.println("This class Chair is derived from Wood");
	}
}
public class MultilevelInheritance {
	public static void main(String args[]) {
		Chair obj = new Chair();
		obj.source();
		obj.mediate();
		obj.child();
		
	}
}


/*
Output:
	This class tree is Base
	This class wood is derived from Tree
	This class Chair is derived from Wood
*/
	
	
