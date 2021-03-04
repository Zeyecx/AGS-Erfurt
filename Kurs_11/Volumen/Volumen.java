
package volumen;
import java.util.Scanner;

/* @author BG15DV-JSkopp */

public class Volumen {

    /* @param args the command line arguments */
    public static void main(String[] args) {
        
        /* Deklaration der Variabeln */
        int vol = 0;
        int laenge = 0;
        int breite = 0;
        int hoehe = 0;
        
       String i = null; 
       Scanner input = new Scanner(System.in); /* Scanner = Nutzereingabe*/
       
       System.out.println("Geben Sie die Laenge ein (im Meter):");
       laenge = input.nextInt(); /* laenge soll eine zahl sein */
       
       System.out.println("Geben Sie die Breite ein (im Meter):");
       breite = input.nextInt(); /* Breite soll eine zahl sein */
      
       System.out.println("Geben Sie die Höhe ein (im Meter):");
       hoehe = input.nextInt(); /* Höhe soll eine zahl sein */
       
       vol = laenge * breite * hoehe; /* * Multiplikation: siehe TW */
       System.out.println(vol+"m²"); //edit: quadrat ergänzt 
        
        
    }
    
}
