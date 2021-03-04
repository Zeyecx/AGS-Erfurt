
package mein.Autokauf;

/**
 * @author Hartung
 */

import java.util.ArrayList;


public class Verwaltung {
    private final ArrayList<Gebrauchtwagen> gAuto=new ArrayList<>();
    
    public void aufnahmeAuto(String typ,String modell, double preis, int jahr){
    gAuto.add(new Gebrauchtwagen(typ,modell,preis,jahr));
    
   }
}
