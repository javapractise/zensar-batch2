public class Main
{//Multiple Inheritance
    public static interface Vehicle{
        void describe();
    }
	
	public static interface Element{
		void drive();
	}
    
    public static class Car implements Vehicle, Element{
        
        @Override
        public void describe(){
            System.out.println("I am driving a car");
        }
		
		@Override
		public void drive(){
            System.out.println("I am driving a car on the land");
        }
    }
    
	public static void main(String[] args) {
	    Car c = new Car();
	    

	    c.describe();  // Can be implemented using Interfaces only
		c.drive();
	  
	}
}
