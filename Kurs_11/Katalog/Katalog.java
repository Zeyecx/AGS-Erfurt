
package katalog;
import javax.swing.*;


/* @author bg15dv-jskopp  */

public class Katalog {

    /* @param args the command line arguments */
    
    public static void main(String[] args) {

        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Wie viel sind Sie zuschnell gefahren?")); 
        
        Object[] options = {"Inerorts", "Außerorts"}; 
        int selected = JOptionPane.showOptionDialog(null, 
                 "Geografische Laage", 
                 "Wo wurden sie geblitzt?", 
                  
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.INFORMATION_MESSAGE, 
                 null, options, options[0]); 
        
       
        
        
        
        switch(selected){ 
            case 0:
                /* Innerorts */
                if(tempo >= 0 && tempo <= 10){
                JOptionPane.showMessageDialog(null, "15,- € EUR");
                }
                if(tempo > 10 && tempo <= 15){
                    JOptionPane.showMessageDialog(null, "25,- € EUR");
                }
                if(tempo > 15  && tempo <= 20){
                    JOptionPane.showMessageDialog(null, "35,- € EUR");
                }
                if(tempo > 20 && tempo <= 25){
                    JOptionPane.showMessageDialog(null, "80,- € EUR und 1 Punkt");
                }
                if(tempo > 25 && tempo <= 30){
                    JOptionPane.showMessageDialog(null, "100,- € EUR und 1 Punkt");
                }
                if(tempo > 30 && tempo <= 40){
                    JOptionPane.showMessageDialog(null, "160,- € EUR und 2 Punkt und 1 Monat Fahrverbot");
                }
                 if(tempo > 40 && tempo <= 50){
                    JOptionPane.showMessageDialog(null, "200,- € EUR und 2 Punkt und 1 Monat Fahrverbot");
                }
                if(tempo > 50 && tempo <= 60){
                    JOptionPane.showMessageDialog(null, "280,- € EUR und 2 Punkt und 2 Monat Fahrverbot");
                }
                if(tempo > 60 && tempo <= 70){
                    JOptionPane.showMessageDialog(null, "480,- € EUR und 2 Punkt und 3 Monat Fahrverbot");
                }
                if(tempo > 70){
                    JOptionPane.showMessageDialog(null, "680,- € EUR und 2 Punkt und 3 Monat Fahrverbot");
                }
               break;
            case 1: 
                /* Ausserorts */ 
             if(tempo >= 0 && tempo <= 10){
                JOptionPane.showMessageDialog(null, "10,- € EUR");
            }
            if(tempo > 10 && tempo <= 15){
                JOptionPane.showMessageDialog(null, "20,- € EUR");
            }
            if(tempo > 15  && tempo <= 20){
                JOptionPane.showMessageDialog(null, "30,- € EUR");
            }
            if(tempo > 20 && tempo <= 25){
                JOptionPane.showMessageDialog(null, "70,- € EUR und 1 Punkt");
            }
            if(tempo > 25 && tempo <= 30){
                JOptionPane.showMessageDialog(null, "80,- € EUR und 1 Punkt");
            }
            if(tempo > 30 && tempo <= 40){
                JOptionPane.showMessageDialog(null, "120,- € EUR und 2 Punkt und 1 Monat Fahrverbot");
            }
             if(tempo > 40 && tempo <= 50){
                JOptionPane.showMessageDialog(null, "160,- € EUR und 2 Punkt und 1 Monat Fahrverbot");
            }
            if(tempo > 50 && tempo <= 60){
                JOptionPane.showMessageDialog(null, "240,- € EUR und 2 Punkt und 2 Monat Fahrverbot");
            }
            if(tempo > 60 && tempo <= 70){
                JOptionPane.showMessageDialog(null, "440,- € EUR und 2 Punkt und 3 Monat Fahrverbot");
            }
            if(tempo > 70){
                JOptionPane.showMessageDialog(null, "600,- € EUR und 2 Punkt und 3 Monat Fahrverbot");
            }
           break;
            
        }
        
    }
    
}
