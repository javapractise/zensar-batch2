interface Showable{  
	void show();  
	interface Message{  
		void msg();  
	}  
}  
public class Nested_Interface implements Showable.Message{
	public void msg(){
		System.out.println("Hello Nested interface");
	}  
	public static void main(String args[]){  
		Showable.Message message=new Nested_Interface();//upcasting here  
		message.msg();  
	}  
}

/*
Output: Hello Nested interface
*/