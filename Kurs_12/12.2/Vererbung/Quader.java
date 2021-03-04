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
public class Quader extends Rechteck {
    
    
    
 
 
private double hoehe;
private double volumen;

    

public Quader(){
    
    
    super();
    
    hoehe=6.5;
    volumen =0.0;
    
}


public double get_hoehe(){
    
    
 return hoehe;   
    
    
    
}




public double get_volumen(){
    
    
return volumen;    
    
    
}

public void berechnen(){
 
super.berechne();
volumen=hoehe*get_flaeche();    
    
    
    
    
}



    
}
