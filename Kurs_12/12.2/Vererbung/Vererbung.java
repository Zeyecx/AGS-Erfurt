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
public class Vererbung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
      
   Rechteck B=new Rechteck();
   
   
   B.berechne();
   System.out.println("Das Rechteck ist "+  B.get_breite()+"Breit."+ "\n und ist "+B.get_laenge()+"lang."+"\n die Fläche ist"+B.get_flaeche());
 
   Quader A=new Quader();
   A.berechnen();
   System.out.println(A.get_volumen());
   
        
        
        
        
    }
    
}
