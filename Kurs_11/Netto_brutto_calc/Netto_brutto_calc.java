/* ## */
package netto_brutto_calc;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Silverhex
 */
public class Netto_brutto_calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Brutto Eingabe */
            double brutto = 0;
            String eingabe = "";
            eingabe=JOptionPane.showInputDialog("Bitte Geben sie ihr Netto einkommen an :  ");
            brutto=Double.parseDouble(eingabe);        
       
       /* Hinzufügen von Steuern */
            double soli = 0.055 ; /*5.5% des Steuerbetrages */
            double kirchen = 0.08 ; /* zwischen 8 und 9 Prozent */
            double lohn = 0.2; /* approx. 20% */
            
       /* Hinzufügen von Sozialabgaben */
            double renten = 0.187 ;
            double krank = 0.14;
            double pflege = 0.0245;
            
       /* Zwischenrechnung der jeweiligen Abgaben */
            double steuern = brutto * (soli + kirchen + lohn);
            double sozial = brutto * (renten + krank + pflege);
            
       /* Arbeitsgeberteilung */
            double SVB = 0;
            SVB = (lohn + krank + renten + pflege) / 2; /*Hälfte übernimmt der Arbeitgeber */
            
            /* Zusammenfassende Rechnung */
            double abgaben = 0;
            abgaben = SVB + soli + kirchen;
            
       /* Endrechnung */
            double netto = brutto; /* schön wärs */
            netto = netto * SVB; /* SVB sind die Abgaben */
            
       /* Ausgabe*/
            System.out.println("Bruttobetrag: " + brutto);
            System.out.println("      ");
            System.out.println("Solidaritätszuschlag in €: " + brutto * soli);
            System.out.println("+ Kirchensteuer in €: " + brutto * soli);
            System.out.println("+ Lohnsteuer in €: " + brutto * lohn);
            System.out.println("--------------------------------------");
            System.out.println("= Sozialabgaben Gesamt in €: " + steuern );
            System.out.println("======================================");
            System.out.println("  ");
            System.out.println("Rentensteuer in €: " + brutto * renten );
            System.out.println("+ Krankenversicherung in €: " + brutto * krank);
            System.out.println("+ Pflegeversicherung in €" + brutto * pflege);
            System.out.println("--------------------------------------");
            System.out.println("= Steuerabgaben Gesamt in €: " + sozial );
            System.out.println("======================================");
            System.out.println(" ");
            System.out.println("Sozialabgaben in €: " + steuern);
            System.out.println("+ Steuern in €: " + sozial);
            System.out.println("---------------------------------------");
            System.out.println("Abgaben in €: " + (sozial + steuern));
            System.out.println("=======================================0");
            System.out.println("");            
            System.out.println("Nettobetrag in €: " + netto);
            System.out.println("- Sozialabgaben in €: " + steuern );
            System.out.println("- Steuern in €: " + sozial);
            System.out.println("-----------------------------------------");
            System.out.println("Netto:" + netto);
            System.out.println("=========================================");
            System.out.println(" ");
    }
    
}
