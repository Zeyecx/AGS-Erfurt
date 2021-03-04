
/** @author Barthyr */
public class core {

    /* vars */
    private static int jahre;
    private static int anzahl;
    private static double praemie;

    /* Für Lappis die älter als die Steinkohle sind (die aus der 31) */
    public core() {
        jahre = 0;
        anzahl = 0;
        praemie = 0.0;
    }

    /* Funktionen */
    public double zuschlag(int j, int a) {
        /* Weil man ja nichts zu tun hat ^^ */
        anzahl = a;
        jahre = j;
        praemie = 0.0; // falls der Konstruktor aussteigt
        /* Funktion*/
        if (jahre >= 1 && jahre <= 3) {
            return 0;
        } else if (jahre >= 4 && jahre <= 7 && anzahl >= 1) {
            return 12.50;
        } else if (jahre >= 8 && jahre <= 11 && anzahl >= 2) {
            return 17.50;
        } else if (jahre >= 12 && jahre <= 15 && anzahl >= 3) {
            return 21.00;
        } else if (jahre > 15 && anzahl >= 4) {
            return 23.00;
        } else {
            return 0.0;
        }
    }
}
