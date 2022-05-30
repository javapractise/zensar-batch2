import java.util.function.BiFunction;

public class MethodReference {

	interface Name{
		void say();
	}
	
	interface Messageable{  
	    Message getMessage(String msg);  
	}
	
	
	public static class Message{  
	    Message(String msg){  
	        System.out.print(msg);  
	    }  
	}  
	
	public static class Family{
		public static void sayMyName() {
			System.out.println("My name is Syed");
		}
		
		public void tellMyAge() {
			System.out.println("My age is 25");
		}
	}
	
	public static class Div{
		public static int div(int a, int b) {
			return a / b;
		}
		
		public int mul(int a, int b) {
			return a * b;
		}
	}	
	

	
	
	public static void main(String[] args) {
		
		//reference to static method
		Name n = Family::sayMyName;
		n.say();
		
		
		BiFunction<Integer, Integer, Integer>d = Div::div;
		System.out.println(d.apply(4,2));
		
		//reference to an instance method
		Family f = new Family();
		Name nn = f::tellMyAge;
		nn.say();
		
		Name nnn = new Family()::tellMyAge;
		nnn.say();
		
		BiFunction<Integer, Integer, Integer>dd = new Div()::mul;
		System.out.println(dd.apply(4,2));
		
		//reference to a constructor
		Messageable hello = Message::new;  
        hello.getMessage("Hello");  

	}

}

/**
My name is Syed
2
My age is 25
My age is 25
8
Hello
**/