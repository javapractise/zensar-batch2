
interface Eatable{  
	 void eat();  
}  
public class InnerInterface {
	public static void main(String args[]){  
		 Eatable e=new Eatable(){  
			 public void eat(){
				 System.out.println("nice fruits");
		  	 }  
		 };  
		 e.eat();  
	}
}



/*
Output:
	nice fruits
	*/
