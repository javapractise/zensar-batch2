package Saichand_day14;


	interface Messageable{
		message getmessage(String msg);
	}
	class message{
	message(String[] msg){
	System.out.println(msg);
	}
	}
	public class Constructor_reference {
	  public static void main(String[] args){
	    Messageable hello=message::new;
	     hello.getmessage("Hello");
	}

}
	/* Output:
	 Hello*/
