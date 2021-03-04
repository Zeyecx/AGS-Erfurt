package grundrechnen;
import java.util.*;

/**
 * @author Barthyr
 */


public class calc {
    Scanner sc = new Scanner(System.in);

    /* load Setter und getter */ 
         var v = new var();
    
    // Addition
    public void addition(Double x, Double y){
        v.set_result(x+y);
        System.out.println(x+" + "+y+" = "+v.get_result());
    }
    
    // Division
    public void division(Double x, Double y){
        if(y!=0){
            v.set_result(x/y);    
            System.out.println(x+" / "+y+" = "+v.get_result());
        }else{
            v.set_result(-1.0);
            System.out.println("Sie können nicht durch 0 teilen. Das kann nur ich. ");
            System.exit(0);
        }
    }
    
    // Subtraktion
    public void subtraktion(Double x, Double y){
        v.set_result(x-y);
        System.out.println(x+" - "+y+" = "+v.get_result());
    }
    
    // Multplikation
    public void multiplikation(Double x, Double y){
        v.set_result(x*y);
        System.out.println(x+" * "+y+" = "+v.get_result());
    }
    
}
