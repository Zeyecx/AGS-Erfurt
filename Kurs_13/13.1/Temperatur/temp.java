
import java.util.Vector;

/**
 * @author Barthyr
 */

public class temp {

    protected final Vector<Double> vec = new Vector<>(0);
    
    public void Celsius_in_Fahrenheit(String data){
        double d = Double.parseDouble(data);
        vec.add(0, (double) (d * 1.8 + 32));
    }
    
    public void Fahrenheit_in_Celsius(String data){
        double d = Double.parseDouble(data);
            vec.add(0, (double) ((d - 32) * 5 / 9));
    }
    
    public String ausgabe(int flag) {
        return Double.toString(vec.get(flag));
    }
}

/**
 * TODO: - über flags nachdenken - Factory erstellen
 */
