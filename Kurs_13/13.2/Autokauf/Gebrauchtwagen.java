package mein.Autokauf;

/**
 * @author Hartung
 */
public class Gebrauchtwagen {

    private final String typ;
    private final String modell;
    private final double preis;
    private final int jahr;

    public Gebrauchtwagen(String typ, String modell, double preis, int jahr) {
        this.typ = typ;
        this.modell = modell;
        this.preis = preis;
        this.jahr = jahr;
    }

}
