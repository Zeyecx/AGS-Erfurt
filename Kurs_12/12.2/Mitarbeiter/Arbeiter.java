/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbung1;

/**
 *
 * @author bg15dv-rstertzing
 */
public class Arbeiter extends Mitarbeiter {
   
  private int stunden;
  private double Lohn;
  private double Verdienst;

    public int getStunden() {
        return stunden;
    }

    public void setStunden(int stunden) {
        this.stunden = stunden;
    }

    public double getLohn() {
        return Lohn;
    }

    public void setLohn(double Lohn) {
        this.Lohn = Lohn;
    }

public double Verdienst () {
    
 Verdienst=Lohn*stunden;
 return Verdienst;
    
 }
    

    
    
}
