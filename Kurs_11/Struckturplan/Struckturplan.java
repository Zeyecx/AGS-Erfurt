
package struckturplan;
import javax.swing.*;
import java.util.*;

/* @author bg15dv-jskopp */
public class Struckturplan {

    /* @param args the command line arguments */
    
    public static void main(String[] args) {
     
        double zahl =  Double.parseDouble(JOptionPane.showInputDialog("Zahl eingeben: "));
        System.out.println("Zahl: "+zahl);
        
        if(zahl % 2 == 0)
        {
            zahl = 0.5 * 2;
        }
        else if(zahl % 2 == 1){
            zahl = zahl + 1; 
        }
        else if(zahl%2 != 1  &&  zahl%2 !=0 ){
            System.out.println("Fehler");
        }
    
       
       System.out.println("neue Zahl: "+zahl);
    
    }
    
}

