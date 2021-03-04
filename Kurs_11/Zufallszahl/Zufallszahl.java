package zufallszahl;
import javax.swing.*;
import java.util.*; /* java.util.Random */

/* @author BG15DV-JSkopp */

public class Zufallszahl {

    public static void main(String[] args) {
       /* Variablen deklarieren und initalieren */
        int zahl  = 0;
        int randzahl = 0;
        int trys = 0; /* try ist eine Funktion */
        boolean guess = false;
        
        /* Zufallszahl erzeugen */
        Random rand = new Random();
        randzahl = (int) rand.nextInt(100)+1;
        
        /* Zufallszahl auf Komandoebene ausgeben */
        System.out.println(randzahl);
        
        while(!guess)
        {
            
            zahl = Integer.parseInt(JOptionPane.showInputDialog(++trys + ".Rateversuche"));
            
            if (zahl == randzahl)
                {
                    guess = true;
                }
            else if (randzahl > zahl)
                {
                    JOptionPane.showMessageDialog(null,"Die Zufallszahl ist größer");
                }
            else
                {
                    JOptionPane.showMessageDialog(null,"Die Zufallszahl ist kleiner");
                }   
            
        }
                    
        
        JOptionPane.showMessageDialog(null, "Sie haben " + trys + "Versuche benötigt um die Zufallszahl " + randzahl + "zu eraten.");
        
        
    }
    
}
