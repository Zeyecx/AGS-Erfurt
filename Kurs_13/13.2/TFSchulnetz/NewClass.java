
/**
 *
 * @author hg
 */
public class NewClass {
    protected String user, password;
    protected boolean lesen,schreiben,vollzugriff;

    public NewClass(String user, String password, boolean lesen, boolean schreiben, boolean vollzugriff) {
        this.user = user;
        this.password = password;
        this.lesen = lesen;
        this.schreiben = schreiben;
        this.vollzugriff = vollzugriff;
    }

    public boolean isLesen() {
        return lesen;
    }

    public boolean isSchreiben() {
        return schreiben;
    }

    public boolean isVollzugriff() {
        return vollzugriff;
    }
    
    
}
