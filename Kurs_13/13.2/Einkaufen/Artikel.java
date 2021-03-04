/**
 * @author Barthyr
 */

public class Artikel {
    
    private int anzahl;
    private double preis;
    private double rabatt;
    private double epreis;
    
    public Artikel(){
        anzahl = 0;
        preis = 0;
        rabatt = 0;
        epreis = 0;
    }
    
    public double berechnen (int a, double p, double r){
        anzahl = a;
        preis = p;
        rabatt = r;
        epreis = (anzahl * preis) - (anzahl * preis * rabatt / 100);
        return epreis;
    }
}
