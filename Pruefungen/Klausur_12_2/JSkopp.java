
package jskopp;
import java.util.*;

/**
 * @author Jonathan Skopp (BG15DVI)
 * @since 17.05.2017
 */

public class JSkopp {

    
    public static void main(String[] args) {
     
        // Objekte
        Scanner sc = new Scanner(System.in);
        Arbeit c = new Arbeit();        
        
        // Menü mit Schleife
        try{
            
            
        
        do{
            System.out.println("\nMenü\n1: Werte eingeben 2: Werte nach berechnung ausgeben 3: Programm beenden");
            System.out.print("Ihre Eingabe: ");
            int womega = (int) sc.nextInt();
            switch (womega) {
                case 1:
                    System.out.print("Bitte geben Sie die Spannung ein (double): ");
                    c.set_spannung(sc.nextDouble());
                    System.out.print("\nBitte geben Sie den Strom ein (double): ");
                    c.set_strom(sc.nextDouble());
                    System.out.print("\nBitte geben Sie die Zeit ein (int): ");
                    c.set_zeit(sc.nextInt());
                    System.out.print("\n");
                    break;
                case 2:
                    System.out.println("Spannung: U="+c.get_spannung()+"V");
                    System.out.println("Stromstärke: I="+c.get_strom()+"A");
                    System.out.println("Zeit: t="+c.get_zeit()+"s");
                    System.out.println("elektrische Leistung: P="+c.berechne_leistung()+"W");
                    System.out.println("elektrische Arbeit: W="+c.berechne_arbeit()+"Ws");
                    break;
                case 3:
                    System.out.println("Sie haben das Programm beendet");
                    System.exit(0);
                default:
                    System.out.println("Sie haben eine falsche Eingabe getätigt. Bitte wiederholen Sie diese.");
                    break;
            }
            } while(true);
        
        
    }catch(Exception e){
        System.out.println("Fehler: "+e);
    }
    }
}
