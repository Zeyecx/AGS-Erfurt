
package grundrechnen;

/**
 * @author Barthyr
 */

public class var {

    private double value1; 
    private double value2;
    private double result;
    
    
    public var(){}; //Konstruktor
    
    // Setter
    
    public void set_value1(Double x){
        this.value1 = x;
    }
    
    public void set_result(Double x){
        this.result = x;
    }
    
    public void set_value2(Double x){
        this.value2 = x;
    }
    
    
    // Getter
    
    public double get_value1(){
        return this.value1;
    }
    
    public double get_value2(){
        return this.value2;
    }
    
    public double get_result(){
        return this.result;
    }
    
    
    
            
    
}
