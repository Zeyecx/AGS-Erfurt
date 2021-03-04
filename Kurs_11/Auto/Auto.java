
package auto;
import javax.swing.*; 

/** @author bg15dv-jskopp  */

public class Auto {


    public static void main(String[] args) {
      
        class Fahrzeug{
           int Geschwindigkeit = 0; // Eigenschaft Geschwindigkiet
           String Farbe = "Pink"; // Eigenschaft Farbe
           
           public Integer ausGes(){
               return Geschwindigkeit;               
           }
           
           public String ausFar(){
              return Farbe;
           }
           
           public void aendernGes(int neuGes){
               Geschwindigkeit = Geschwindigkeit + neuGes;
           }
           
           public void aendernFarbe(String color){
               Farbe = color ;
           }
           
         }
         
        //Methoden
        
        Fahrzeug Yahama = new Fahrzeug();
        Fahrzeug Esta = new Fahrzeug();
        
        //Zugriff auf Funktionen
         System.out.println("Ihre Farbe: " + Yahama.ausFar());
         System.out.println("Ihre Geschwindigkeit: " + Yahama.ausGes());
         System.out.println("~~~ Änderung der Werte ~~~ ");
         JOptionPane.showMessageDialog(null, "Alte Werte \n " + "Farbe: " + Yahama.ausFar() + "\n" + "Geschwindigkeit: "+  Yahama.ausGes() + "km/h"); 
         Yahama.aendernGes(Integer.parseInt(JOptionPane.showInputDialog("Neue Geschwindigkeit eingeben")));
         Yahama.aendernFarbe(JOptionPane.showInputDialog("Neue Farbe"));
         System.out.println("Ihre Farbe: "+Yahama.ausFar());
         System.out.println("Ihre Geschwindigkeit: "+ Yahama.ausGes());
         JOptionPane.showMessageDialog(null, "Neue Werte \n " + " Farbe: " + Yahama.ausFar() + "\n" + "Geschwindigkeit: "+  Yahama.ausGes()+"km/h"); 
 
    }
    
}


            
