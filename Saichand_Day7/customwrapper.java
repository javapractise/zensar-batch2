package sai;
class javat{
	private int i;
	javat(int i){
		this.i=i;
		
	}
	public int getvalue() {
		return i;
		
	}
	public void setvalue(int i) {
		this.i=i;
		
	}
	public String toString() {
		return Integer.toString(i);
		
	}
}
public class customwrapper {
	public static void main(String[] args) {
		javat j=new javat(78);
		System.out.println(j);
	}

}

Output:
===========
78