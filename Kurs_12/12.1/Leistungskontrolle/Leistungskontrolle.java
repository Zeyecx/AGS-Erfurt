package leistungskontrolle;
import javax.swing.*;

    


/** @author bg15dv-jskopp */

public class Leistungskontrolle {
 
    // TODO:instantiate an non-static object in Main...:
    private static RabattQIf mRabattQIf =  new RabattQ();
    
    
    // TODO:instantiate an non-static object in Main...:
    public static double getRabattOfCustomerId(int id) {
       // call of method of another class:
       return mRabattQIf.getRabattOfCustomerId(id);
    }
    
    public static double getBooleanOfNeu(int id) {
       // call of method of another class:
           return mRabattQIf.<error>;
    }
    
    
   
    
  
    
    public static void main(String[] args) {
       function Function = new function();  
        
        double Rabatt = 0.0;
        double Jahre = 0.0;
        double cRn = 0.0;
        double MwSt = 0.0;
     boolean neu = true;
    
     
    while(neu){ 
        String[] typ = {"Großhändler", "Einzelhändler", "Sonstige Kunden","Premiumkunde"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Was sind sie für ein Kunde", 
                     "- Kunde - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]);
 
            // delegation:
            double rabatt =  getRabattOfCustomerId(selected1);
            
            
            Double Netto = Function.eingabe("Nettoverkaufspreis: ");
            
            Object[] typ1 = {"länger als 4 Jahre", "kürzer als 4 Jahre"}; 
            int selected2 = JOptionPane.showOptionDialog(null, 
                     "Was sind sie für ein Kunde", 
                     "- Kunde - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ1, typ1[0]); 
            if(selected2 == 0){
                Jahre = Function.eingabe("Anzahl der Jahre");
            }else{
                Jahre = 1.0;
            }
            
            if(Jahre >= 5.0){
                cRn = Jahre * 0.005;
                if(cRn >= 0.05){cRn = 0.05;} //ist keine saubere Lösung
            }else{cRn = 0.0;}
            Rabatt = Rabatt + cRn;
            
             Object[] typ2 = {"Warensortiment 1", "Warensortiment 2"}; 
            int selected3 = JOptionPane.showOptionDialog(null, 
                     "Was für ein Warensortiment", 
                     "- Warensortiment - ",
                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ2, typ2[0]); 
            if(selected3 == 0){
                MwSt = 0.07;
            }else{
                MwSt = 0.19;
            }
           
            
            //Ausgabe
             Rabatt = Netto * Rabatt;
            Function.Ausgabe("Rabatt: "+ Rabatt +"€");
            Netto =  Netto - Rabatt;
          //  Function.Ausgabe("Netto: "+ Netto);
            MwSt = Netto * MwSt;
            Function.Ausgabe("Mehrwertsteuer: "+ MwSt +"€");
            double Brutto = Netto + MwSt;
            Function.Ausgabe("Brutto: " + Brutto + "€");
            
            
            Object[] typ4 = {"JA", "Nein"}; 
            int selected4 = JOptionPane.showOptionDialog(null, 
                     "Neustart?!", 
                     "- Reset - ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]); 
            //delegation:
            neu = RabattQ.getBooelanReset
             
            
            /*
            if(selected4 == 0){
                neu = true;
            }else{
                neu = false;
            }
            */
            
     };
                       
    }

    
        
    
    
}