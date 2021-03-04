
/** @author Barthyr */
public class core {

    /* vars */
    private static double menge;
    private static double einzelpreis;
    private static double jahre;
    private static double rabatt;

    /* for old Java Versions */
    public core() {
        menge = 0.0;
        einzelpreis = 0.0;
        jahre = 0.0;
        rabatt = 0.0;
    }

    /* core */
    public double rabatt(double m, double p, int j) {
        /* Ich bereche den Rabatt. Da ist mir der Preis egal */
        this.einzelpreis = 0.0; // ?????

        // Meine Interpretation der Aufgabenstellung
        if (m >= 1000 && j >= 10) {
            rabatt += 5;
        }

        // der Rest ist eigentlich logisch
        if (m < 500) {
            rabatt += 2;
        } else if (m >= 500 && m < 1000) {
            rabatt += 5;
        } else if (m > 1000) {
            rabatt += 10;
        } else {
            rabatt = -100; // wird bei der Ausgabe zu -1
        }
        return rabatt / 100;
    }
}
