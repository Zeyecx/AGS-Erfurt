
package messe;
import java.io.*;

/**
 * @version 1.0
 * @author Barthyr
 */
public class Messe {

   
    public static void main(String[] args) throws IOException {
        
        function Function = new function(); 
        var Variable = new var();
        Interface Interface = new Interface();
        
        //Interface.User(); // wird immer ausgeführt
        
        int x = 0;
        
        do{    
            x = function.menue(); // ini-VAR
            if(x==0){
                Interface.eUser();
            }else if(x==1){
                Interface.gesamt();
            }else if(x==2){
                Interface.summe();
            }else if(x==3){
                Interface.day2();
            }else if (x==4){
                Interface.day();
            }else{
             Interface.kill();
            }
            
            
            
        }while(function.n());
        
        
    }
    
}
