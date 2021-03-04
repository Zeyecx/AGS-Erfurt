
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fdraeger
 */
public class Lesen {
        ArrayList<String> ArrayList = new ArrayList<String>();
    public void lesen(){ 
    try {
        ArrayList.removeAll(ArrayList);
            Path desktop = FileSystems.getDefault().getPath( System.getProperty("user.home") + "/Desktop");
            File textFile = new File(desktop.toString(), "IP-Adressen-Liste.txt");
            FileReader fr = new FileReader(textFile);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                ArrayList.add(String.valueOf(line)+"\n");
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> getArrayList() {
        return ArrayList;
    }

    public void setArrayList(ArrayList<String> ArrayList) {
        this.ArrayList = ArrayList;
    }
    
}
