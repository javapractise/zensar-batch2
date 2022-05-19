# Wrappers

They are mainly used when we have to send data to servers. The server only accepts object types hence the need of Wrapper classes

## Three types of wrapper classes

- Autoboxing

> Primitve --> Object

```java
int n = 4;
System.out.println(Integer.valueOf(4)); //Implicity used and also occasional
Integer m = n; //Commonly used
```

**Both give output of 4**

-Unboxing

> Object --> Primitve

```java
Integer nobj = 4;
System.out.println(nobj.intValue(4)); //Implicity used and also occasional
int m = n; //Commonly used
```
**Both give output of 4**

-Custom wrapper

> Simple example is if you want to write a class to convert **__Integer to Float__**
