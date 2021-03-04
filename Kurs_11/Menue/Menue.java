package menue;
import javax.swing.JOptionPane;
import java.Runtime.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 



/* @author bg15dv-jskopp */
public class Menue {

    /* @param args the command line arguments */
    
    
    public static void main(String[] args) {
      
     boolean erraten = false;
     int[][] temp = new int [2][6];
     
     while(!erraten){
        
    System.out.println(temp);
         
//     Process p1 = Runtime.getRuntime().exec("taskkill /im java.exe /F");
      Object[] options = {"Daten einlesen", "Daten ändern", "Daten ausgeben", "Daten speichern", "Ende"}; 
        int selected = JOptionPane.showOptionDialog(null, 
                 "Menue", 
                 "Bitte wählen Sie ?!", 
                  
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.INFORMATION_MESSAGE, 
                 null, options, options[0]); 
    
        /* Abfrage der Menuepunkte */
        if(selected == 0){
            
            for(int x = 0; x <= 2; x++){
                for (int y = 0; y <= 6; y++){
                    temp[x][y] = Integer.parseInt(JOptionPane.showInputDialog(y+". Tag"));
                    System.out.println(y);
                }
            }
            
            
        }else if(selected == 1){
            /*Daten ändern*/
        }else if(selected == 2){
            System.out.println("WOCHE 1");
            System.out.println(temp[1]);
            System.out.println("WOCHE 2");
             System.out.println(temp[2]);      
             System.out.println("WOCHE 3");
             System.out.println(temp[3]);
            
        }else if(selected == 3){
                                PrintWriter pWriter = null;
                            try {
                                pWriter = new PrintWriter(new BufferedWriter(new FileWriter("Teemperatur.txt")));
                                pWriter.println(temp); /*schreibe ! */
                            } catch (IOException ioe) {
                                ioe.printStackTrace();
                            } finally {
                                if (pWriter != null){
                                    pWriter.flush();
                                    pWriter.close();
                                }
                            }
        }else if (selected == 4){
            erraten = true;
            p1.destroy();
                
        }       
        
     }
    }
    
}
