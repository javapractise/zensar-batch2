
class Animal{  
	void eatSomething()
	{
		System.out.println("eating something");
	}  
}  
  
class Dog extends Animal{  
@Override  
void eatsomething(){
	System.out.println("eating foods");
	}//should be eatSomething  
}  
public class AnnotationOverride {
	public static void main(String args[]){  
		Animal a=new Dog();  
		a.eatSomething();  
	}
}

/*
Output:
	Compile time error.
*/