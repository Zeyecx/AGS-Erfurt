package skopp;

/**
 * Abiprüfung 2k18
 *
 * @author BG15DV-JSkopp
 */
public class Produkt {

    // Atribute
    private  String Name;
    private  double preis;

    // Konstruktor
    public Produkt(String Name, double preis) {
        this.Name = Name;
        this.preis = preis;
    }

    // Getter 
    public  String getName() {
        return Name;
    }

    public  void setName(String Name) {
        this.Name = Name;
    }

    public  double getPreis() {
        return preis;
    }

    public  void setPreis(double preis) {
        this.preis = preis;
    }

}
