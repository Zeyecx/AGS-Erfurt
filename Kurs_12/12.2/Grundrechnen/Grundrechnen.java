
package grundrechnen;

import javax.swing.*;
import java.util.*;

/**
* @author Barthyr
 */

public class Grundrechnen {


    
    public static void main(String[] args) {
        var v = new var();
        calc c = new calc();
        Scanner sc = new Scanner(System.in);
       
        do{
        Object[] options = {"Wert1 festlegen", "Wert2 festlegen", "Addieren", "Multiplizieren", "Dividieren", "Subtrahieren", "Programm beenden"}; 
        int selected = JOptionPane.showOptionDialog(null, 
                 "Menue", 
                 "Bitte wählen Sie ?!", 
                  
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.INFORMATION_MESSAGE, 
                 null, options, options[0]); 
 
        if(selected==0){
           System.out.print("Bitte legen Sie den ersten Wert fest: ");
            v.set_value1(sc.nextDouble());
            System.out.println("\nWert 1 = x = "+v.get_value1());
        }else if (selected == 1){
            System.out.print("Bitte legen Sie den zweiten Wert fest: ");
            v.set_value2(sc.nextDouble());
            System.out.println("Wert 2 = y = "+v.get_value2());
        }else if(selected == 2){
            c.addition(v.get_value1(), v.get_value2());
        }else if (selected == 3){
            c.multiplikation(v.get_value1(), v.get_value2());
        }else if(selected == 4){
            c.division(v.get_value1(), v.get_value2());
        }else if(selected == 5){
            c.subtraktion(v.get_result(), v.get_value2());
        }else if(selected == 6){
            System.out.print("Sie beenden das Programm");
            System.exit(0);
        }
        }while(true);
    }
}
