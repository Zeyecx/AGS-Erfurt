
/** @author Bartyhr */
public class Mietwagen {

    private static double gefKm;
    private static double preis;

    public double berechnen(Double km) {
        if (km >= 300) {
            return (km * 0.34) + 114;
        } else {
            return (km * 0.42) + 90;
        }
    }

    /* für altes Java :-)  */
    public Mietwagen() {
        gefKm = 0.0;
        preis = 0.0;
    }

}
