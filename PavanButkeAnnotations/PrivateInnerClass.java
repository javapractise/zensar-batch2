//private inner class in java --By Pavan Butke


package zensar;

	class Demo {
		  
		   private int num = 175;  
		   
		 
		   public class Inner_Demo {
		      public int getNum() {
	         System.out.println("Get Enum method of Inner Class ");
		         return num;
		      }
		   }
		}

	public class PrivateInnerClass {

		   public static void main(String args[]) {
		  
		      Demo outer = new Demo();
		      
		      
		      Demo.Inner_Demo inner = outer.new Inner_Demo();
		      System.out.println(inner.getNum());
		   }
		}


