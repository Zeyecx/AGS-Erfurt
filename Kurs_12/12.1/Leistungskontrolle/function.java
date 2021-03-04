
package leistungskontrolle;

import javax.swing.JOptionPane;

/**
 * @version 1.0
 * @author bg15dv-jskopp
 */
public class function {
    public Double eingabe(String text){
        return Double.parseDouble(JOptionPane.showInputDialog(text));
    }
    
    public String einstr(){
        return JOptionPane.showInputDialog("Stückzahl");
    }
    
    public void Ausgabe(String ausgabe){
       System.out.println(ausgabe);
       JOptionPane.showMessageDialog(null, ausgabe);
    } 

    public boolean Typ() {
            Object[] typ = {"Großhändler", "Einzelhändler", "Sonstige Kunden"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Was sind sie für ein Kunde", 
                     "- Kunde - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]); 
            if(selected1 == 0){
                return true;
            }else{
                return false;
            }
        
        }
      public boolean neustart() {
            Object[] typ = {"Neustart", "Ende"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Neustart?!", 
                     "- Reset - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]); 
            if(selected1 == 0){
                return true;
            }else{
                return false;
            }
        
        }


    
    
     
}