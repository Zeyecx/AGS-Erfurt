package VorAbi;

/**
 * @see Vorprüfung Technik; BG15DV
 * @author Skopp, Jonathan
 */

public class Zinsen {

    // Vars
    private final int tag;
    private final String art;
    private final double kap;
    private final double zinssatz;
    private final double zinsen;

    // Konstruktor
    public Zinsen(String a, Double k, Double zs, int t, double z) {
        this.tag = t;
        this.art = a;
        this.kap = k;
        this.zinssatz = zs;
        this.zinsen = z;
    }
  
    // Getter

    public int getTag() {
        return tag;
    }

    public String getArt() {
        return art;
    }

    public double getKap() {
        return kap;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public double getZinsen() {
        return zinsen;
    }
}
