
package getraenkeautomat;
import java.util.*;
import javax.swing.JOptionPane;


/**  @author JSkopp */

public class Getraenkeautomat {

    
    
    public static void main(String[] args) {
   
      Function function = new Function();
      
      List<Double> Kosten = new ArrayList<>();  
      List<String> Namen = new ArrayList<>();
      List<Double> Anzahl = new ArrayList<>();  
      List<Double> traffic = new ArrayList<>();  
      Double Gesamt = 0.0;
      Double Kunde = 0.0;
      boolean neuKauf = true; 
      boolean neuStart = true;
      
      /* In die Listen einschreiben :D */
     Kosten.add(1.50);
     Kosten.add(2.00);
     Kosten.add(2.20);
     Kosten.add(2.50);
     Namen.add("Wasser");
     Namen.add("Softdrink");
     Namen.add("Energydrink");
     Namen.add("Bier");
     Anzahl.add(0.0);
     Anzahl.add(0.0);
     Anzahl.add(0.0);
     Anzahl.add(0.0);
     traffic = Anzahl;
     
     
     
     /* Start kauf */
     while(neuKauf){
         Object[] Kunden = {"Wasser", "Softdrink", "Energydrink", "Bier", "nichts weiter"}; 
            int selected3 = JOptionPane.showOptionDialog(null, 
                     "Was möchten Sie kaufen ", 
                     "- Getränkeautomat - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, Kunden, Kunden[0]);
            
                     
     }
     
     
        
    }
}
