
package warenverkauf;
import javax.swing.*;

/** @author Barthyr */

public class Warenverkauf {


    public static void main(String[] args) {
  
     chooise Kunde = new chooise(); //Objekt sollte ich mal anlegen :D #kappa 
     
     /* Abwicklung des Einkaufes */
     
     boolean restart = true;
     int user = 0;
     
     while(restart = true){
        // hier beginnt der eig. Code Block :D   
        
        if(Kunde.Ware()){
            
             if(Kunde.Rechnung()){
               user = 0;                
            }else{
                
                if(Kunde.Barzahlung()){
                    user = 0;
                }else{
                    user = 1;
                }
             } 
        }else{
            if(Kunde.Rechnung()){
               user = 2;                
            }else{
                
                if(Kunde.Barzahlung()){
                    user = 2;
                }else{
                    user = 1;
                }
             } 
        }
     }
     
     // Ausgabe und anderer Käse :D 
     System.out.println(Kunde.Ausgabe(user));
     JOptionPane.showMessageDialog(null, Kunde.Ausgabe(user));
     Kunde.NeuStart();
     
     //Fertig
    }
    
}
  