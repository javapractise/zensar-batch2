
interface Tree {
	void nature();
}
interface Wood extends Tree {
	void material();
}
class Table implements Wood {
	Table() {
		System.out.println("Implements both Tree and wood");
	}
	public void nature() {
		System.out.println("This is tree interface extended by wood interface");
	}
	public void material() {
		System.out.println("This is wood interface implemnted by table class");
	}
}
public class InterfaceTwo {
	public static void main(String args[]) {
		Table t = new Table();
		t.nature();
		t.material();
	}
}


/*
Output:
	Implements both Tree and wood
	This is tree interface extended by wood interface
	This is wood interface implemnted by table class
*/