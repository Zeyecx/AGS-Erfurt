package Noten;

import static Noten.Noten_GUI.run;
import java.util.ArrayList;

/**
 * @author Barthyr
 */
public class Schulnoten {

    protected static ArrayList<Integer> grade = new ArrayList<>();
    /* obj anlegen da der Konstruktor so initalisiert 
     * ist eigentlich seltsam :) */

    Noten_GUI n = new Noten_GUI();
    core x = new core();

    public static void main(String[] args) {
        // Steuerargumente überschreiben
        if (args.length != 0) {
            args = null;
        }

        // start Interface 
        run();

    }

}
