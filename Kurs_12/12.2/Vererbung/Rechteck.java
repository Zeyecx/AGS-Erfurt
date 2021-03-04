/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vererbung;

/**
 *
 * @author bg15dv-rstertzing
 */
public class Rechteck {
    
private double laenge;
double breite;
private double flaeche;

    



public Rechteck () {

laenge=12.5;
breite=10.0;
flaeche =0.0;


}

public double get_laenge(){

    
return laenge;    
    
    
}

public double get_breite(){
    
    
 return breite;   
    
    
}

public double get_flaeche(){
    
    
return flaeche;    
    
}

public void berechne(){
    
    
 flaeche = laenge*breite;   
    
    
}







}