import java.util.ArrayList;

public class KontaktSteuerung {
    ArrayList<Kontakte> list=new ArrayList<Kontakte>();
   
    public void uebernehmen(String n, String v, String t, String e){
        Kontakte ko=new Kontakte(n,v,t,e);
        list.add(ko);
    }
}
