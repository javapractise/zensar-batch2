
interface Main{
	void implement();
}
class sub implements Main{
	public void implement() {
		System.out.println("Interface main implemented");
	}
}
public class InterfaceOne {
	public static void main(String args[]) {
		sub obj = new sub();
		obj.implement();
	}

}

/*
Output:
	Interface main implemented
*/