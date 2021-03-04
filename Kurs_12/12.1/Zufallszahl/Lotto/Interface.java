
package lotto;



/**
 * @author SOtto, FSchuster, JSkopp
 * @version 1.0
 * @param args;
 */


public class Interface {
    
    
    public void eUser(){
        function.log("Start class Interface function void eUser(); ");
        for(var.count = 0;  var.count < var.user.length; var.count++){do{
            var.user[var.count] = function.eingabe("Bitte geben sie eine Zahl von 1 bis 49 ein:  \n");   
            function.log("set var.user["+var.count+"] = " + var.user[var.count]);
        }while(var.user[var.count] >= 1 && var.user[var.count] <= 49);
        }
    }
    
    public void eSystem(){
        function.log("Start class Interface function void eSystem(); ");
        for(var.count = 0;  var.count < var.user.length; var.count++){do{
            var.sys[var.count] = (int)(Math.random() * 49) + 1; 
            function.log("set var.sys["+var.sys+"] = " + var.sys[var.count]);
        }while(1!=1/*var.user[var.count] <= 1 || var.user[var.count] >= 49*/);
        /* oben stehender Quelltext ist schrott da das System gezwungen ist eine Richtige Ausgabe zu machen :D  */
        }  
    }
    
    
    
    public void Ausgabe(Integer check){
        function.Ausgabe("Sie haben "+Integer.toString(check)+" Richtige");
    }
    
    public static void error (){
         function.Ausgabe("Blöd gelaufen");
         function.log("NumberFormatException e --> function.error() ");
    }
    
    // delete this line without any flags :D :D 
}
