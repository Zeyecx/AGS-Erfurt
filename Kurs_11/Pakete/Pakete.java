package pakete;
import java.util.*;
import javax.swing.*;

/* @author bg15dv-jskopp */

public class Pakete {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Anzahl der Pakete  | Gewicht | Preis 
         *    1 bis 10        | bis 10kg |  10€
         *     1 bis 10       | mehr als 10 | 18€
         *   mehr als 10      | bis 10kg    | 7€
         *    mehr als 10      |  über 10kg  | 13€  */

        double anz = Double.parseDouble(JOptionPane.showInputDialog("Anzahl"));
        double kg = Double.parseDouble(JOptionPane.showInputDialog("Gewicht"));
       
        
        if(anz <= 10 && kg <= 10)
            {System.out.println("Für "+anz+" Päckchen a "+kg+"kg werden "+anz*10+"€ benötigt");
        if(anz <= 10 && kg >= 10)
            {System.out.println("Für "+anz+" Päckchen a "+kg+"kg werden "+anz*18+"€ benötigt");
        if(anz >= 10 && kg <= 10)
            {System.out.println("Für "+anz+" Päckchen a "+kg+"kg werden "+anz*7+"€ benötigt");
        if(anz >= 10 && kg >= 10)
            {System.out.println("Für "+anz+" Päckchen a "+kg+"kg werden "+anz*13+"€ benötigt");
        
        
    }
    
}
            }
            }
    }
}     
            