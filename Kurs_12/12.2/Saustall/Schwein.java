
package saustall;

/**
 * @author Barthyr
 */

public class Schwein {

    private double gewicht;
    private double futter; 
    private double anz;
    
    
    public Schwein(double x, double y){ /* x...Gewicht; y...Futtermenge */
        this.anz = (double) y;
        this.gewicht = (double) x;
    }
    
    public void fuettern(){
        if(schlachten() && this.gewicht != -1){
            this.gewicht = gewicht + (futter * 0.37037); // auf 27 Kilo Futter kommen 10kg Gewicht
        }else{  
            System.out.print("Füttern ist nicht möglich");
        }
    }
    
    public double wiegen(){
        return (double) this.gewicht;
    }
    
    public boolean schlachten(){
        return gewicht <= 110 && gewicht >=125;
    }
    
    public double get_futter(){ // meiner Meinung nach ist diese Funktion nutzlos
        return (double) futter;
    }
    
    //Die folgenden Funktionen wurden nachträglich ergänzt
    
    public double get_gewicht(){
        return (double) gewicht;
    }
    
    public void kill(){
        if(schlachten()){this.gewicht = -1;}
    }
}
