
public class Main {

	/* Member inner class */
	static class Console{
		String name = "PS4";
		
		class Ps4{
			void describe() {
				System.out.println("My favourite console is " + name);
			}
		}
	}

	/**Anonymous inner class **/
	abstract static class Mobile{
		abstract void topModel();
	}
	
	static public class Juice{
		int quantity = 12;
		void shops() {		
			class LocalShops{
				void shopDetail() {
					System.out.println("The best shop is Lassi shop");
					System.out.println("No of juices are " + quantity);
				}	
			}
			LocalShops ls = new LocalShops();
			ls.shopDetail();
		}	
	}
	
	/** Static nested classes **/
	static class Color{
		static String name = "blue";
		static class Dress{			
			static void describe() {
				System.out.println("I like wearing blue color dresses");
			}
		}
	}
	
	/** Nested interfaces **/
	interface Destination{
		
		interface India{
			void ooty();
		}
	}
	
	static class Travel implements Destination.India{
		
		public void ooty() {
			System.out.println("I love ooty");
		}
	}
	
	public static void main(String[] args) {
		
		Console c = new Console();
		Console.Ps4 p = c.new Ps4();
		p.describe();
		
		Mobile m=new Mobile(){  
			 void topModel(){
				 System.out.println("My favourite mobile is Samsung");
				 }  
		};
		m.topModel();
	
		Juice j = new Juice();
		j.shops();
		
		Color.Dress.describe();
		
		Destination.India i = new Travel();
		i.ooty();
	
	}

}

/**

Output

My favourite console is PS4
My favourite mobile is Samsung
The best shop is Lassi shop
No of juices are 12
I like wearing blue color dresses
I love ooty

**/