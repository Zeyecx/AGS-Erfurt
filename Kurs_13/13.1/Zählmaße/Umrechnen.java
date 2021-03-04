
import java.util.Vector;

/**
 * @author Barthyr
 */
public class Umrechnen {

    
    public Umrechnen() {
        this.stueck = 0;
        this.gros = 0;
        this.schock = 0;
        this.dutzend = 0;
    }

     
    Vector<Integer> vec = new Vector<>(0b100);

    int stueck, gros, schock, dutzend;

    public Vector<Integer> umrechnen(int value) {

        //  set label
        stueck = value; // reinladen der args
        gros = stueck / 144;
        stueck = stueck % 144;
        schock = stueck / 60;
        stueck = stueck % 60;
        dutzend = stueck / 12;
        stueck = stueck % 12;
        // end label

        // gen Vec
        vec.add(0, gros);
        vec.add(1, schock);
        vec.add(2, dutzend);
        vec.add(3, stueck);
        // end Vec

        // return vec 
        return vec;
    }

    // Getter
    public String ausgabe(int flag) {
        return Integer.toString(vec.get(flag));
    }
}

/**
 * TODO: - Flaggen generieren; - Die args[] von Strings auf bytes setzen.
 */
