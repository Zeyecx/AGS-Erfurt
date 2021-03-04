
package punkt;

import java.util.*;

/**
 * @author Barthyr
 */

public class Punkt {

    public static void main(String[] args) {
        
        /* x. Konst. !? */
        Punkt2D point = new Punkt2D();

        
        
        // Testen der Methode move (test sollte true ergeben)
        try{
            point.move(new Random().nextInt(10)+1, new Random().nextInt(10)+1); 
            System.out.println("Die Methode move wurde erfolgreich getestet.");
        }catch(Exception e){
            System.out.println("Die Methode hat einen Fehler");
        }
       
        
        // Testen der Methode check()
        
        try{
            System.out.println("Status: "+point.check());
            if(point.check()){
                System.out.println("Zahlen liegen im entsprechenden Bereich");
            }else{
                System.out.println("Zahlen liegen nicht im entsprechenden Bereich");
            }
        }catch(Exception e){
            System.out.println("Die Methode hat einen Fehler endeckt");
        }
    
        // Testen der Ausgabe Methode
         try{
           point.print();
           System.out.println("Die Methdode print hat keinen Fehler");
        }catch(Exception e){
            System.out.println("Die Methode hat einen Fehler");
        }
         
         System.out.print("\n\n\n\n"); // sonst sieht das so dumm aus.
         
 /* Testen in einem g. Konstruktor */
        
         Punkt2D p = new Punkt2D(new Random().nextInt(), new Random().nextInt());
            
        
        // Testen der Methode move (test sollte true ergeben)
        try{
            p.move(new Random().nextInt(), new Random().nextInt()); 
            System.out.println("Die Methode move wurde erfolgreich getestet.");
        }catch(Exception e){
            System.out.println("Die Methode hat einen Fehler");
        }
       
        
        // Testen der Methode check()
        
        try{
            System.out.println("Status: "+p.check());
            if(p.check()){
                System.out.println("Zahlen liegen im entsprechenden Bereich");
            }else{
                System.out.println("Zahlen liegen nicht im entsprechenden Bereich");
            }
        }catch(Exception e){
            System.out.println("Die Methode hat einen Fehler endeckt");
        }
    
        // Testen der Ausgabe Methode
         try{
           p.print();
           System.out.println("Die Methdode print hat keinen Fehler");
        }catch(Exception e){
            System.out.println("Die Methode hat einen Fehler");
        }
         
         
         
    }  

}

