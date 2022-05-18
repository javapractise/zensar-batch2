interface Online_Test{
	void test();
}
interface Interview{
	void interview();
}
public class Selection implements Online_Test, Interview {
	public void test() {
		System.out.println("For the recruitment Pass the online test.");
	}
	public void interview() {
		System.out.println("For the recruitment qualify the Interview Round.");
	}

	public static void main(String[] args) {
		Selection s=new Selection();
		s.test();
		s.interview();
		
		System.out.println("Congratulations, You are recruited in the organization.....");

	}

}
