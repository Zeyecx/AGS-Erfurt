package passwort;

/**
 * @author jonat
 */
public class TSchulkonten {

    // Variabeln
    TKonto Meier = new TKonto("Meier", "Me123", true, false, false);
    TKonto Schulze = new TKonto("Schulze", "Sch789", true, true, true);

    // Konstruktor 
    public TSchulkonten() {
    }

    // Methoden
    public void neuesKonto(String Benutzername, String Passwort, boolean Leseberechtigung, boolean Schreibeberechtigung, boolean Vollzugriff) {
        TKonto sinnlos = new TKonto(Benutzername, Passwort, true, false, false);
    }

    public TKonto anmelden(String Benutzername, String Passwort) {

        if (Benutzername.equals(Meier.getzBenutzername()) && Passwort.equals(Meier.getzPasswort())) {
            // Wenn Meier angemeldet
            return Meier;
        } else if (Benutzername.equals(Schulze.getzBenutzername()) && Passwort.equals(Schulze.getzPasswort())) {
            // Wenn Schulze angemeldet
            return Schulze;
        } else {
            // Fehler bzw. falsche Eingabe
            return null;
        }
    }
}
