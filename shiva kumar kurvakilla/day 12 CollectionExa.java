import java.util.*;
public class CollectionExa{
public static void main(String args[]){
List<String> list=new ArrayList<String>();
list.add("shiva");
list.add("kumar");
list.add("kurvakila");
System.out.println("Initial Collection Value:"+list);
Collections.addAll(list,"servelt","Jsp");
System.out.println("After adding elements collection value:"+list);
String[] strArr={"C#",".Net"};
Collections.addAll(list,strArr);
System.out.println("After adding array collection value:"+list);
}
}


out put:
Initial Collection Value:[shiva, kumar, kurvakila]
After adding elements collection value:[shiva, kumar, kurvakila, servelt, Jsp]
After adding array collection value:[shiva, kumar, kurvakila, servelt, Jsp, C#, .Net]
