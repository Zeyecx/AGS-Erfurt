
package cinema;
import javax.swing.JOptionPane;



/* @author bg15dv-jskop */

public class Cinema {

    
    
    public static void main(String[] args) {
   
        Double[][] week = new Double [10][10]; /*[x] [y] */
        double week1 = 0.0;
        double week2 = 0.0;
        double week3 = 0.0;
        boolean guess = false;
        
        while(!guess){
            
               
        Object[] options = {"Daten einlesen", "Daten berechnen", "Auslastung", "Ausgabe", "Beenden"}; 
        int selected = JOptionPane.showOptionDialog(null, 
                 "Menue", 
                 "Bitte wählen Sie ?!", 
                  
                 JOptionPane.DEFAULT_OPTION, 
                 JOptionPane.INFORMATION_MESSAGE, 
                 null, options, options[0]); 
        
         if(selected == 0){
            
            for(int x = 1; x <= 3; x++){
                for (int y = 1; y <= 7; y++){
                    week[x][y] = Double.parseDouble(JOptionPane.showInputDialog(x+"Woche"+y+"Tag"));
                    
                }
            }
         }
         
          if(selected == 1){
             week1 = (week[1][1] + week[1][2] + week[1][3] + week[1][4] + week[1][5] + week[1][6] + week[1][7])  / 7.0; 
             week2 = (week[2][1] + week[2][2] + week[2][3] + week[2][4] + week[2][5] + week[2][6] + week[2][7])  / 7.0; 
             week3 = (week[3][1] + week[3][2] + week[3][3] + week[3][4] + week[3][5] + week[3][6] + week[3][7])  / 7.0; 
             System.out.println("Auslastung Saal1:"+week1);
             System.out.println("Auslastung Saal2:"+week2);
             System.out.println("Auslastung Saal3:"+week3);
          }
        if(selected == 2){
            if((week1 > week2) && (week1 > week3)){System.out.println("Saal 1 hat mit "+week1+" die größte Auslastung");};
            if((week2 > week1) && (week2 > week3)){System.out.println("Saal 2 hat mit "+week2+" die größte Auslastung");};
            if((week1 > week2) && (week1 > week3)){System.out.println("Saal 3 hat mit "+week3+" die größte Auslastung");};
            }
      
        if(selected == 3){
           for(int x = 1; x <= 3; x++){
               System.out.println(x+". Saal");
                for (int y = 1; y <= 7; y++){
                    if(week != null){System.out.println(week[x][y]);  } 
                          }
                            }
            }
        if(selected == 4){
           System.gc();
           guess = true; 
           
        }
        
        
            
        
    } 
    }
    
}
