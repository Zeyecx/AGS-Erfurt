
package tage;
import javax.swing.*;
/** @author JSkopp
 * @Version 1.0
 */
public class Tage {

    public static int[] tage = new int[355];
    //public static int a = 1;        
            
    public static void main(String[] args) {
        
        for(int i=0; i < Tage.tage.length; i++){
            Tage.tage[i] = i + 1;
        }
        
        for(int n:Tage.tage){
            System.out.println(n);
        }
        
        System.out.print("Für das Folgende bin ich nicht Verantwortlich \n");
       
        
        for(int b = 0; b < Tage.tage.length; b++){
           System.out.println(b+" Tage haben "+(Tage.tage[b]*24)+" Stunden");
        }
        
    }
    
}
