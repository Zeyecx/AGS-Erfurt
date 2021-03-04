/*BG15DV2 ~ JSKOPP */
package eingabe;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author BG15DV2-jskopp
 */
public class Eingabe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Deklaration der Variabeln */
        int ganzzahl = 0; /* ohne Komma */
        double gleitkommazahl = 0; /* mit Komma */
        String eingabe; /* "TEXT" */
        
       /* Eingabe der Werte*/
            /* Ganzzahl */
                eingabe = JOptionPane.showInputDialog("Bitte Ganzzahl eingeben: ");
                ganzzahl=Integer.parseInt(eingabe);
            
             /* Gleitkommazahl */
                eingabe = JOptionPane.showInputDialog("Bitte Gleitkommazahl eingeben: ");
                gleitkommazahl=Double.parseDouble(eingabe);
        
        /* Ausgabe  */ 
        System.out.println(" Ganzzahl "+ganzzahl);
        System.out.println(" Gleitkommazahl "+gleitkommazahl);
    }
    
}
