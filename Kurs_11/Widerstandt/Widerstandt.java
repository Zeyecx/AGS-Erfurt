/* ## */
package widerstandt;
import javax.swing.JOptionPane;

/**
 *
 * @author BG15DV2-JSkopp
 */
public class Widerstandt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /* Varaibeln Deffinieren */
        double rone = 0;
        double rtwo = 0;
        double rges = 0;
        String eingabe = "";

      /* Nutzergabe */
        eingabe=JOptionPane.showInputDialog("Bitte Widerstand eins eingeben:  ");
        rone=Double.parseDouble(eingabe);
        
        eingabe=JOptionPane.showInputDialog("Bitte Widerstand zwei eingeben:  ");
        rtwo=Double.parseDouble(eingabe);
        
        /* Reihenschaltung */
       
        /* Berechnung */
            rges = rone + rtwo;
           System.out.println("Rreihe = "+rges+"Ohm");
        
         /* Parallelschaltung */
          
           /* Berechnung */
               rges = (rone * rtwo) / (rone + rtwo);
           
               /* Ausgabe */
               System.out.println("R(parallel) = "+rges+"Ohm");    
    }
    
}
