
package flaeche_joptionpane;
import javax.swing.JOptionPane;

/**
 *
 * @author bg15dv-jskopp
 */
public class Flaeche_JOptionPane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Variabeln deff. */
        double laenge = 0;
        double breite = 0;
        double flaeche = 0;
        String eingabe = "";
        
        /*Eingabe der Werte*/
        eingabe = JOptionPane.showInputDialog("Bitte Länge eingeben: ");
        laenge = Double.parseDouble(eingabe);
        
        eingabe = JOptionPane.showInputDialog("Bitte Breite eingeben:");
        breite = Double.parseDouble(eingabe);
        
        /* Berechnung*/
        flaeche = laenge * breite; 
        
        /* Ausgabe ohne Dialog */
        System.out.println("Länge: "+laenge);
        System.out.println("Breite: "+breite);
        
        /*important*/
        JOpitionPane.showMessageDialog(null, "Fläche: "+flaeche); /*Ausgabe mit Dialogfeld*/ 
        
        System.out.println("Fläche:"+flaeche); //einfache Ausgabe im Ausgabefenster
        
                
        
        
    }
    
}
