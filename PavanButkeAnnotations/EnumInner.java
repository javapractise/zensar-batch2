// Inner Enum by Pavan Butke


class OuterClass {
	  Direction dir;
	  public OuterClass() {
	    dir = Direction.Up;
	  }
	  public OuterClass(Direction d) {
	    dir = d;
	  }

	  @Override
	  public String toString() {
		  if (dir==Direction.Down) {
			  return "down";
		  } else {
			  return "up";
		  }
	  }
	  public enum Direction { Down , Up};
}
public class EnumInside {
	public static void main(String args[]) {
		OuterClass obj = new OuterClass(OuterClass.Direction.Up);
        System.out.println(obj);		
	}
}