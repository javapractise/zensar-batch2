class EnumExample1{
//defining the enum inside the class
  public enum season{WINTER,SPRING,SUMMER,FAIL}
  // main method 
    public static void main (String [] args){
    // traversing the enum
      for (season s: Season.value())
      System.out.println(s);

      }
      }

output;
SUMMER
WINTER
SPRING FAIL
