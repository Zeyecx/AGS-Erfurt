
package division;
import java.util.*;

/**
 * @author bg15dv-jskopp
 * @date 16.02.2015
 */

public class Division {

    
    public static void main(String[] args) {
        calc c = new calc();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bitte geben Sie Zahl eins ein: ");
        c.set_z1(sc.nextDouble());
        
        System.out.println("Bitte geben Sie Zahl zwei ein: ");
        c.set_z2(sc.nextDouble());
        
        double ergebniss = c.teilen(c.get_z1(), c.get_z2());
        
        System.out.println("\nDas Ergbnis ist: "+ergebniss);
    }
    
}
