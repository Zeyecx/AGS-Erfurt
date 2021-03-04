
package zuwachsrate;
import javax.swing.*;

/** @author bg15dv-jskopp */

public class Zuwachsrate {

    
    public static void main(String[] args) {
       
        /* Eingabe der Vars */
        double S = Double.parseDouble(JOptionPane.showInputDialog("Stückzahl")); 
        double Z = Double.parseDouble(JOptionPane.showInputDialog("Zuwachsrate"));
        double Ende = 2 * S;
        double Jahre = 0.0;
        
        while(S <= Ende ){
          Jahre = Jahre + 1; //die Variante mit Jahre++ hängt in der 7ner Version und läuft erst verlässlich ab JDK 8 :D 
          S = S + S * Z / 100; 
        }
        
        System.out.println("Jahre = " + Jahre);
        JOptionPane.showMessageDialog(null, "Jahre = " + Jahre);
        
        
       
       // Fertig  
        
        
    }
    
}
