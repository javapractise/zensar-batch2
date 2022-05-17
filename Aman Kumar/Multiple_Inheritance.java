interface scanner{
	void scan();
}
interface printer{
	void print();
}

class Printer_Machine implements scanner,printer{
	public void scan() {
		System.out.println("Scanning the documents...");
	}
	public void print() {
		System.out.println("Printing the documents...");
	}
}
public class Interface {
	public static void main(String[] args) {
		Printer_Machine P = new Printer_Machine();
		P.scan();
		P.print();
	}

}
