
package flaechen;

/**
 * @author bg15dv-jskopp
 */

public class Geometrie {

    private double länge = 0.0;
    private double breite = 0.0;
    private double fläche = 0.0;
    private double umfang = 0.0;
    
    /* Setter Block */
    
    public void set_länge(Double länge){
        this.länge = länge;
    }
    
    public void set_breite(Double breite){
        this.breite = breite;
    }
    
    public void set_fläche(Double länge, Double breite){
        this.fläche = länge*breite;
    }
    
    public void set_umfang(Double länge, Double breite){
        this.umfang = 2*(länge+breite);
    }
    
    /* Getter Block */ 
    
    public double get_länge(){
        return länge;
    }
    
    public double get_fläche(){
        return fläche;
    }
    public double get_umfang(){
        return umfang;
    }
    
    public double get_breite(){
        return breite;
    }
  }
