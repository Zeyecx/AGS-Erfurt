package umsatzzahlen;



import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Umsatzzahlen {

   

    public static void main(String[] args) {

        

        int n = 0; // ini Wert fürs weiter :) 

        double[][] party = new double[5][5];

        DecimalFormat f = new DecimalFormat("#0");
        
        boolean[] typ = {true, false};
        
        int selected = 0;
    

    

        Scanner sc = new Scanner(System.in);

        

        

        do{

            //Eingabe



            for(int partei = 0; partei < 4; partei++){

                  System.out.print("Vertreter: "+(partei+1)+"\n");

                for(int region = 0; region < 4; region++){

                    System.out.print("\tQuartal " + (region + 1) + ":  ");

                    party[partei][region] = sc.nextDouble();

                    party[partei][4] += party[partei][region];

                    party[4][region] += party[partei][region];

                    

                }

            }
            
            // Einer gewissen Person gefäält diese darstellung nicht. also weg damit
            // party[4][4] = party[4][0] + party[4][1] + party[4][2] + party[4][3];
            
            for(int a = 0; a<4; a++){
                party[4][4] = party[4][a] + party [4][4];
            }

            

                    

            //Ausgabe

            System.out.print("\n\n\t\tQuartal 1\tQuartal 2\tQuartal3\tQuartal 4\tGesamt\tProzent\n");

            for(int partei = 0; partei < 5; partei++){

                if(partei != 4)

                    System.out.print((partei + 1) + ".Vertreter");

                else    

                    System.out.print("Gesamt\t");

                for(int region = 0; region < 5; region++){

                    System.out.print("\t\t" + party[partei][region]);

                }

                System.out.println("\t\t" + f.format((party[partei][4] / party[4][4]) * 100) + "%");

            }

            System.out.print("Prozent\t");

            for(int region = 0; region < 4; region++){

                System.out.print("\t\t" + f.format((party[4][region] / party[4][4]) * 100) + "% ");

            }

            

            

            //reset

             Object[] options = {"Ja", "Nein"}; 

              selected = JOptionPane.showOptionDialog(null, 

                 "Neustart", 

                 "Möchten Sie das Progamm Neustarten?", 

                  

                 JOptionPane.DEFAULT_OPTION, 

                 JOptionPane.INFORMATION_MESSAGE, 

                 null, options, options[0]); 

                 

            // end reset

            

        }while(typ[selected]);

    }

    

}