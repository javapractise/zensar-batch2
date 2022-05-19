public class Main
{
    public static class CustomWrapper{  
         int i;  
        CustomWrapper(){}  
        
        CustomWrapper(int i){  
            this.i=i;  
        }  
        
        public int getValue(){  
            return i;  
        }  
        
        public void setValue(int i){  
            this.i=i;  
        }  

        public float toFloat() {  
            return i;  
        }  
    }
    
	public static void main(String[] args) {
		 byte b = 123;
		 int i = 123;
		 short s = 12;
		 long l = 1234;
		 float f = 234.23f;
		 double d = 1234.1234;
		 char c = 'c';
		 
		 Byte bobj = 123;
		 Integer iobj = 123;
		 Short sobj = 12;
		 Long lobj = 1234L;
		 Float fobj = 234.23f;
		 Double dobj = 1234.1234;
		 Character cobj = 'c';
		 
		 System.out.println("Autoboxing");
		 //Autoboxing
		 System.out.println(Byte.valueOf(b));
		 System.out.println(Integer.valueOf(i));
		 System.out.println(Short.valueOf(s));
		 System.out.println(Long.valueOf(l));
		 System.out.println(Float.valueOf(f));
		 System.out.println(Double.valueOf(d));
		 System.out.println(Character.valueOf(c));
		 
		 System.out.println();
		 System.out.println("Unboxing");
		 //Unboxing
		 System.out.println(bobj.intValue());
		 System.out.println(iobj.intValue());
		 System.out.println(sobj.intValue());
		 System.out.println(lobj.intValue());
		 System.out.println(fobj.intValue());
		 System.out.println(dobj.intValue());
		 System.out.println(cobj.charValue());
		
		 System.out.println();
		 
		 //CustomWrapper
		 
		 CustomWrapper cw = new CustomWrapper(12);
		 System.out.println("The value from integer to float is: " + cw.toFloat());
    }  
	
}

/** Autoboxing
123
123
12
1234
234.23
1234.1234
c

Unboxing
123
123
12
1234
234
1234
c

The value from integer to float is: 12.0 
**/
