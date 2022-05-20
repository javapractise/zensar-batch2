

class OuterClass {
	  Direction dir;
	  public OuterClass() {
	    dir = Direction.LEFT;
	  }
	  public OuterClass(Direction d) {
	    dir = d;
	  }
	  @Override
	  public String toString() {
		  if (dir==Direction.LEFT) {
			  return "left";
		  } else {
			  return "right";
		  }
	  }
	  public enum Direction { LEFT, RIGHT };
}
public class EnumInside {
	public static void main(String args[]) {
		OuterClass obj = new OuterClass(OuterClass.Direction.RIGHT);
        System.out.println(obj);		
	}
}
/*
 * Output :
 * right
 */

	  
	