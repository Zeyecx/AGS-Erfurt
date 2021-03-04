
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fdraeger
 */
public class Schreiben {

    ArrayList<String> ArrayList = new ArrayList<String>();

    public void schreiben() {
        try {
            //FileWriter fw = new FileWriter("C:\\Users\\fDraeger\\Documents\\NetBeansProjects\\Test\\Test.txt");
            // FileWriter fw = new FileWriter("Test.txt");
            //BufferedWriter bw = new BufferedWriter(fw);
            Path desktop = FileSystems.getDefault().getPath( System.getProperty("user.home") + "/Desktop");
            File textFile = new File(desktop.toString(), "IP-Adressen-Liste.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(textFile));
            for (int i = 0; i < ArrayList.size(); i++) {
                bw.write(String.valueOf(String.valueOf(ArrayList.get(i))));
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fehler beim Speichern", "Meldung", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<String> getArrayList() {
        return ArrayList;
    }

    public void setArrayList(ArrayList<String> ArrayList) {
        this.ArrayList = ArrayList;
    }

}
