
package array2d1;

import javax.swing.JOptionPane;

/**
 * @author JSkopp
 */

public class Interface {

        public void erstellen(){
            
            // erstellt ein nutzerdefiniertes Array
                
                // Zeile
                for(var.z = 0; var.z <= var.Tabelle.length-1;var.z++){

                    
                    //Spalte
                    for(var.s = 0; var.s <= var.Tabelle.length-1;var.s++){

                        //Eingabe
                        var.Tabelle[var.z][var.s] = Integer.parseInt(JOptionPane.showInputDialog("Eingabe Zeile "+(var.z+1)+" und Spalte "+(var.s+1)));
                        
                        
                    }   

                }
            
        }
        
        public void ausgeben(){
            
            // gibt das Array aus 
                
                // Ausgabe Menue
                System.out.println("Ein Array mit den Werten: \nZeilen: "+var.z+"\nSpalten: "+var.s);
                
                // Zeile
                for(var.z = 0; var.z <= var.Tabelle.length-1;var.z++){

                    
                    //Spalte
                    for(var.s = 0; var.s <= var.Tabelle.length-1;var.s++){

                        // Ausgabe
                        System.out.println(var.Tabelle[var.z][var.s] + var.tab);                         
                        
                    }   

                }            
            
            
        }
    
}
