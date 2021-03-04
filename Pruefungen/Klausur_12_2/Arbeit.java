
package jskopp;

/**
 * @author Jonathan Skopp (BG15DVI)
 * @since 17.05.2017
 */

public class Arbeit extends Leistung {
    // Vars
    private int zeit;

   // Konstruktor (Dieser ist nicht in der Aufgabe vorgesehen aber notwendig für Java <8
    public Arbeit() {
        this.zeit = 0;
    }
   
    // Methoden
    public void set_zeit(int t){
        this.zeit = t;
    }
    
    public int get_zeit(){
        return this.zeit;
    }
    
    public double berechne_arbeit(){
        return berechne_leistung() * get_zeit();
    }
    
}
