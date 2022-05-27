
public class Main {

	interface cook{
		default void start() {
			System.out.println("Start cooking the dishes");
		}
	}
	
	interface reviews{
		int ratings = 5;
		int quantity = 2;
		String location = "RT nagar";
	}
	
	interface ingredients extends cook{
		void pizza();
		void burger();
		void dosa();
	}
	
	static class Food implements ingredients, reviews{
		
		public void pizza() {
			System.out.println("I would like to order a pizza");
		}
		
		public void burger() {
			System.out.println("I would like to order " + quantity + " burgers please!!");
		}
		
		public void dosa() {
			System.out.println("I would like to parcel the dosa. Thank you!!");
		}
		
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		Food f = new Food();
		f.start();
		f.pizza();
		f.burger();
		f.dosa();
		System.out.println("The ratings for all the dishes are " + f.ratings 
				+ " and the location is in " + f.location);

	}

}

/**
Start cooking the dishes
I would like to order a pizza
I would like to order 2 burgers please!!
I would like to parcel the dosa. Thank you!!
The ratings for all the dishes are 5 and the location is in RT nagar
**/