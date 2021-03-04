/* Java 8.1 */
package rcalc;
import javax.swing.*;
import java.util.*; 

/* @author BG15Dv2-JSkopp */
public class Rcalc {

    /* @param args the command line arguments  */
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        
        /* Dekleration der Variabeln  */
        double U = 0.0; /* Spannung */
        double R = 0.0; /* Widerstand */
        double Re = 0.0; /* Endwert */
        double Rs = 0.0; /* Startwert */
        double Rd = 0.0; /* Erhöhung der Variable */
        String eingabe = ""; /* ggf. Parsertext */
        double x = 0.0; /*  */
        double I = 0.0; /* Strom */
        double Ic = 0.0; /* 2. Stromstärke */
         
        /* Eingabe der Spannung */
       U = Double.parseDouble(JOptionPane.showInputDialog("Spannung eingeben:"));
       Rs = Double.parseDouble(JOptionPane.showInputDialog("Startwert eingeben:"));
       Re = Double.parseDouble(JOptionPane.showInputDialog("Endwert eingeben:"));
       Rd = Double.parseDouble(JOptionPane.showInputDialog("Erhöhung eingeben:"));
        
       /* Tabellenkopf */
       System.out.println("Widerstand          Spannung         Strom        Strom");
       System.out.println("(in Ohm)             (in V)          (in mA)      (in mA) ");
       System.out.println("__________________________________________________________");
       
       
        /* Schleife  mit Eingabe  */
       for(x = Rs; x <= Re; x = x + Rd)
       {
           /* durch 1e3 | I = U/R  */
           I = U / x; /* Berechnung */
           Ic = I / 1000; /* Umrechnung */
           
           /* Ausgabe */
           System.out.println("" + R + "         " + U + "      " + I +"       " + Ic);
           
           
           
           
           
       }
    
       
       
       System.gc(); 
     
    
    }
        
        
        
    
    
}
