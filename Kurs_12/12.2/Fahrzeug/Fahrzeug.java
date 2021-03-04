
package fahrzeug;
import java.util.*;

/**
 * @author Barthyr
 */
public class Fahrzeug {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Logger log = new Logger();
        Mautkasse kitty = new Mautkasse();
        String c = "null"; // laufzeit !!!
        
        do{
            c = sc.next();
            
            switch(c){ // bitte nich ertst hier c deklarieren !
                case "b": case "B": 
                    kitty.Bezfahrzeug();
                    break;
                case "n": case "N": 
                    kitty.NBezfahrzeug();
                    break;
                case "a": case "A":
                    System.out.println("Anzahl der Autos: "+kitty.get_anz());
                    System.out.println("Eingenommenes Geld: "+kitty.get_kitty());
                    System.out.println("Fahrzeuge die nicht bezahlt haben: "+(kitty.get_kitty()-kitty.get_anz()));
            }
            
            
        }while(false);
        
    }
    
}
