
package auto;
import java.util.*;

/**
 * @author Barthyr
 */

public class pkw {
    Scanner sc = new Scanner(System.in);
    
    private String modell = "";
    private int ages  = 0;
    private int mges = 0;
    private int bes = 0;
   
    public void set_default(){
        this.modell = "default";
        this.mges = 100;
        this.bes = 10;
        this.ages = 0;
    }
    
    public void user(){
        System.out.print("Bitte geben Sie ihr Wunschmodell ein: ");
        this.modell = sc.next();
        System.out.println("Bitte geben Sie ihre maximale Geschwindigkeit ein: ");
        this.mges = sc.nextInt();
        System.out.print("Bitte geben Sie ihre Beschleunigung ein: ");
        this.bes = sc.nextInt();
    }
    
    public int get_vmax(){
        return this.mges;
    }
    
    public int get_vakt(){
        return this.ages;
    }
    
    public void beschleunigen (){
        this.ages = this.mges;
    }
    
    public void bremsen (){
        this.ages = 0;
    }
    
    public int get_ges(){
        return this.ages;
    }
    
    public String get_auto(){
        return this.modell;
    }
    
    public void set_mges(int a){
        this.mges = a;
    }
}
