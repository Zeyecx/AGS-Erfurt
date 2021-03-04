
/**
 *
 * @author Barthyr
 */

public class core {

    /* vars */
    private static double einkommen;
    private static double spende;

    /* fix for old Java Versions */
    public core() {
        einkommen = 0.0;
        spende = 0.0;
    }
    
    
    /* core */ 
    public double spende(double e){
        if(e<3000){
            return 0.01 * e;
        }else if(e>=3000 && e<50000){
            return 0.02 * e;
        }else if(e>= 5000){
            return 200;
        }else{
            return -1;
        }
        
    }
    
    
}

