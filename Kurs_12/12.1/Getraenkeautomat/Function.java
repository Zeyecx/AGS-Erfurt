
package getraenkeautomat;
import javax.swing.*;

/** @author JSkopp */

public class Function {

    private double[] traffic;
    
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
    
    //Kaufvorgang
    
      public void Kauf() {
          /*  Das public Void sollte eigentlich später mal erweitert werden. Aktuell ist dies aber nicht der Fall
          * und ich glaube auch nicht, das dies in der nächsten Zeit passiert. wer möchte kann sich hier einschreiben und das
          * Projekt vervollstänigen. Vll findet sich von der GitHub-Community ja wer :D
          */
            
            
        }
         
   
    
}
