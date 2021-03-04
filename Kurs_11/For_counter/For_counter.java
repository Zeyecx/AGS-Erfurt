/* ## */
package for_counter;
import javax.swing.JOptionPane;
import java.util.*;

/**
 *
 * @author BG15DV2-JSkopp
 */
public class For_counter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        /*Deff Variabeln*/
          int Zahl = 0; /* anzahl der Durchläufe */
          int summe = 0; /* End Summe*/
          int cont = 0; /*eingbae der Zahl */
          String eingabe = ""; /*Parser content */
        
          /* Anzahl eingabe */  
            eingabe=JOptionPane.showInputDialog("Anzahl der Zahlen:");
            Zahl=Integer.parseInt(eingabe);
        
          /* End eingabe */
            System.out.println("Anzahl der Zahlen: "+Zahl); /*Ausgabe*/
            for(int x=1; x<=Zahl; x++) /* Schleife */
        {
            eingabe=JOptionPane.showInputDialog("Zahl eingeben:");
            cont=Integer.parseInt(eingabe);
            System.out.println("Zahl "+x+" = "+cont);
            summe = summe + cont; /*Addition*/


             }
     System.out.println("---------------------------------");
     System.out.println("Summe = "+summe);
    }
    
}
