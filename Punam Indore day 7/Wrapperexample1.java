class Wrapperexample1{
  private int it;

  Wrapper(int i){
    this.it = i;
  }

  public int getValue() {
    return it;
  }

  public void setValue(int i) {
    this.it = i;
  }

  public String toString() {
    return Integer.toString(it);
  }
}
public class CustomWrapperDemo {
  public static void main(String[] args) {
    Wrapper w = new Wrapper(20);
    w.setValue(60);
    System.out.println(w.getValue());
    System.out.println(w);
  }
} 
