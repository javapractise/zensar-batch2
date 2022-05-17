public class Main
{//Hybrid Inheritance
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
	
	public static class Camry extends Vehicle{
        
        @Override
        void describe(){
            System.out.println("Camry is a Car technically which is a Vehicle");
        }
    }
	
	public static class Boost extends Camry{
        
        @Override
        void describe(){
            System.out.println("Camry is a Car which has nitro boost");
        }
    }
	
	public static class Seats extends Camry{
        
        @Override
        void describe(){
            System.out.println("Camry has one of the best seats");
        }
    }
    
	public static void main(String[] args) {
	    Vehicle v = new Vehicle();
	    Car c = new Car();
	    Camry cam = new Camry();
		Boost b = new Boost();
		Seats s = new Seats();
		
	    v.describe();  //Base class
	    c.describe();  // Sub class
		cam.describe();
		b.describe();
		s.describe();
		
	  
	}
}
