
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TArtikel {

    /**
     * Abiturprüfung 2k18
     *
     * @author BG15DV-JSkopp
     */
    private ArrayList<TArtikel> Artikel = new ArrayList<>();

    private String Bezeichnung;
    private double Preis;

    public TArtikel(String Bezeichnung, double Preis) {
        this.Bezeichnung = Bezeichnung;
        this.Preis = Preis;
    }

    public void Lesen() throws IOException {
        try {
            //Datei "obst.txt" muss auf dem Desktop liegen
            //Erste Zeile: Bezeichnung ; Zweite Zeile: Preis (fuer Berechnung)
           // Path desktop = FileSystems.getDefault().getPath(System.getProperty("user.home") + "/Desktop");
            File textFile = new File(/*desktop.toString(), */ "obst.txt");
            FileReader fr = new FileReader(textFile);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                Artikel.add(new TArtikel(line, Double.valueOf(br.readLine())));
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "obst.txt wurde nicht gefunden.", "Fehler", JOptionPane.ERROR_MESSAGE);
        }
    }

    public double GetVerkaufspreis() {
        return Preis;
    }

    public ArrayList<TArtikel> getArtikel() {
        return Artikel;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

}
