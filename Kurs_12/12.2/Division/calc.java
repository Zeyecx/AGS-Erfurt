
package division;

/**
 * @author bg15dv-jskopp
 * @version 1.0 
 */

public class calc {
    private double z1 = 0.0;
    private double z2 = 0.0;
    private double div = 0.0;
    
    /* Setter */
    public void set_z1(Double z1){
            this.z1 = z1;
    }
    
    public void set_z2(Double z2){
            this.z2 = z2;
    }
    
    public void set_div(Double div){
            this.div = div;
    }
    
    /* Getter Block */
    
    public double get_z1(){
            return z1;
    }
   
    public double get_z2(){
            return z2;
    }
    
    public double get_div(){
            return div;
    }
    
    /* Sinnloser Scheiß */
    
    public double teilen(Double z1, Double z2){
        try{
            return z1/z2;
        }catch(ArithmeticException e){
            return 0.0;
        }
    }
      
 }
