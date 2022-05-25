/* Program showing example of Inter Thread Communication by Pavan Butke*/


package zensar;


class Customer{    
int amount=10000;    
    
synchronized void withdraw(int amount){    
System.out.println("I'm going to Withdraw amount");    
    
if(this.amount<amount){    
System.out.println("Oho! Sorry you have Less Balance , Kindly deposit some amount");    
try{wait();}catch(Exception e){}    
}    
this.amount-=amount;    
System.out.println("Tada! You have succesfully Withdrawn amount");    
}    
    
synchronized void deposit(int amount){    
System.out.println("I'm going to deposit the amount");    
this.amount+=amount;    
System.out.println("Tada! You have suceesfully deposited the amount");    
notify();    
}    
}    
    

public class InterThreadEx {


	public static void main(String args[]){    
		final Customer c=new Customer();    
		new Thread(){    
		public void run(){c.withdraw(15000);}    
		}.start();    
		new Thread(){    
		public void run(){c.deposit(10000);}    
		}.start();    
		    
		}
}


/*o/p:I'm going to Withdraw amount
Oho! Sorry you have Less Balance , Kindly deposit some amount
I'm going to deposit the amount
Tada! You have suceesfully deposited the amount
Tada! You have succesfully Withdrawn amount
*/