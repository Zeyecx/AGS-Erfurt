
/**
 * @author ahartung
 * @author Barthyr
 */

package Artikelliste;


public class Artikel {
    private final int nr;
    private final String name;
    private final double preis;
    private final int anzahl;
    private final double gesamt;
    
    public Artikel(int nr, String name, double preis, int anzahl, double gesamt){
        this.nr=nr;
        this.name=name;
        this.preis=preis;
        this.anzahl=anzahl;
        this.gesamt =anzahl*preis;
    }
    public double getGesamt(){
            return  gesamt;
    }
   
}
