package passwort;

/**
 * @author Barthyr
 */
public class TKonto {

    // Variabeln
    protected String zBenutzername;
    protected String zPasswort;
    protected boolean zLeseberechtigung;
    protected boolean zSchreibberechtigung;
    protected boolean zVollzugriff;

    // Konstruktor
    public TKonto(String zBenutzername, String zPasswort, boolean zLeseberechtigung, boolean zSchreibberechtigung, boolean zVollzugriff) {
        this.zBenutzername = zBenutzername;
        this.zPasswort = zPasswort;
        this.zLeseberechtigung = zLeseberechtigung;
        this.zSchreibberechtigung = zSchreibberechtigung;
        this.zVollzugriff = zVollzugriff;
    }
    
    // Methoden
    public TKonto anmelden(String Benutzername, String Passwort){
        return new TKonto(Benutzername, Passwort, false, false, false);
    }

    // Getter && Setter

    public String getzBenutzername() {
        return zBenutzername;
    }

    public void setzBenutzername(String zBenutzername) {
        this.zBenutzername = zBenutzername;
    }

    public String getzPasswort() {
        return zPasswort;
    }

    public void setzPasswort(String zPasswort) {
        this.zPasswort = zPasswort;
    }

    public boolean iszLeseberechtigung() {
        return zLeseberechtigung;
    }

    public void setzLeseberechtigung(boolean zLeseberechtigung) {
        this.zLeseberechtigung = zLeseberechtigung;
    }

    public boolean iszSchreibberechtigung() {
        return zSchreibberechtigung;
    }

    public void setzSchreibberechtigung(boolean zSchreibberechtigung) {
        this.zSchreibberechtigung = zSchreibberechtigung;
    }

    public boolean iszVollzugriff() {
        return zVollzugriff;
    }

    public void setzVollzugriff(boolean zVollzugriff) {
        this.zVollzugriff = zVollzugriff;
    }
   

}
