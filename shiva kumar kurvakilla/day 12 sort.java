import java.util.*;
class TestSort{
public static void main(String args[]){



ArrayList<String> al=new ArrayList<String>();
al.add("Shiva");
al.add("sidhu");
al.add("Sidhu");
al.add("shiva");





Collections.sort(al);
Iterator itr=al.iterator();
while(itr.hasNext()){
System.out.println(itr.next());
}
}
}


out put:
Shiva
Sidhu
shiva
sidhu