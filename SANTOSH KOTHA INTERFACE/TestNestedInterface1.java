package Training;
class A{  
	  interface Message{  
	   void msg();  
	  }  
	}  
	  
	class TestNestedInterface1 implements A.Message{  
	 public void msg(){System.out.println("Hello nested interface");}  
	  
	 public static void main(String args[]){  
	  A.Message message=new TestNestedInterface1();//upcasting here  
	  message.msg();  
	 }  
	}  


