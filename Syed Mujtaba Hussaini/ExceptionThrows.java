public class Main {
	
	static class Food{
		
		@SuppressWarnings("null")
		void eat() {
			String s = null;
			System.out.println("The length of the food is" + s.length());
		}
		
		void drink() {
			try {
				System.out.println("I like to drink before eating");
				eat();
			}catch(Exception e) {
				System.out.println("Your plate dosent have any food");
			}
		}
	}
	
	static class Calculate{
		int sum(int a, int b) throws ArithmeticException{
			if(a+b >= 10) {
				throw new ArithmeticException("Please enter lower values");
			}else {
				return a + b;
			}
		}
	}
	
	@SuppressWarnings("serial")
	static class AgeException extends Exception {

		String s;
		AgeException(String s){
			super(s);
			this.s = s;
		}
		
	}

	public static void main(String[] args) throws Main.AgeException {
		Food f = new Food();
		f.drink();
		
		Calculate c = new Calculate();
		c.sum(12, 2);
		
		int age = 17;
		if(age >= 18 ) {
			System.out.println("You are an adult");
		}else {
			throw new AgeException("You are not an adult");
			
		}

	}

}

/**
Output

I like to drink before eating
Your plate dosent have any food
Exception in thread "main" java.lang.ArithmeticException: Please enter lower values
	at Main$Calculate.sum(Main.java:25)
	at Main.main(Main.java:48)

**/