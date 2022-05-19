package Training;

interface games{
	void tennis();
default void players() {
	System.out.println("tennis players");
}
}
public class TestInterface4 implements games {
	public void tennis() {
		System.out.println("tennis game");}
	public static void main(String[] args) {
		TestInterface3 g = new TestInterface3()
;				g.tennis();
		((games) g).players();
		
	}

}
