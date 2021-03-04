/**
 * @author ahartung
 * @author Barthyr
 */
package Artikelliste;

import java.util.ArrayList;

public class ArtikelSteuerung {

    ArrayList<Artikel> list = new ArrayList<>();

    public void uebernehmen(int nr, String n, double p, int a, double g) {
        Artikel art = new Artikel(nr, n, p, a, g);
        list.add(art);
    }

    public double wert() {
        double warenwert = 0.0;

        for (int i = 0; i < list.size(); i++) {

            warenwert += list.get(i).getGesamt();
        }

        return warenwert;
    }

}
