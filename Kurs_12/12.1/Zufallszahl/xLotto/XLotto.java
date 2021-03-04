
package xlotto;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author JSkopp
 */
    
public class XLotto {

   
    
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        
        /* Random Block */ 
        Random rn = new Random();
        int maximum = 49;
        int minimum = 1;
         
        /* Vars*/
        int loggerkey = 0;
        boolean[] neu = {true, false};
        int[] user = new int[8];
        int[] sys = new int[8];
        int count = 0;
        int right = 0;
    
        
        for(count = 0;  count < user.length; count++){do{
        user[count] = Integer.parseInt(JOptionPane.showInputDialog("Bitte eine Zahl von 1 bis 49 eingeben: ("+(count+1)+")"));
        }while(user[count] >= 1 && user[count] <= 49);
        }
        
        for(count = 0;  count < user.length; count++){
            sys[count] =  minimum + rn.nextInt() % (maximum - minimum + 1);
        }  
        
         right = 0; // sonst gibts beim 2ten Durchgang gleich mal 16 Richtige :D
        for(count = 0; user.length != count; count++){
            if(sys[count] == user[count]){
                right++;
            }
            
        JOptionPane.showMessageDialog(null, "Sie haben "+right+" Richtige");    
            
        
        
    }
    
 }
}
    
