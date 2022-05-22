class Animal {
  public void displayInfo() {
    System.out.println("I am an animal.");
  }
}

class Lion extends Animal {
  @Override
  public void displayInfo() {
    System.out.println("I am a tiger.");
  }
}

class Main {
  public static void main(String[] args) {
    Lion d1 = new Lion();
    d1.displayInfo();
  }
}
