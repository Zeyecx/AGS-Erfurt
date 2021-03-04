package Noten;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Barthyr
 */
public class core {

    /* vars */
    protected static ArrayList<Integer> grade = new ArrayList<>();
    protected static ArrayList<Integer> sort = new ArrayList<>();

    /* Konstruktor */
    public core() {
    }

    /* core */
    // sortieren des Arrays
    public static ArrayList<Integer> Sorted(ArrayList<Integer> list) {
        return list;
    }

    // return schlechteste Note
    public static int worst(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    // return beste Note
    public static int best(ArrayList<Integer> list) {
        return Collections.max(list);

    }

    // return avarage
    public static double avarage(ArrayList<Integer> list) {
        double summe = 0.0;
        if (list.size() < 2) {
            System.out.println("Es müssen mindestens 2 Werte vorhanden sein, um den Mittelwert berechnen zu können!");
        } else {
            for (Integer list1 : list) {
                summe = summe + list.size();
            }
            double mittelwert = summe / list.size();
            return mittelwert;
        }
        return -1;
    }

   

}
