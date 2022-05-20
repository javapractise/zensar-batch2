interface Eatable{  
	 void eat();  
}
public class Inner_Interface {

	public static void main(String[] args) {
		Eatable e=new Eatable(){  
			 public void eat(){
				 System.out.println("Nice Fruits....");
		  	 }  
		 };  
		 e.eat();

	}

}

/*
Output:  Nice Fruits....
*/