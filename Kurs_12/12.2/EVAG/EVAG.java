
package evag;
import java.io.*;
import java.util.*;

/**
 * @author Barthyr
 * @version 0.1
 */

public class EVAG {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SBahn sb = new SBahn();
        PrintStream err = System.err; // wer es kann ;) 
     
        
        //Ablauf an einem Beispiel: --> zum Bleistift
        
        //lade Einstellungen (config --> default)
        sb.set_default();
        
        //Linie ?!
        sb.anzeigen();
        
        //max. Passagiere ?!
        System.out.println("Es können sich maximal "+sb.get_max_pass()+" Leute in der SBahn aufhalten.");
        
        //alle einsteigen
        sb.einsteigen(10);
        
        //losfahren 
        sb.fahren();
        
        //anhalten ;)
        sb.halten();
        
        //aussteigen
        sb.aussteigen(9);
        
        // Wie viele sind noch da?
        sb.getPassagiere(); //Na, der bekommt ein Keks. Dafür brauch ich nicht mal eine Methode ^^
        
        //Zerstörung des Universums
        System.exit(0);
        
        
        
    }
    
}
