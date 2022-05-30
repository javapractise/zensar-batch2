//multiple paramters:
interface Addable{
int add(int a,int b);
}

public class MultipleParameter{
public static void main(String[] args){

//multiple paramters in lambda expression

Addable ad1=(a,b)->(a+b);
System.out.println(ad1.add(10,20));

//multiple parameters with data type inlambda expression
Addable ad2=(int a,int b)->(a+b);
System.out.println(ad2.add(100,200));
}
}


/*
output:
30
300
*/