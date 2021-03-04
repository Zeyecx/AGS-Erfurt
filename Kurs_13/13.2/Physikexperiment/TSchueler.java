package physikexperiment;

import java.util.ArrayList;

/**
 * @author Barthyr
 */
public class TSchueler {

    protected String zName;
    protected String zVorname;
    protected ArrayList<Integer> Schuelerliste;

    public TSchueler(String zName, String zVorname) {
        this.zName = zName;
        this.zVorname = zVorname;
        this.Schuelerliste = new ArrayList<>();
    }

    public void setExperiment(byte index, String Gebiet, String Datum, byte Notenpunkt) {
        TExperiment TExperiment = new TExperiment(Gebiet, Datum, Notenpunkt);
    }
    
    public boolean AlleExperimenteDurchgefuehrt(){
        return false;
    }

    public double Durchschnittsnote(){
        
        if(AlleExperimenteDurchgefuehrt()){
            return 1.0;
        }else{
            return 6.0;
        }
    }
}
