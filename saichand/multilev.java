package sai;
class Bank1 
{
  int accno=23456;
  String accname="saichand";
  double availbal=80000;
  public void details1()
  {
     System.out.println("Acc name : "+accname+" Acc no : "+accno);
   }
}
class Deposit1 extends Bank1
{
    double amt=60000.5;
    public void deposit1()
    {
availbal = availbal + amt;
System.out.println("Amount deposited : "+availbal);

    }
}
class Withdrawl extends Deposit1
{
  double wamt=30000;
  public void witamt1()
  {
	 availbal = availbal - wamt;
System.out.println("Withdrawl amount : "+availbal);
   }
}
public class multilev
{
   public static void main(String args[])
   {
      Withdrawl w1 = new Withdrawl();
w1.details1();
w1.deposit1();
w1.witamt1();
   }
}


