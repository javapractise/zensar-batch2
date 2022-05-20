abstract class Person{  
	  abstract void eat();  
}  
public class Anonymous_Inner {
	public static void main(String args[]){  
		Person p=new Person(){  
			void eat(){
				System.out.println("Nice Fruits");
			}  
		};  
		p.eat();  
	}  
}



/*
Output: Nice Fruits
*/