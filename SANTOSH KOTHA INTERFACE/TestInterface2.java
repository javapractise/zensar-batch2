package Training;
interface Bank{
	float rateOfInterest();	
}

class HDFC implements Bank{
	public float rateOfInterest() {return 8.99f;}
}
class AXIS implements Bank{
	public float rateOfInterest() {return 8.5f;}	
}

public class TestInterface2 {
public static void main(String[] args) {
	Bank b=new AXIS();
	System.out.println("ROI;"+b.rateOfInterest());
}
}
