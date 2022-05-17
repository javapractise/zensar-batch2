public class Main
{//Single level Inheritance
    public static class Vehicle{
        void describe(){
            System.out.println("I am driving a vehicle");
        }
    }
    
    public static class Car extends Vehicle{
        
        @Override
        void describe(){
            System.out.println("I am driving a car");
        }
    }
    
	public static void main(String[] args) {
	    Vehicle v = new Vehicle();
	    Car c = new Car();
	    
	    v.describe();  //Base class
	    c.describe();  // Sub class
	  
	}
}
