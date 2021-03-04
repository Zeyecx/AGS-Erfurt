package handelsreisender;
import javax.swing.*;

/** @author bg15dv-jskopp */
public class Handelsreisender {

    public static void main(String[] args) {
        /*Eingeben der Vars */
        double Fixum = Double.parseDouble(JOptionPane.showInputDialog("Fixum"));
        double Umsatz = Double.parseDouble(JOptionPane.showInputDialog("Umsatz"));
        double Provision = 0.0;
        double ProvSatz = 5.0;
        double Einkommen = 0.0;
        
        /* if - else */
        
        if(Umsatz < 50000 ){
            ProvSatz = 3.0;
        }else if(Umsatz < 10000){     
            ProvSatz = 3.5;
        }else if (Umsatz < 250000){
            ProvSatz = 4.0;
        };
        
        //Berechnung
        Provision = Umsatz * ProvSatz / 100;
        Einkommen = Fixum + Provision;
        
        //Ausgabe
        JOptionPane.showMessageDialog(null, "Fixum = " + Fixum + "\nProvSatz = " + ProvSatz + "\nProvision = " + Provision +"\nEinkommen = " + Einkommen);
        System.out.println("Fixum = " + Fixum + "\nProvSatz = " + ProvSatz + "\nProvision = " + Provision +"\nEinkommen = " + Einkommen );
        
        //Fertig
         
        
        
    }
    
}
