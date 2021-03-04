
package lotto;

import javax.swing.JOptionPane;

/**
 * @author SOtto, FSchuster, JSkopp
 * @version 1.0
 * @param args
 */

public class function {
    
    

    
        public static void Ausgabe(String text){
            function.log("User selection in function.n(): "); 
            JOptionPane.showMessageDialog(null, text);
             System.out.print(text+"\n");

    } 
    
        public static Integer eingabe (String text){
                    return Integer.parseInt(JOptionPane.showInputDialog(text));
    }
    
    
    
    /* RE-Start Block */
    
    public static boolean n(){
        function.log("User selection in function.n() --> Start user Request ");
         String[] typ = {"Ja", "Nein"}; 
            int selected1 = JOptionPane.showOptionDialog(null, 
                     "Möchtn Sie das Programm neustarten ? ", 
                     "- Neustart- ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]);
            
        function.log("User selection in function.n() Y/n ?");
         return var.neu[selected1];
        
        
    } 
      
    public static void log(String text){
        System.out.println(Integer.toString(var.loggerkey)+". "+text+"\n");
        var.loggerkey++;
    }
    
    public static Integer check(){
        function.log("Start class Interface function check()");
        var.right = 0; // sonst gibts beim 2ten Durchgang gleich mal 16 Richtige :D
        for(var.count = 0; var.user.length != var.count; var.count++){
            if(var.sys[var.count] == var.user[var.count]){
                var.right++;
            }
        }
        return var.right;
    }
    
    
    
}

