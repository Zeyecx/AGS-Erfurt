package physikexperiment;

/**
 * @author Barthyr
 */
public class TExperiment {

    protected String zGebiet;
    protected String TDate;
    protected byte Notenpunkte;

    public TExperiment(String zGebiet, String TDate, byte Notenpunkte) {
        this.zGebiet = zGebiet;
        this.TDate = TDate;
        this.Notenpunkte = Notenpunkte;
    }

    public int getNotenpunkte() {
        return Notenpunkte;
    }
}
