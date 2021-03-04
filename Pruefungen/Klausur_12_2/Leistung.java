
package jskopp;

/**
 * @author Jonathan Skopp (BG15DVI)
 * @since 17.05.2017
 */

public class Leistung{
  
     // Vars
  private double spannung;
  private double strom;
 

  //Konstruktor (Dieser ist nicht in der Aufgabe vorgesehen aber notwendig für Java <8
    public Leistung(){
        this.spannung = 0.0;
        this.strom = 0.0;
    }

  // Methoden
   public void set_spannung(double u){
      this.spannung = (double) u;
   }
   
   public void set_strom(double i){
       this.strom = (double) i;
   }
   
   public double get_spannung(){
       return (double) this.spannung;
   }
   
   public double get_strom(){
       return (double) this.strom;
   }
   
   public double berechne_leistung(){
       return spannung * strom;
   }
}
