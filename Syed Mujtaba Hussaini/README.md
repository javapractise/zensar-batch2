## Throws program

**Important note**
``` 
If there are two different throws in two diffent classes. 
The throw of the first class's object to be instantiated will be shown.
The second class's code will be ommited
```
__Eg:__

```java
class Calci{
  void result{
    throw new ArithmeticExpression("Dont add negative numbers");
  }
}

class NCalci{
  void result{
    throw new ArithmeticExpression("Dont add positive numbers");
  }
}

public static void main(String[] args){

    NCalci n = new NCalci();
    n.result();
    
    Calci nn = new Calci();
    nn.result();
}
```

> In the above program only NCalci will execute and terminate as only one throw is allowed per program
