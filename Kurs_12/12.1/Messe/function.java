
package messe;
import javax.swing.*;
/**
 * @author SOtto, FSchuster, JSkopp
 * @version 1.0
 * @param args
 */

public class function {
    
    

    
        public static void Ausgabe(String text){
         JOptionPane.showMessageDialog(null, text);
             System.out.print(text+"\n");

    } 
    
        public static Integer eingabe (String text){
                    return Integer.parseInt(JOptionPane.showInputDialog(text));
    }
    
    
    
    /* RE-Start Block */
    
    public static boolean n(){
               String[] typ = {"Ja", "Nein"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Möchten Sie das Programm neustarten ? ", 
                     "- Neustart- ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]);
         return var.neu[selected1];
        
        
    } 
    
    /* Menü */
     public static int menue(){
               String[] typ = {"Eingabe der Besucherzahlen", "Gesamtausgabe", "Summenausgabe","max Besucher","Tage ohne Besucher","Ende"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Was möchten Sie machen?", 
                     "- Menü - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]);
         return selected1;
        
        
    } 
      
    
    
 
}

