package addition;

/**
 * @author bg15dv-jskopp
 */

public class add {

    private double z1 = 0;
    private double z2 = 0;
    private double sum = 0;
    
    
    
    // Setter 
    
    public void set_z1 (double z1){
        this.z1 = z1;
    }
    
    public void set_z2 (double z2){
        this.z2 = z2;
    }
    
    public void set_sum (double sum){
        this.sum = sum;
    }
    
    
    // Getter 
    
    public double get_z1(){
        return z1;
    }
    
    public double get_z2(){
        return z2;
    }
    
    public double get_sum(){
        return sum;
    }
    
    // Setter - calc
        public void set_sum_calc(boolean calc){
           if(calc){
               this.sum = z1 + z2;
           }
        }

}
