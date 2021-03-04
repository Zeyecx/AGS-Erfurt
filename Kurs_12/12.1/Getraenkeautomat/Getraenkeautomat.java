
package getraenkeautomat;
import java.util.*;
import javax.swing.JOptionPane;


/**  @author JSkopp */

public class Getraenkeautomat {

    
    
    public static void main(String[] args) {
   
      Function function = new Function();
      
        // Scanner sc = new Scanner(System.in); wird nicht mehr gebraucht 
     
       /* Dekleration der Variabeln */
       
            double wasser = 0.00, softdrink = 0.00, energydrink = 0.0, bier = 0.00;
            double getraenk = 0.0, anz= 0.0, kunde = 0.0, preis = 0.0, anzkunde = 0.0;
            double neu = 0.0, ges=0.0;
        
        while(neu == 0.0){

                preis = function.eingabe("Welches Getränk (1-4): ");
                anz = function.eingabe("Wie viele nehmen Sie?: ");

            if (getraenk == 1){
                preis = 1.50;
                wasser=wasser + anz;
            }else if(getraenk == 2){
                preis = 2.0;
                softdrink = softdrink+ anz;
            }else if (getraenk == 3){
                preis = 2.20;
                energydrink = energydrink + anz;
            }else if (getraenk == 4){
                preis = 2.50;
                bier = bier + anz;
            }else {
                function.Ausgabe("Fehler!");

            }

            anzkunde++;

            function.Ausgabe("Glückwunsch, Sie sind der "+ anzkunde+"te Kunde");


            kunde = kunde + anz * preis;
            function.Ausgabe("Kosten: "+ kunde+"€");
            function.Ausgabe("Anzahl des Wassers"+ wasser);
            function.Ausgabe("Anzahl des Softdrink"+ softdrink);
            function.Ausgabe("Anzahl des Energydrinkes"+ energydrink);
            function.Ausgabe("Anzahl des Biers"+ bier);

            ges = ges + preis;






                Double zahl = function.eingabe("Wollen sie das Programm neustarten (0 -> ja | 1 -> nein):  ");
                  if (zahl == 0.0){
                        neu = 0.0; 
                    } else {
                        neu = 1.0;
                    }


    }
        function.Ausgabe("Ihre Gesamtsumme beträgt"+ ges+"€");
        }
}
