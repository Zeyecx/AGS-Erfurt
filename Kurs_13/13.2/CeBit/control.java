package CeBit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;


/**
 *
 * @author Barthyr
 */
public class control {

// Konstanten
private final int fkosten = 20;
private final int ekosten = 34;
    
// ArrayList
    private ArrayList<String> Schüler = new ArrayList<>();
    private ArrayList<TAnmeldung> Anmeldungen = new ArrayList<>();

    
// Berechnungen
    public int Berechnung(int cFahrt, int cEintritt) {
      return (cFahrt * fkosten) + (cEintritt * ekosten);
    }
    
// Dummheiten mit der ArrayList 
  public ArrayList<String> getSchüler() {
        return Schüler; // 
    }

    public void setSchüler(ArrayList<String> Schüler) {
        this.Schüler = Schüler; // eig dumm
    }
    
// Lesen des txt Datei 
public void lesen() throws Exception{
    String file = "Schuelerliste.txt"; // Wo ist die Datei 
    BufferedReader br = new BufferedReader(new FileReader(file)); // lädt die Lesefunktion
    
    for(int x=0; x<=7; x++){
        Schüler.add(br.readLine());
    }
}

// Hinzufügen des Objektes
public void addAnmeldung(String Name, boolean Fahrt, boolean Eintritt) {
        // Neues Objekt wird erzeugt
        Anmeldungen.add(new TAnmeldung(Name, Fahrt, Eintritt));
    }
    
  
    
}
