
package forschleife;
import java.util.*;
import javax.swing.*;


/* @author BG15DV2-JSkopp */
public class Forschleife {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
       /* ~~~~~~~~~~~~~~~~~~ F O R ~~~~~~~~~~~~~~~~~~~~~~~~~~~ */ 
        
            /* Declaration der Variabeln */
                double zahl = 0.0; /* Anzahl der Durchläufe */
                double summe = 0.0; /* Ende der Summe */ 
                double cont = 0.0; /* Eingabe der Zahl */
                String eingabe = ""; /* Parser content */

            /* Anzahl eingabe */
                eingabe = JOptionPane.showInputDialog("Anzahl der Zahlen: ");
                zahl = Double.parseDouble(eingabe);

            /* erste Ausgabe */
                System.out.println("~~~~~~~~ F O R ~~~~~~~~" );
                System.out.println("Typ: for ");
                System.out.println("Anzahl der Zahlen: " + zahl); 

            /* Start der FOR-Schleife */
                for( double x = 1; x <= zahl; x = x+1.0 )
                    {
                        /* Schleifenanfang */
                            eingabe=JOptionPane.showInputDialog("Zahl eingeben:");
                            cont=Integer.parseInt(eingabe);
                            System.out.println("Zahl " + x + " = " + cont);
                            summe = summe + cont;
                        /* Schleifenende*/    
                    } 
                /* Endrechnung */
                    summe = summe / zahl;

                /* Ausgabe */
                    System.out.println("--------------------");
                    System.out.println("Quersumme: " + summe);

        /*  ~~~~~~~~~~~~~~~~~~~~~~~ ZWISCHEN INSTANZ ~~~~~~~~~~~~~~~~~ */    
           /* RE der Variabeln um eine neue Belegung zu erlauben :D */
                zahl = 0.0;
                summe = 0.0;
                cont = 0.0;
                eingabe = "";
                System.gc();
                          
                    
         /* ~~~~~~~~~~~~~~~~~~ WHILE ~~~~~~~~~~~~~~~~~~~~~~~~~~~ */ 
        
             
        /* Anzahl eingabe */
            eingabe = JOptionPane.showInputDialog("Anzahl der Zahlen: ");
            zahl = Double.parseDouble(eingabe);
        
        /* erste Ausgabe */
            System.out.println(" ");
            System.out.println(" ~~~~~~~~ W H I L E ~~~~~~~~ " );
            System.out.println("Typ: while ");
            System.out.println("Anzahl der Zahlen: " + zahl); 
            
        /* Start der WHILE-Schleife */
            int xar = 1; /* NetBeans will einen neuen Counter */
            while(xar <= zahl)
                {
                    /* Schleifenanfang */
                        eingabe=JOptionPane.showInputDialog("Zahl eingeben:");
                        cont=Integer.parseInt(eingabe);
                        System.out.println("Zahl " + xar + " = " + cont);
                        summe = summe + cont;
                    
                    /* Bediung ändern */
                        xar = xar + 1;
                        
                    /* Schleifenende*/    
                } 
            /* Endrechnung */
                summe = summe / zahl;
            
            /* Ausgabe */
                System.out.println("--------------------");
                System.out.println("Quersumme: " + summe);
                
        /*  ~~~~~~~~~~~~~~~~~~~~~~~ ZWISCHEN INSTANZ ~~~~~~~~~~~~~~~~~ */    
           /* RE der Variabeln um eine neue Belegung zu erlauben :D */
                zahl = 0.0;
                summe = 0.0;
                cont = 0.0;
                eingabe = "";
                xar = 0;
                System.gc();
                          
                    
         /* ~~~~~~~~~~~~~~~~~~ DO_WHILE ~~~~~~~~~~~~~~~~~~~~~~~~~~~ */ 
        
             
        /* Anzahl eingabe */
            eingabe = JOptionPane.showInputDialog("Anzahl der Zahlen: ");
            zahl = Double.parseDouble(eingabe);
        
        /* erste Ausgabe */
            System.out.println(" ");
            System.out.println("~~~~~~~~ D O _ W H I L E ~~~~~~~~" );
            System.out.println("Typ: do.while ");
            System.out.println("Anzahl der Zahlen: " + zahl); 
            
        /* Start der WHILE-Schleife */
            int xc = 1; /* NetBeans will einen neuen Counter */
            do{
                    /* Schleifenanfang */
                        eingabe=JOptionPane.showInputDialog("Zahl eingeben:");
                        cont=Integer.parseInt(eingabe);
                        System.out.println("Zahl " + xc + " = " + cont);
                        summe = summe + cont;
                    
                    /* Bediung ändern */
                        xc = xc + 1;
                        
                    /* Schleifenende*/    
               }while(xc <= zahl); 
            
            /* Endrechnung */
                summe = summe / zahl;
            
            /* Ausgabe */
                System.out.println("--------------------");
                System.out.println("Quersumme: " + summe);
                         
        
    }
    
}
