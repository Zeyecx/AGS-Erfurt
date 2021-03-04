
package warenverkauf;

import javax.swing.JOptionPane;
import java.util.*;

/** @author Barthyr */

public class chooise {
        public boolean Ware() {
            Object[] ware = {"Ja", "Nein"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Ware vorhanden ? ", 
                     "- Ware - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, ware, ware[0]); 
            if(selected1 == 0){
                return true;
            }else{
                return false;
            }
        
        }
        
        public boolean Rechnung() {
            Object[] Rechnung = {"Ja", "Nein"}; 
            int selected2 = JOptionPane.showOptionDialog(null, 
                     "Bezahlt der Kunde seine Rechnungen ? ", 
                     "- Rechnungszahler - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, Rechnung, Rechnung[0]); 
             if(selected2 == 0){
                    return true;
                }else{
                    return false;
                }
        }
        
        public boolean Barzahlung() {
            Object[] Rechnung = {"Ja", "Nein"}; 
            int selected3 = JOptionPane.showOptionDialog(null, 
                     "Zahlt der Kunde bar ? ", 
                     "- Barzahler - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, Rechnung, Rechnung[0]); 
             if(selected3 == 0){
                    return true;
                }else{
                    return false;
                }
        }
        
        // Das ist ab hier nur für den Neustart des Programms :D 
        
         public boolean NeuStart() {
            Object[] Kunde = {"Ja", "Nein"}; 
            int selected3 = JOptionPane.showOptionDialog(null, 
                     "weitere Kunden ? ", 
                     "- Kunden - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, Kunde, Kunde[0]); 
             if(selected3 == 0){
                    return true;
                }else{
                    return false;
                }
        }
         
         // Das ist ab hier für die Ausgabe
         public String Ausgabe(int kunde) {
            switch (kunde) {
                case 0:
                    return "Waren verkaufen";
                case 1:
                    return "Kaufvertrag abweisen";
                case 2:
                    return "Ware bestellen";     
                default:
                    return "ERROR";
                    
            }
       }
}
