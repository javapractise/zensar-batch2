package May30;

interface Cook{
	public String dish();
}

public class LambdaNoPeri{

	public static void main(String[] args) {
		
		Cook c=()->{
			return "Biryani";
		};
		
		System.out.println(c.dish());
	}
	
	
}

/*o/p-->
Biryani
*/