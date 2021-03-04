package modulo;
import java.math.*;
import javax.swing.*;
import java.util.*;

/* @author BG15DV2-JSKOPP */

public class Modulo {

    /* @param args the command line arguments */
    
        public static void main(String[] args) {
      
        /* Deklaration der Variabeln */
        double zahl = 0.0; /* einzugebene Zahl */
        String eingabe = ""; /* ggf. Parser */
        double Modulo = 0.0; /* Modulo */
        boolean WERT = false; /* Nur "true" oder "false" */

     
        /* Eingabe und Ausgabe */
        /* ich fange die 0 ab da es sonst zu dumm wird */
        do{zahl = Double.parseDouble(JOptionPane.showInputDialog("Bitte Zahl eingeben:"));}while(zahl == 0.0);
        System.out.println("Eingabe: " + zahl);
        
        /* Schauen ob größer oder kleiner als null ;) */
        /* ich gehe davon aus, das 0 positv ist */
        if(zahl < 0.0){ WERT = false;};
        if(zahl > 0.0){ WERT = true;};
        if(zahl == 0.0){ WERT = true;};
        
      
        
        /* Ausgabe Level 1 */
        if(WERT){
            System.out.println(zahl + "> 0");
        }else{
            System.out.println(zahl + "< 0");
        }        
        
        /* Modulo berechnen */
        Modulo = Math.round(zahl % 2); /* Ausgabe 0 oder 1*/
        if( Modulo == 1){ WERT = false;}; /* Wenn sie ungerade ist, ist eine falsche Aussage.  */
        if( Modulo == 0){ WERT = true;}; /* Wenn sie ungerade ist, ist eine richtige Aussage.  */
                
        /* Ausgabe Level 2 */
        if(WERT){
            System.out.println("Die Zahl " + zahl + " ist gerade");
        }else{
            System.out.println("Die Zahl " + zahl + " ist ungerade");
        } 
               
        
    }
    
}
