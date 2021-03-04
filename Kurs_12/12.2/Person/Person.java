
package person;

import java.util.Scanner;

/**
 * @author bg15dv-jvockerodt   
 */

public class Person {

    
    public static void main(String[] args) {
 
        chara p1 = new chara();
  
        p1.set_name("Das");
        p1.set_vorname("Horst");
        p1.set_alter(32);

        System.out.println("Name:"+p1.get_name());
        System.out.println("Vorname:"+p1.get_vorname());
        System.out.println("Alter:"+p1.get_alter());    

        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name=sc.next();
        
            //Person p2 = new Person(); 
        
        p1.set_name(name);
        System.out.println("Name: "+p1.get_name());
    }
    
}
