

package lastkraftwagen;

import javax.swing.JOptionPane;

 /**
 * @since 2017/04/2017
 * @author Barthyr
 */

public class Lastkraftwagen {
    
    
    
 
    public static void main(String[] args) {
        LKW lkw = new LKW();
        Double a = Double.parseDouble(JOptionPane.showInputDialog("Wie viel wollen Sie laden? :"));
        lkw.set_maxgewicht(a);
        lkw.run();
        
        }
    
}
