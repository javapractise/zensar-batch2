
public class Wrapper {
	public static void main(String args[]) {
		int a = 10;
		float b = 8.5f;
		char c = 'a';
		long d = 50;
		double e = 47.63d;
		boolean f = true;
		Integer intobj = a;
		Float floatobj = b;
		Character charobj = c;
		Long longobj = d;
		Double doubleobj = e;
		Boolean boolobj = f;
		System.out.println("Conversion of primitive to objects");
		System.out.println("Integer object " +intobj);
		System.out.println("Float object " +floatobj);
		System.out.println("Character object " +charobj);
		System.out.println("Long object " +longobj);
		System.out.println("Double object " +doubleobj);
		System.out.println("Boolean object " +boolobj);
		int intval = intobj;
		float floatval = floatobj;
		char charval = charobj;
		long longval = longobj;
		double doubleval = doubleobj;
		boolean boolval = boolobj;
		System.out.println("Conversion of objects to primitives");
		System.out.println("Integer value " +intval);
		System.out.println("Float value " +floatval);
		System.out.println("Character value " +charval);
		System.out.println("Long value " +longval);
		System.out.println("Double value " +doubleval);
		System.out.println("Boolean value " +boolval);
		
		
		
	}

}


/*
Output:
	Conversion of primitive to objects
	Integer object 10
	Float object 8.5
	Character object a
	Long object 50
	Double object 47.63
	Boolean object true
	Conversion of objects to primitives
	Integer value 10
	Float value 8.5
	Character value a
	Long value 50
	Double value 47.63
	Boolean value true
	*/
