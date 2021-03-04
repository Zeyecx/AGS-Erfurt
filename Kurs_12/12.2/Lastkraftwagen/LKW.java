

package lastkraftwagen;
import javax.swing.JOptionPane;

/**
 * @author Barthyr
 */

public class LKW {
    private double gewicht;
    private double maxgewicht;
    private final String[] typ = {"Laden", "Entladen", "Programm beenden"}; 
    public int c = JOptionPane.showOptionDialog(null, 
                     "Möchtn Sie das Programm neustarten ? ", 
                     "- Neustart- ", 

                     JOptionPane.DEFAULT_OPTION, 
                     JOptionPane.INFORMATION_MESSAGE, 
                     null, typ, typ[0]);

    
    // Konstruktor
    public LKW (){
        this.gewicht = 0.0;
        this.maxgewicht = 0.0;
    }
    
    
// SETTER

    public void set_gewicht(double n_gewicht){
        this.gewicht = n_gewicht;
    }
    
    public void set_maxgewicht(double n_max_gewicht){
        this.maxgewicht = n_max_gewicht;
    }
    
 
 //Getter
    public double get_gewicht(){
        return this.gewicht;
    }
    
    public double get_maxgewicht(){
        return this.maxgewicht;
    }
    
    
// irgend ein anderer Blödsinn ;) 
    
    public void laden(Double masse){
        if(masse+get_gewicht()>=this.maxgewicht){
            System.out.println("Nope");
        }else{
            this.gewicht = get_gewicht() + masse;
        }
    }
    
    
    public void entladen(Double masse){
        if(get_gewicht() - masse >= 0){
            this.gewicht = this.maxgewicht - masse;
            System.out.print("Entladen erfolgreich abgeschlossen. \nNeue Masse:  ");
        }else{
            System.out.print("Entladen fehgeschlagen");
        }
    }



// eigentlich Braucht man das hier nicht aber für Josef
    public void auswahl(){
        if(c == 0) {
            laden(Double.parseDouble(JOptionPane.showInputDialog("Wie viel wollen Sie laden? :"))); 
        }else if(c == 1){
            entladen(Double.parseDouble(JOptionPane.showInputDialog("Wie viel wollen Sie entladen?: ")));
        }else if (c == 2){
            System.exit(0);
        }else{
            // JOpitionPane.showMessageDialog(null, "Sie sind für das Programm zu boosted");
            System.exit(0);
        }
    }



// FÜRS HPI
    public void run(){
        do{
            auswahl();
        }while(true);
 }

}