package sai;

class Bank  
{
String accname="saichand";
int accno=67211;
double avalbal=13500;
public void details()
{
   System.out.println("Account Holder : "+accname+" accno:"+accno);
}
}
class Deposit extends Bank
{
double amt=4000;
public void depositamt()
{
  avalbal=avalbal+amt;
  System.out.println("Total balance after depositing Amt :"+avalbal);
}
}
public class inheritance_sample{
	public static void main(String args[])
	  {
	    Deposit d1=new Deposit();
	
	    d1.details();
	    d1.depositamt();
}
}
