interface Game{
	void cricket();
}
interface Audience extends Game{
	void enjoy();
}
public class IPL_Match implements Audience{
	public void cricket() {
		System.out.println("Cricket match is being played between MI ans CSK");
	}
	public void enjoy() {
		System.out.println("Audience is enjoying match...");
	}
	public static void main(String[] args) {
		IPL_Match i =new IPL_Match();
		i.cricket();
		i.enjoy();
	}

}
