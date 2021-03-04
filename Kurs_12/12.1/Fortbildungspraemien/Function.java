
package fortbildungsprämien;
import javax.swing.*;

/** @author JSkopp */

public class Function {
    
         // Das ist ab hier nur für den Neustart des Programms :D 
        
         public boolean NeuStart() {
            Object[] Kunde = {"Ja", "Nein"}; 
            int selected3 = JOptionPane.showOptionDialog(null, 
                     "Möchten Sie das Programm neu Starten ? ", 
                     "- Neustart - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, Kunde, Kunde[0]); 
             if(selected3 == 0){
                    return true;
                }else{
                    return false;
                }
        }
         
          public Double eingabe(String text){
        return Double.parseDouble(JOptionPane.showInputDialog(text));
    }
    
    public String einstr(String text){
        return JOptionPane.showInputDialog(text);
    }
    
    public void Ausgabe(String ausgabe){
       System.out.println(ausgabe);
       JOptionPane.showMessageDialog(null, ausgabe);
    }       
    
    public java.lang.String String (Double value){ //kleine Attribut der Syntax
        return Double.toString(value);
    }
    
}
