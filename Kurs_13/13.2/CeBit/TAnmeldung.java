
package CeBit;

/**
 *
 * @author Barthyr
 */
public class TAnmeldung {
    
// Variabeln
private String name;
private boolean eintritt;
private boolean fahrt;



// Konstruktor

    public TAnmeldung(String name, boolean eintritt, boolean fahrt) {
        this.name = name;
        this.eintritt = eintritt;
        this.fahrt = fahrt;
    }
    
// Getter und Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEintritt() {
        return eintritt;
    }

    public void setEintritt(boolean eintritt) {
        this.eintritt = eintritt;
    }

    public boolean isFahrt() {
        return fahrt;
    }

    public void setFahrt(boolean fahrt) {
        this.fahrt = fahrt;
    }

   

}
