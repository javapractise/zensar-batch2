
interface SayableEx{
	void say();

}
public class StaticMethodReferenceExa1{
	public static void saySomething(){
          System.out.println("Hello,this is static method");
}
	public static void main(String[] args) {
		//Referring static method

		SayableEx sayable=StaticMethodReferenceExa1::saySomething;
		//calling interface method
		sayable.say();
	}
}

/* 
 Output:
 Hello,this is static method
*/ 
