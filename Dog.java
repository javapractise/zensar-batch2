package Topic;


public class Dog extends Animals{
   	 void bark() {
   		 System.out.println("barking");
   	 }
    }
    class BabyDog extends Dog{
   	 void weep() {
   		 System.out.println("weeping");
   	 }
	public static void main(String[] args) {
		BabyDog d= new BabyDog();
		d.weep();
		d.bark();
		d.eat();
		
	}
    }
   


