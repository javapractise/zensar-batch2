package sai;
class Pclass{
public void pmethod(){
System.out.println("This is parent class");
}
}



class Cclass extends Pclass{
public void cmethod(){
System.out.println("This is child class");
}
}



public class interface3 {
	public static void main(String[] args){
		Pclass m = new Pclass();
		Cclass n = new Cclass();
		m.pmethod();
		n.cmethod();
		n.pmethod();
		}

}
Output:

=============
This is parent class
This is child class
This is parent class
