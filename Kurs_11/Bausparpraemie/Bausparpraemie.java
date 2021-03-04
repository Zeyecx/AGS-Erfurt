package bausparpraemie;
import java.util.*;
import javax.swing.*;

/* @author BG15DV-JSKOPP
 */
public class Bausparpraemie {

    /* @param args the command line arguments  */
    
    public static void main(String[] args) {
       
        neustart:;     
                
        double sparleistung = 0.0; 
        double max = 0.0; 
        double p_child = 0.02; /* immer +2% pro Kind <=> 0.02; */
        double anz_child = 0.0;
        double praemie = 0.14;
        double money = 0.0; /* :D */
        double solo = 0.0;
        String ehe = "erledigt"; /* ist nur dafür die ausgabe */
        
        
        /* b)Familienstandt       selected[0]=>ledig; selected[1]=>erledigt */
        
        Object[] options = {"ledig", "erledigt"}; 
        int selected = JOptionPane.showOptionDialog(null, 
                 "Familienstandt", 
                 "Bitte wählen Sie ?!", 
                  
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.INFORMATION_MESSAGE, 
                 null, options, options[0]); 
        
        /* Nach Familienstandt Höchstsatz festlegen  */
        if(selected == 0){ /*ledig*/
            max = 800;
        } else { /* verheiratet */
            max = 1600;
        }
 
        /* Anzahl der Kinder */
        anz_child = Double.parseDouble(JOptionPane.showInputDialog("Anzahl der KInder: ")); 
        
        /* hochrechnen der Kinder auf die 2% */
        p_child = p_child * anz_child;
        
        /* Berechne die Maxgrenze */
        max = max + (max * p_child); 
        
        /* Eingabe der Sparleistung */
        sparleistung = Double.parseDouble(JOptionPane.showInputDialog("Sparleistung"));
        
        /* Berechnung der Prämie */
        praemie = praemie + p_child;
        
        /* liegt sparleistung über max ?! */
        if(sparleistung >= max){
           money = max; 
        }else if(sparleistung == max){
            money = max;
        }else if(sparleistung <= max){
            money = sparleistung;
        }
        
         /* Berechnung der Prämie in € Einzeln*/
        solo = money * praemie;
                
        /* Berechnung der Prämie in € Gesamt */
        money = money + (money * praemie);
        
        /* nutzerausgbe ehe ?!*/
         if(selected == 0){ /*ledig*/
            ehe = "ledig";
        } else { /* verheiratet */
            ehe = "verheiratet";
        }
        
        /* Ausgabe */
        JOptionPane.showMessageDialog(null, "Bausparprämie"); 
        JOptionPane.showMessageDialog(null, "Ehestatus: "+ehe);
        JOptionPane.showMessageDialog(null, "Sparleistung: "+sparleistung+"€");
        JOptionPane.showMessageDialog(null, "Prämie %: "+Math.round(praemie*100)+"%");
        JOptionPane.showMessageDialog(null, "Kinder: "+anz_child);
        JOptionPane.showMessageDialog(null, "Kinderzuschlag: "+p_child);
        JOptionPane.showMessageDialog(null, "Prämie in €: "+Math.round(solo)+"€");
        JOptionPane.showMessageDialog(null, "Prämie in € gesamt: "+Math.round(money)+"€");
        
        
         Object[] mgl = {"Neustart", "Abbruch"}; 
        int neu = JOptionPane.showOptionDialog(null, 
                 "Möchten sie das Programm neu starten", 
                 "Bausparprämie", 
                  
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.INFORMATION_MESSAGE, 
                 null, mgl, mgl[0]); 
        
        if(neu == 1){
            neustart;
        }else if(neu == 2){
            System.exit(0);
        };
        
    }
     
        
      
        
        
        


    
    
}