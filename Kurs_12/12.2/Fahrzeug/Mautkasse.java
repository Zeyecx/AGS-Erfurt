package fahrzeug;

/**
 * @author Barthyr
 */

public class Mautkasse {
    
    // Die Variablen auf private zu setzen ist einfach nur dumm ;) 
    private int anz = 0;
    private double kitty = 0.0;
        
    /* Setter */
    
    public void set_anz(int a){
        this.anz = a;
    }
    
    public void set_kitty(double a){
        this.kitty = a;
    }
    
    /* Getter */
    
    public int get_anz(){
        return anz;
    }
    
    public double get_kitty(){
        return kitty;
    }
    
    /* Task Method */
    
    public void Bezfahrzeug(){
        anz++;
        kitty++;
    }
    
    public void NBezfahrzeug(){
        anz++;  
    }
    
    /* Konstrucktoren */

    public void set_null(){
        set_anz(0);
        set_kitty(0.0);
    }
}
