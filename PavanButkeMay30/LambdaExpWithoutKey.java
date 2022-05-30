package May30;

interface Risky{
	int divide(int x, int y);
}

public class LambdaExpWithoutKey {

	public static void main(String[] args) {
		
		Risky  div1=(x,y)->(x*y);
		System.out.println(div1.divide(19, 30));
		
		Risky div2=(int x , int y)->{
			return (x*y);
		};
		
	System.out.println(div2.divide(8973,808));
	}
	
}


/*o/p-->
570
7250184
*/