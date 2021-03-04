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
public class Angestellter extends Mitarbeiter {
    
 private double gehalt;
 private double provision;
 private double Verdienst;

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }

    public double getProvision() {
        return provision;
    }

    public void setProvision(double provision) {
        this.provision = provision;
    }
 
    
    public double Verdienst (){
        
   Verdienst =gehalt+provision;   
        
       return Verdienst; 
       
    }
    

 
 
    
    
    
    
    
}
