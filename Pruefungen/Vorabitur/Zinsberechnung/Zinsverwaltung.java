package VorAbi;

import java.util.ArrayList;

/**
 * @see Vorprüfung Technik; BG15DV
 * @author Skopp, Jonathan
 */

public class Zinsverwaltung {

    // Array Liste via Diamond Interface
    private final ArrayList<Zinsen> liste = new ArrayList<>();

    // Methoden
    public void uebernehmen(String a, Double k, Double zs, int t, double z) {
        Zinsen obj = new Zinsen(a, k, zs, t, z);
        liste.add(obj);
    }
}
