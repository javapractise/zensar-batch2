import java.io.PrintStream;
public class Inner_Class {
	private int data=30;
	class Inner{
		void msg(){
			System.out.println("Data is "+data);
		}  
	}  
	public static void main(String args[]){
		Inner_Class obj=new Inner_Class();
		Inner_Class.Inner in=obj.new Inner();
		in.msg();  
	 }
}



/*

Output: Data is 30

*/