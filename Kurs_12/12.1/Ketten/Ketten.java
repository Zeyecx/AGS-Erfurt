
package ketten;
import java.util.*;

/**
 * @version 1
 * @author JSkopp
 */
public class Ketten {


    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         
         System.out.println("Bitte geben Sie die Länge ein: ");
         
         int a = sc.nextInt(); // gibt die Länge an
         boolean vgl = true; // Vergleichswert
         
         // erstellt die Zeichenketten
         String[] kette1 = new String[a];
         String[] kette2 = new String[a];
         
         // Zeicheneingabe
         
         //Zeichenkette 1
         for(int x=0; a<kette1.length; a++){
            System.out.println("Bitte geben Sie Feld "+x+" ein: ");
            kette1[x] = sc.next();     
         }
         
         //Zeichenkette 2
         for(int x=0; a<kette1.length; a++){
            System.out.println("Bitte geben Sie Feld "+x+" ein: ");
            kette1[x] = sc.next();     
         }
         
         // Vergleich der Ketten
          for(int x3=0; x3<kette1.length;x3++){
              if(kette1[x3] == null ? kette2[x3] != null : !kette1[x3].equals(kette2[x3])){
                vgl = false;  
                }
          }
         
         
    }
    
}
