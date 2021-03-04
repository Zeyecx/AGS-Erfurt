
package leistungskontrolle;

// import static leistungskontrolle.Leistungskontrolle.sRabattTab;

/**
 *
 * @author JSkopp
 */

public class RabattQ implements RabattQIf {

    
    static final public double sRabattTab[] = {
        0.15, 0.1, 0.05, 0.17, 0.19 // Die anderen Werte dienen nur der Ergänzung der Liste :D 
    };
    public double getRabattOfCustomerId(int id){
          // TODO: use Map or Sritch/Case
        return sRabattTab[id];
        
    };
     
    public double getBooelanReset(int id){
          // TODO: use Map or Sritch/Case
        return id;
        
    };
    
    static final public boolean getBooelanReset[] = {
        true, false
    };
}
