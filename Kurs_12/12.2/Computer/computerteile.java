
package computer;

import java.util.*;

/**
 * @author Barthyr
 */


public class computerteile {
    Scanner sc = new Scanner(System.in);
    
    private int teilnr;
    private double epreis;
    private double vpreis;
    private int anzahl;
    private double umsatz;
    private double gewinn;
    private int x;
    
    
    
    public computerteile(double ep, double vp, int a){
        this.epreis = ep;
        this.vpreis = vp;
        this.anzahl = a;
        this.x = 0;
        
    }
    public computerteile(){
        this.teilnr = 0;
        this.epreis = 0.0;
        this.vpreis = 0.0;
        this.anzahl = 0;
        this.umsatz = 0.0;
        this.gewinn = 0.0;
        this.x  = 0;
    }
    
    public int get_teilnr(){
        return this.teilnr;
    }
    
    public double get_epreis(){
        return this.epreis;
    }
    
    public double get_vpreis(){
        return this.vpreis;
    }
    
    public int get_anzahl(){
        return this.anzahl;
    }
    
    public void kaufen (int a){
       this.anzahl = this.anzahl + a;
       System.out.println("");
    }
    
    public void verkaufen(int a){
         if(this.anzahl<a){
            System.out.println("Es sind nicht genügend Exemplare mehr vorhanden");
        }else{
            this.anzahl = this.anzahl - a;
        }
    }
    
    
    
    // Die Aufgabe ist kompletter Müll
    
    
    
}
