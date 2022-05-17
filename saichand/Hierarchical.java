package sai;
class Bank2   
{
  int accno=67211;
  String accname="saichand";
  double availbal=20000;
  public void details2()
  {
     System.out.println("Acc name : "+accname+" Acc no : "+accno);
   }
}
class Deposit2 extends Bank2
{
    double amt=6070.5;
    public void deposit2()
    {
availbal = availbal + amt;
System.out.println("Amount deposited : "+availbal);
    }
}
class Withdrawl2 extends Bank2
{
  double wamt=9000;
  public void witamt2()
  {
	  availbal = availbal + wamt;
System.out.println("Withdrawl amount : "+availbal);
   }
}

public class Hierarchical {
	public static void main(String args[])
	   {
	Deposit2 d1 = new Deposit2();
	d1.details2();
	d1.deposit2();
	Withdrawl2 w1 = new Withdrawl2();
	w1.details2();
	w1.witamt2();
	   }
	

}
out put:


Acc name : saichand Acc no : 67211
Amount deposited : 26070.5
Acc name : saichand Acc no : 67211
Withdrawl amount : 29000.0

