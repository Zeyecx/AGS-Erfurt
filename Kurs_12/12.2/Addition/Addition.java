
package addition;
import java.util.*;

/**
 * @author bg15dv-jskopp 
 */

public class Addition {

    
    public static void main(String[] args) {

        /* Object Block */
        add add = new add();
        Scanner sc = new Scanner(System.in);
        
        /*  Reverse setter Block */
            /* z1 set */
            System.out.println("Bitte geben Sie eine Zahl ein:");
            add.set_z1(sc.nextDouble());
            System.out.print("\n");
        
            /* z2 set */
            System.out.println("Bitte geben Sie eine Zahl ein:");
            add.set_z2(sc.nextDouble());
            System.out.print("\n");
            
        /* allow calc  */    
           add.set_sum_calc(true);
           
        /*  cls --> cmd.exe */
           for(int c=0; c<=42; c++){
               System.out.print("\n");
           }

        /* Ausgabe */
            System.out.println("Zahl 1: "+add.get_z1());
            System.out.println("Zahl 2: "+add.get_z2());
            System.out.println("Summe: "+add.get_sum());    
    }
    
}
