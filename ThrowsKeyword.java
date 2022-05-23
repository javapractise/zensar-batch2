package Training;

import java.io.IOException;

public class ThrowsKeyword {
	void m()throws IOException{
		throw new IOException("Device Error");
		
	}
	void n()throws IOException{
		m();
		
	}
	void p() {
		try {
			n();
			
		}catch(Exception e) 
		{System.out.println("exception handled");}
		
	}
	public static void main(String []args) {
		ThrowsKeyword obj = new ThrowsKeyword ();
		obj.p();
		System.out.println("Normal Flow");
	}
}
