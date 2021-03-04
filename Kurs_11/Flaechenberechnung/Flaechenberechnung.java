/*
BG15DV2     ~    JSKOPP
url: www.skopp-jonathan.de
Quelle: cmd
 */
package flaechenberechnung;
import java.util.Scanner;



/**
 *
 * @author BG15DV2-JSkopp
 */
public class Flaechenberechnung {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        /* Dekleration der Variabeln */
        int flaeche = 0;
        int laenge = 0;
        int breite = 0;
        
       String i = null; 
       Scanner input = new Scanner(System.in); /* Scanner = Nutzereingabe*/
       
       System.out.println("Geben Sie die Laenge ein (im Meter):");
       laenge = input.nextInt(); /* laenge soll eine zahl sein */
       
       System.out.println("Geben Sie die Breite ein (im Meter):");
       breite = input.nextInt(); /* Breite soll eine zahl sein */
      
       flaeche = laenge * breite; /* * Multiplikation: siehe TW */
       System.out.println(flaeche +"m²");
       
  
      

            
        
    }
        
}
