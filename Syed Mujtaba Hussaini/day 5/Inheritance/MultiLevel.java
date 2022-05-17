public class Main
{//Multi level  Inheritance
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
	
	public static class Camry extends Car{
        
        @Override
        void describe(){
            System.out.println("I am driving a Camry");
        }
    }
    
	public static void main(String[] args) {
	    Vehicle v = new Vehicle();
	    Car c = new Car();
	    Camry cam = new Camry();
		
	    v.describe();  //Base class
	    c.describe();  // Sub class
		cam.describe();
		
	  
	}
}
