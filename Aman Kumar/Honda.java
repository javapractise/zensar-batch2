interface Car{
	void go();
	void stop();

}
public class Honda implements Car{
	public void go() {
		System.out.println("Signal is Green: GO.");
	}
	public void stop() {
		System.out.println("Signal is Red: Stop.");
	}
	public static void main(String[] args) {
		Honda h= new Honda();
		h.go();
		h.stop();

	}

}
