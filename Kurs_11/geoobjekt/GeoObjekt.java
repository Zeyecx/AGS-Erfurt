package geoobjekt;
import javax.swing.*;

/** @author bg15dv-jskopp */

public class GeoObjekt {
 

 
    public static void main(String[] args) {
    
   
        class Circle{
            
                public Double x = 0.0;
                public Double y = 0.0;
                public Double d = 0.0;
                public double pi = 3.14159265359;
                public double flaeche = 0.0;
          
          public Double eingabeX(Double a){
             while(a > 1000 && a < 0){
                  a = Double.parseDouble(JOptionPane.showInputDialog("X-Wert"));
                  }
               x = a;
              return x;
          }
          
           public Double eingabeY(Double a){
              while(a > 1000 && a < 0){
               a = Double.parseDouble(JOptionPane.showInputDialog("Y-Wert"));
              }
              y = a;
               
               return y;
          }    
           
           public Double eingabeD(Double a){
              d = a;
              return d;
          }     
            
           public void Flaecheninhalt(){
               flaeche = pi * d * d;
           }

            private String flaeche() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
                               
            
        }       
        
        class Rectangle{
                public Double x = 0.0;
                public Double y = 0.0;
                public Double d = 0.0;
                public double pi = 3.14159265359;
                public double flaechen = 0.0;
                
            public Double eingabeX(Double a){
             while(a > 1000 && a < 0){
                  a = Double.parseDouble(JOptionPane.showInputDialog("X-Wert"));
                  }
               x = a;
              return x;
          }
          
           public Double eingabeY(Double a){
            while(a > 1000 && a < 0){
                  a = Double.parseDouble(JOptionPane.showInputDialog("X-Wert"));
                  }
               y = a;
              return x;
          }
              
            
              
           
           public Double eingabeD(Double a){
              d = a;
              return d;
          }     
            
           public void flaecheninhalt(){
               flaechen = pi * d * d;
           }
           
           public double flaeche(){
               return flaechen;

           }
           
            
        }
        
         Circle kreis = new Circle();
         Rectangle viereck = new Rectangle();
   
    System.out.println("Ihre Farbe: " + kreis.flaeche());
    }
    
   
    
}