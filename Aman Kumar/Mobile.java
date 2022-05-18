interface Operating_System{
	void android();
}
public class Mobile implements Operating_System{
	public void android() {
		System.out.println("Operating System Android..");
	}
	public static void main(String[] args) {
		Mobile m= new Mobile();
		m.android();
	}

}
