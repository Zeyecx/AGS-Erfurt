package wahl;

import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Wahl {
   
    public static void main(String[] args) {
                
        boolean[] weiter = {true, false};
        int n = 0; // ini Wert fürs weiter :) 
        double[][] party = new double[5][5];
        DecimalFormat f = new DecimalFormat("#0");
    
    
        Scanner sc = new Scanner(System.in);
        
        
        do{
            //Eingabe

            for(int partei = 0; partei < 4; partei++){
                  System.out.print("Patei: "+(partei+1)+"\n");
                for(int region = 0; region < 4; region++){
                    System.out.print("\tRegion " + (region + 1) + ":  ");
                    party[partei][region] = sc.nextDouble();
                    party[partei][4] += party[partei][region];
                    party[4][region] += party[partei][region];
                    
                }
            }
            party[4][4] = party[4][0] + party[4][1] + party[4][2] + party[4][3];
                    
            //Ausgabe
            System.out.print("\n\n\t\tRegion 1\tRegion 2\tRegion3\tRegion 4\tGesamt\tProzent\n");
            for(int partei = 0; partei < 5; partei++){
                if(partei != 4)
                    System.out.print((partei + 1) + ".Partei");
                else    
                    System.out.print("Gesamt\t");
                for(int region = 0; region < 5; region++){
                    System.out.print("\t\t" + party[partei][region]);
                }
                System.out.println("\t\t" + f.format((party[partei][4] / party[4][4]) * 100) + "%");
            }
            System.out.print("Prozent\t");
            for(int region = 0; region < 4; region++){
                System.out.print("\t" + f.format((party[4][region] / party[4][4]) * 100) + "% ");
            }
            
            
            //reset
            String[] typ = {"Ja", "Nein"}; 
                 n = JOptionPane.showOptionDialog(null, 
                     "Möchtn Sie das Programm neustarten ? ", 
                     "- Neustart- ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]); 
            // end reset
            
        }while(weiter[n]);
    }
    
}