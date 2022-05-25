
public class InterThread {
	
	final static int amt = 6000;
	public static class Gpay {
		
		int amt;
		
		synchronized void gpay(int amt){
			if(this.amt < amt) {
				System.out.println("Less amount in Gpay need to move to Phone pay...");
				try {
					wait();
				}catch(Exception e){}	
				System.out.println("Amount added successfullyy :)");
			}
		}
		
		synchronized void phonepay(int amt) {
			System.out.println("Moved to Phonepay");
			this.amt += amt;
			System.out.println("Amount sent to Gpay");
			try {
				notify();
			}catch(Exception e) {}
		}
		
	
	
	public static void main(String[] args) {
		
		Gpay g = new Gpay();
		
		new Thread() {
			public void run() {
				g.gpay(300);
			}
		}.start();
		
		new Thread() {
			public void run() {
				g.phonepay(6300);
			}
		}.start();
	}

}
}

/**
Less amount in Gpay need to move to Phone pay...
Moved to Phonepay
Amount sent to Gpay
Amount added successfullyy :)
**/