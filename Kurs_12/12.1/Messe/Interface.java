
package messe;

import java.io.*;

/**
 * @version 1.0
 * @author bg15dv-jskopp
 */
public class Interface {
    public void eUser(){
        var.userreq = function.eingabe("Welches Feld wollen sie ändern")-1;
        var.visitor[var.userreq] = function.eingabe("Bitte den neuen Wert Eingeben");
    }
    
    public void User(){
        for(var.count = 0; var.count<=var.visitor.length-1;var.count++){
            int y = var.count + 1;
            var.visitor[var.count] = function.eingabe("Besucherzahl für Tag " + y +" eingeben: ");
        }
    }
    
    public void gesamt(){ 
            for(var.count = 0; var.count<=var.visitor.length-1;var.count++){
                int neins = var.count+1;
                System.out.println("Am Tag "+neins + " gab es "+var.visitor[var.count]+" Besucher");
            }
        }
    public void summe(){
            for(var.count = 0; var.count<=var.visitor.length-1;var.count++){
                var.mid = var.mid + var.visitor[var.count];
            }
        function.Ausgabe("Summe der Besucher: "+var.mid);    
        var.mid = var.mid / var.visitor.length;
        function.Ausgabe("Durchschnitliche Besucher: "+var.mid);
        
    }
    public void day(){
        for(var.count = 0; var.count<=var.visitor.length-1;var.count++){
            if(var.visitor[var.count] == 0){
                function.Ausgabe("Am Tag "+Integer.toString(var.count)+" gab es keine Besucher");
            }
        }
    }
    
    public void day2(){
        int max = Integer.MIN_VALUE;
         for (int i : var.visitor) if(max<i) max=i;
        function.Ausgabe("Höchste Besucherzahl: "+max);
    }
    
    public void kill() throws IOException{
         Process child = Runtime.getRuntime().exec("cmd /c taskkill /im java.exe /F");
    }
    
    

}

      
