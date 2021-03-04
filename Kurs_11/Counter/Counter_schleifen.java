package counter_schleifen;
import javax.swing.JOptionPane;
import java.util.*;

/* @author BG15DV-jskopp  */
public class Counter_schleifen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Deklarieren der Variabeln */
            double Zahl = 0; /* anzahl der Durchläufe */
            double summe = 0; /* End Summe */
            double cont = 0; /* eingbae der Zahl */
            String eingabe = ""; /* Parser content */
         
    /* ---------------------- FOR ------------------------------*/
            /* Anzahl eingabe */  
            eingabe=JOptionPane.showInputDialog(" Anzahl der Zahlen: ");
            Zahl=Integer.parseInt(eingabe);
        
        /* Sinnfreies Zeug */
            System.out.println("Anzahl der Zahlen: "+Zahl); /* Ausgabe */
            
            
        /* Anfang Schleife: for(); */
            for(int x=1; x<=Zahl; x++) 
            {           
                eingabe=JOptionPane.showInputDialog("Zahl eingeben:");
                cont=Integer.parseInt(eingabe);
                System.out.println("Zahl "+x+" = "+cont);
                summe = summe + cont;
            }
            /* Endrechnung */
                summe = summe / Zahl;
            
             /* Ausgabe */
                System.out.println("----------------------");
                System.out.println("Quersumme: " + summe); 
        
        /* ----------------------------DO_While------------------------------------- */     
          System.out.println("Jetzt das ganze mit WHILE :D ");
          summe = 0; /* null = delete object; */
        int x = 0; /* null = delete object; */
   
            
    
            /* Anzahl eingabe */  
            eingabe=JOptionPane.showInputDialog("Anzahl der Zahlen:");
            Zahl=Double.parseDouble(eingabe);
        
        /* Sinnfreies Zeug */
            System.out.println("Anzahl der Zahlen: "+Zahl); /* Ausgabe */
            
            
        /* Anfang Schleife: while(); */
            double x = 1;
            while(x<=Zahl) 
             {           
                eingabe=JOptionPane.showInputDialog("Zahl eingeben:");
                cont=Double.parseDouble(eingabe);
                System.out.println("Zahl "+x+" = "+cont);
                summe = summe + cont;
                x++;
            }
            /* Endrechnung */
                summe = summe / Zahl;
            
             /* Ausgabe */
                System.out.println("----------------------");
                System.out.println("Quersumme: " + summe); 
                
             System.out.println("Jetzt das ganze mit WHILE :D ");
          summe = 0; /* null = delete object; */
   
            
    
            /* Anzahl eingabe */  
            eingabe=JOptionPane.showInputDialog("Anzahl der Zahlen:");
            Zahl=Integer.parseInt(eingabe);
        
        /* Sinnfreies Zeug */
            System.out.println("Anzahl der Zahlen: "+Zahl); /*Ausgabe*/
            
            
        /* Anfang Schleife: while(); */
            double x = 1;
            do 
             {           
                eingabe=JOptionPane.showInputDialog("Zahl eingeben:");
                cont=Double.parseDouble(eingabe);
                System.out.println("Zahl "+x+" = "+cont);
                summe = summe + cont;
                x++;
            }while(x<=Zahl)
        
            /* Endrechnung */
                summe = summe / Zahl;
            
             /* Ausgabe */
                System.out.println("----------------------");
                System.out.println("Quersumme: " + summe); 
        
    }
    
}
