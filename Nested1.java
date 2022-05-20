package Training;
class OuterClass{
	int x = 22;
	class InnerClass{
		int y =99;
		
	}
}
public class Nested1 {
	public static void main(String[] args) {
		OuterClass myOuter = new OuterClass();
		OuterClass.InnerClass myInner = myOuter.new InnerClass();
		System.out.println(myInner.y + myOuter.x);
	}

}
