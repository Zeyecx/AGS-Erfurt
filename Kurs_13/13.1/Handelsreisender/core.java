
/** @author Barthyr */
public class core {

    /* vars */
    private static double umsatz;
    private static double fixum;
    private static double einkommen;

    /* old Java Versions */
    public core() {
        umsatz = 0.0;
        fixum = 0.0;
        einkommen = 0.0;
    }

    /* core source */
    public double lohn(Double u, Double f) {
        if (50000 < u) if (u >= 50000 && u < 100000) {
            return f + (u * 0.035);
        } else if (u >= 100000 && u < 250000) {
            return f + (u * 0.04);
        } else if (u >= 250000) {
            return f + (u * 0.05);
        } else {
            return -1;
        } else {
            return f + (u * 0.03);
        }
    }

}
