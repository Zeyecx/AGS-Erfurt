
/**
 * @author Skopp
 */
public class Buch {

    /* Vars */
    public int isbn;
    public String titel;
    public String autor;
    public double preis;
 


    /* Konstruktor */
    public Buch(int i, String t, String a, double p) {
        this.isbn = i;
        this.titel = t;
        this.autor = a;
        this.preis = p;
    }


    /* Methoden*/
    public double getPreis() {
        return preis;
    }

}
