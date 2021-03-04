package flaechen;
import java.util.*;

/**
 * @author bg15dv-jskopp
 */
public class Flaechen {

       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           Geometrie c = new Geometrie();
           
        System.out.println("Bitte geben Sie die Länge ein: ");
        c.get_länge();
        
        System.out.println("Bitte geben Sie die Breite ein: ");
        c.get_breite();
        
        c.set_fläche(c.get_länge(), c.get_breite());
        c.set_umfang(c.get_länge(), c.get_breite());
        
        double fläche = c.get_fläche(); // Fläche
        double umfang = c.get_umfang(); // Umfang
           
    }
    
}
