
public class TKonto {

    protected String user,password;
    protected boolean zLeseberechtigung, zSchreibberechtigung, zVollzugriff;

    public TKonto(String user, String password, boolean zLeseberechtigung, boolean zSchreibberechtigung, boolean zVollzugriff) {
        this.user = user;
        this.password = password;
        this.zLeseberechtigung = zLeseberechtigung;
        this.zSchreibberechtigung = zSchreibberechtigung;
        this.zVollzugriff = zVollzugriff;
    }
    public TKonto Anmelden(String user, String password) {
        if (this.user.equals(user) && this.password.equals(password)) {
            return new TKonto(this.user, this.password, this.zLeseberechtigung, this.zSchreibberechtigung, this.zVollzugriff);
        } else {
            return null;
        }
    }
    public boolean iszVollzugriff() {
        return zVollzugriff;
    }

    public boolean iszLeseberechtigung() {
        return zLeseberechtigung;
    }

    public boolean iszSchreibberechtigung() {
        return zSchreibberechtigung;
    }
    
}