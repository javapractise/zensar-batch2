package zensar;
import java.util.*;

public class VectorDS {

    
    public static void main(String arg[]) {   
           
        Vector < String > weapons = new Vector < String > ();  
  
            weapons.add("Gun");  
            weapons.add("mortar");  
            weapons.add("Panzerfaust");  
            weapons.add("lewisite");  
            weapons.add("tear gas");  
            weapons.add("Greek fire");  
            weapons.add("spear");  
             
            Iterator<String> itr = weapons.iterator();  
            while(itr.hasNext()){  
                 System.out.println(itr.next());  
            }   
    }              
}  

/*o/p:
Gun
mortar
Panzerfaust
lewisite
tear gas
Greek fire
spear
*/