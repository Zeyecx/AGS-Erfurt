
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Skopp, Jonathan
 */
public class lesen {

    ArrayList<String> User = new ArrayList<>();

    public void Lesen() {
        try {
            User.removeAll(User);
            Path desktop = FileSystems.getDefault().getPath(System.getProperty("user.home") + "/Desktop");
            File textFile = new File(desktop.toString(), "Schüler.txt");
            FileReader fr = new FileReader(textFile);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                User.add(line);
            }
            Collections.sort(User);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<String> getUser() {
        return User;
    }

}
