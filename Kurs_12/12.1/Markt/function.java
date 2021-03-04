
package markt;
import javax.swing.*;

/**
 * @versio
 * @version  1.0
 * @author JSkopp
 * @package Markt.global
 */

public class function {
    
        public static void Ausgabe(String text){
            function.log("User selection in function.n(): "); 
            JOptionPane.showMessageDialog(null, text);
             System.out.print(text+"\n");

    } 
    
        public static Integer eingabe (String text){
                    return Integer.parseInt(JOptionPane.showInputDialog(text));
    }
    
    public static boolean test (){
        return var.client[1] <= var.Ware[var.client[0]];
    }
    
    /* RE-Start Block */
    
    public static boolean n(){
        function.log("User selection in function.n() --> Start user Request ");
         String[] typ = {"Ja", "Nein"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Möchtn Sie das Programm neustarten ? ", 
                     "- Neustart- ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]);
            
        function.log("User selection in function.n() Y/n ?");
         return var.neu[selected1];
        
        
    } 
    public static int user(){
         String[] typ = {"Wareneingabe", "Warenlager ändern", "Bestellung aufgeben","Programm beenden"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Wasmöchten Sie tun ?", 
                     "- User Interface - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]);
         function.log("User selection in function.user(): "+typ[selected1]+"("+selected1+")");
        return selected1;
        
    }
     // Zuküntige Funktionen
     // Derweil noch in Bearbeitung
  
    public static void log(String text){
        System.out.println(Integer.toString(var.loggerkey)+". "+text+"\n");
        var.loggerkey++;
    }
}