
import java.util.ArrayList;

/**
 * @author Skopp, Jonathan
 */
public class Buchverwaltung {

    /* Vars */
    ArrayList<Buch> liste = new ArrayList<>();

    /* Methoden */
    public void übernehmen(int i, String t, String a, double p) {
        Buch book = new Buch(i, t, a, p);
        liste.add(book);
    }

    public double berechnen() {
        double dummy = 0.0;
        for (int i = 0; i < liste.size(); i++) {
            dummy += liste.get(i).getPreis();
        }
        return dummy;
    }
}
