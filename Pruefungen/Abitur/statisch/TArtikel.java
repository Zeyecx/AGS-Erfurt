package skopp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Abiprüfung 2k18
 *
 * @author BG15DV-JSkopp
 */
public class TArtikel {

    // Attribute
    /**
     * ArrayListe liste mit allen Produkten nach dem einlesen
     */
    static ArrayList<Produkt> liste = new ArrayList<>();

    // Kostruktor 
    /**
     * nur nach Aufgabenstellung :D 
     */
    public TArtikel() {
    }

    // Methoden
    /**
     * Hauptfunktion. Liest aus der Textdatei alles aus.
     */
    public static void auslesen() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("obst.txt"));
            String[] x = new String[2];
            for (int c = 0; c <= 5; c++) {

                x[0] = br.readLine();
                x[1] = br.readLine();

                übernehmen(x);

            }
            br.close();
        } catch (Exception e) {
            System.err.print("Warnung: Ende der Datei.");
        }

    }

    /**
     * Erstellt aus den ausgelesenen Daten ein Objekt und hängt es an. 
     * @param content 
     */
    public static void übernehmen(String[] content) {
        Produkt pro = new Produkt(content[0], Double.parseDouble(content[1]));
        liste.add(pro);
    }
}
