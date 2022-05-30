package May30;

interface Play{
	public void cricket();
}


public class LambaExpressionNew {

	public static void main(String[] args) {
		
		String str = "IPL";
		
		Play p=()->{
			
			System.out.println("Playing "+str);
		};
		
		p.cricket();
		
	}
	
}

/*o/p=>
Playing IPL
*/