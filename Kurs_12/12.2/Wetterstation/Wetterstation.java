/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wetterstation;
import java.io.IOException;
import javax.swing.*;
/**
 *
 * @author bg15dv-jvockerodt
 */
public class Wetterstation {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Wetter Temperatur= new Wetter();    

        int selected;
        
  do{     
        
        
        Object[] options = {"Eingabe", "Ausgabe", "Ändern", "Abbruch", "Ausgabe in .txt"};
        

selected = JOptionPane.showOptionDialog(null,
"Treffen Sie eine Auswahl",
"Alternativen",
JOptionPane.DEFAULT_OPTION, 
JOptionPane.INFORMATION_MESSAGE, 
null, options, options[0]);




 


        switch (selected) {
        // Eingabe
            case 0:
                Temperatur.eingabe();
                break;
        // Ausgabe
            case 1:
                Temperatur.Ausgabe();
                break;
        // Ändern
            case 2:
                Temperatur.setTemp();
                break;
        // Programm beenden
            case 3:
                System.exit(0);
                break;
        // Programm schreiben        
             case 4:
                Temperatur.schreiben();
                break;
            default:
                System.out.println("Sie haben nichts ausgewählt");
                System.out.println("Das Programm wird nun beendet");
                System.exit(0);
        }
  
        
    } while(true);
    
    
 
    
    
}
}