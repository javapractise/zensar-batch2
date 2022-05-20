public class Local_Inner {
	private int data=30;//instance variable  
	void display(){  
		class Local{
			void msg(){System.out.println(data);
			}
		}  
	Local l=new Local();  
	l.msg();  
	}  
	public static void main(String args[]){  
		Local_Inner obj=new Local_Inner();  
		obj.display();  
	}  
}


/*
Output: 30
*/