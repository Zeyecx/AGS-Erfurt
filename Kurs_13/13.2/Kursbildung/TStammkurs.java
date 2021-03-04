
import java.util.ArrayList;

/**
 *
 * @author Skopp, Jonathan
 */
public class TStammkurs {

    private final ArrayList<TSchueler> Schuelerliste;
    private String Kursbezeichnung;

    public TStammkurs() {
        this.Schuelerliste = new ArrayList<>();
    }

    public void addMember(String Name) {
        Schuelerliste.add(new TSchueler(Name, Kursbezeichnung));
    }

    public void setKursbezeichnung(String Kursbezeichnung) {
        this.Kursbezeichnung = Kursbezeichnung;
    }

}
