public class StaticInner{
  static int data=20;

  static class Inner{
   void msg(){System.out.println("data is "+data);}
  }
 
  public static void main(String args[]){
  StaticInner.Inner obj=new StaticInner.Inner();
  obj.msg();
  }
}
