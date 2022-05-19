//Creating the custom wrapper class  
class Wrapper{  
	private int a;  
	Wrapper(){}  
	Wrapper(int a){  
		this.a=a;  
	}  
	public int getVehicleSpeed(){  
		return a;		
	}  
	public void setVehicleSpeed(int a){  
		this.a=a;  
	}  
	@Override  
	public String toString() {
		return Integer.toString(a);  
	}  
}  
//Testing the custom wrapper class  
public class CustomWrapperClass {  
	public static void main(String[] args){  
		Wrapper obj =new Wrapper(100);  
		System.out.println("The Value of Object is "+obj);
		}
}


/*
Output: The Value of Object is 100
*/