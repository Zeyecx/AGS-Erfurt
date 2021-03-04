
package auto;
import java.util.*;
        

/**
 *
 * @author Barthyr
 */
public class Auto {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pkw pkw = new pkw();
        
        
        // Auto zurücksetzen
        pkw.set_default();
        
        // Wunsch Auto setzen
        pkw.user();
        
        //Beschleunigen
        pkw.beschleunigen();
        
        // Werte ausgeben
        System.out.println("Sie fahren gerade: "+pkw.get_ges()+"km/h\n BREMSEN SIE !!!");
            
        // Bremsen
        pkw.bremsen();
         
        // Werte ausgeben
        System.out.println("Sie fahren einen: "+pkw.get_auto());
        System.out.println("Sie fahren aktuell: "+pkw.get_vakt()+"km/h");
        System.out.println("Sie könnten fahren: "+pkw.get_vmax()+"km/h");
        
    }
    
}
