import java.util.ArrayList;

public class TSchulkonten {
    
    protected ArrayList <TKonto> zSchulkonten;
    
    public TSchulkonten() {
        zSchulkonten = new ArrayList<>();
       
    }
    
    public void NeuesKonto(String Benutzername, String Passwort, boolean Leseberechtigung, boolean Schreibberechtigung, boolean Vollzugriff) {
        zSchulkonten.add(new TKonto(Benutzername, Passwort, Leseberechtigung, Schreibberechtigung,Vollzugriff));
    }
    
    public TKonto Anmelden(String user, String password) {
        for(TKonto k : zSchulkonten) {
            if(k.user.equals(user) && k.password.equals(password)) {
                return k;
            }
        }
        return null;
    }
   
    
}
