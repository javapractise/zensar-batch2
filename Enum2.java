package Training;

import Training.Enum.Level;

public class Enum2 {
public static void main(String[] args) {
	Level myVar = Level.LOW;
	
	switch(myVar) {
	case LOW:
	System.out.println("LOW LEVEL");
	break;
	case MEDIUM:
	System.out.println("Medium level");
	break;
	case HIGH:
System.out.println("High Level");
break;
	}
}
}
