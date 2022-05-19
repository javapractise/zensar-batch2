package Training;



interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class TestInterface3 implements Showable{  
public void print(){System.out.println("Hello");}  
public void show(){System.out.println("Welcome to Java");}  
  
public static void main(String args[]){  
	TestInterface3 obj = new TestInterface3();  
obj.print();  
obj.show();  
 }
public void tennis() {
	// TODO Auto-generated method stub
	
}  
}  