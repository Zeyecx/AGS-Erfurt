
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fdraeger
 */
public class IPS {

    private ArrayList<IPA> IPAdressen = new ArrayList<>();
    private String IP, SM;

    public void add(String Raum, String Bezeichnung, String ip1, String ip2, String ip3, String ip4, String sm1, String sm2, String sm3, String sm4) {
        IP = ip1 + "." + ip2 + "." + ip3 + "." + ip4;
        SM = sm1 + "." + sm2 + "." + sm3 + "." + sm4;
        IPAdressen.add(new IPA(IP,SM));
    }

    public ArrayList<IPA> getIPAdressen() {
        return IPAdressen;
    }
   
}
