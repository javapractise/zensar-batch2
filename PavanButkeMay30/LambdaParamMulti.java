package May30;

interface Calculate{
	int multiply(int x , int y);
}


public class LambdaParamMulti {

	public static void main(String[] args) {
		
		Calculate cal1= (x, y)->(x*y);
		
		System.out.println(cal1.multiply(10,5));
	
	
	
	Calculate cal2= (int x , int y)->(x*y);
	
	System.out.println(cal2.multiply(890,980));
	
	}
}

/* o/p:=>
 
 50
872200
 */
 
