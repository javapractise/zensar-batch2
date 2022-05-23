package Training;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
			int a[] =new int[5];
			a[5] =30/0;
			
		}
		
		catch(ArithmeticException e)
		{
				System.out.println("Arithmetic Exception occurs");
				
		}
	
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoardException occurs");
	}
		catch(Exception e) {
			System.out.println("ParentException occurs");
			
		}
		System.out.println("Rest of the code");
		
	}

}
