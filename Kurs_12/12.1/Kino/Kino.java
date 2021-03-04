
package kino;
import java.util.*;



/**
 * @version 1.0
 * @author JSkopp
 * Kino 2D-Array
 */

public class Kino {

   
    public static void main(String[] args) {
        
        //importiere Scanner
        Scanner sc = new Scanner(System.in);
       
        //Variabeln 
        int z = 5;
        int s = 8;
        int[][] kino = new int[z][s];
        
        
        //Einlesen der Werte 
         for(s=0;s<7;s++){
            System.out.println("Wochentag "+(s+1)+": ");
            for(z=0;z<4;z++){
                System.out.print("\tKino "+(z+1)+": ");
                kino[z][s]=sc.nextInt();
            }
        }
         
         
         //Werte Berechnen
        
          // Berechnung Nutzer am Tag
            for(s=0;s<7;s++){
               kino[4][s]=0; 
               for(z=0;z<4;z++){
                   kino[4][s]=kino[4][s]+kino[z][s]; 
               }
          }
            
          // Berechnung Kino am Tag  
           for(z=0;z<5;z++) {
               kino[z][7]=0; 
               for(s=0;s<7;s++) {
                   kino[z][7]=kino[z][7]+kino[z][s]; 
               }
           }
           
           
        // Ausgabe
        System.out.println("Kino\t\tMo\tDi\tMi\tDo\tFr\tSa\tSo\tGesamt\n");
        for(z=0;z<5;z++){            
                if(z==4)
                    System.out.print("Gesamt: \t");
                else
                 System.out.print("Kino "+(z+1)+": \t");
            for(s=0;s<8;s++){
                System.out.print(kino[z][s]+"\t");
            }
        System.out.println();
        }
           
           
           
           
            





    }
    
}
