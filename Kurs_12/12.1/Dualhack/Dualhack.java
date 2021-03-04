
package dualhack;

import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author JSkopp
 */
public class Dualhack {

     public static void Ausgabe(String text){
             JOptionPane.showMessageDialog(null, text);
             System.out.print(text+"\n");

    } 
    
    public static Integer eingabe (String text){
             return Integer.parseInt(JOptionPane.showInputDialog(text));
    }        
    
    public static int zahl = Dualhack.eingabe("Ihre Zahl");     

    public static void main(String[] args) {
        
        Dualhack.Ausgabe(Integer.toBinaryString(zahl));
    }    
}
            
