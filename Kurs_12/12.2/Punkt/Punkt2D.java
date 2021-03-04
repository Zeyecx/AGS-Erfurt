
package punkt;

/**
 * @author Barthyr
 */

public final class Punkt2D {
    
    // var
    private int x;
    private int y;
    
    
    // Konst
    public Punkt2D(){
        // die Festlegung auf 0 ist nur auf <8 Java Versionen notwendig.
        this.x = 0;
        this.y = 0;
    }
    
    /**
     * @param xx as private int 
     * @param yy as private int
     */
    
    public Punkt2D(int xx, int yy){
        if(check()){
            this.x = xx;
            this.y = yy;
        }else{
            System.out.println("Bereichsfehler");
        }
    }
    
    // Meth
    
    public boolean check() {
        return x<=10 && x>=-10 && y<=10 && y>=-10;
    }
    
    public void move(int xx, int yy){
        // vgl. Konstruktor
        if(check()){
            this.x = xx;
            this.y = yy;
        }else{
            System.out.println("Bereichsfehler");
        }
    }
    
   public void print(){
       System.out.println("Der Punkt x liegt bei: "+this.x+".\tDer Punkt y liegt bei: "+y);
   }
    
}
