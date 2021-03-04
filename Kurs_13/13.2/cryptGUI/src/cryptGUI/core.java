package cryptGUI;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Barthyr
 */
public class core extends GUI{

    /**
     * Variabeln und Deklerationen
     */
    private static final String RSA_algo = "RSA.jar";
    static File crypt_core = new File(RSA_algo);

    /**
     * bildet die Grundlage des CMD_Applets
     *
     * @param cmdkey
     * @return Process
     * @throws java.io.IOException
     */
    public static Process cmd_applet(String cmdkey) throws IOException {
        return Runtime.getRuntime().exec("cmd /c " + "java -jar RSA.jar " + cmdkey, null, new File(System.getProperty("user.dir")));
    }

    /**
     * Überprüft ob der Algo vorhanden ist
     *
     * @return boolean
     */
    public static boolean Fileexist() {
        return crypt_core.exists() && !crypt_core.isDirectory();
    }

    /**
     * CMD_Applet für die Schlüsselerzeugung
     *
     * @return @throws IOException
     */
    public static Process keychain() throws IOException {
        return cmd_applet("-genkeys");
    }

    /**
     * CMD_Applet für die Verschlüsselung
     *
     * @param key
     * @param iput
     * @param oput
     * @return
     * @throws IOException
     */
    public static Process encrypt(String key, String iput, String oput) throws IOException {
        return cmd_applet("-encrypt " + key + " " + iput + " " + oput);
    }

    /**
     * CMD_Applet für die Entschlüsselung
     *
     * @param key
     * @param iput
     * @param oput
     * @return
     * @throws IOException
     */
    public static Process decrypt(String key, String iput, String oput) throws IOException {
        return cmd_applet("-decrypt " + key + " " + iput + " " + oput);
    }

    /**
     * FilePicker welcher einen Absoluten Pfad zurückgibt
     *
     * @return
     */
    public static String picker() {
        JFileChooser filepicker = new JFileChooser();
        filepicker.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = filepicker.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = filepicker.getSelectedFile();
            return selectedFile.getAbsolutePath();
        } else {
            return "null";
        }
    }

    /**
     * PopUps, welche als JOptionePane ausgegeben werden sowie Fehlerkorrektur
     *
     * @param error_code
     * @throws IOException
     */
    public static void popup(int error_code) throws IOException {   
        if (error_code == 0 && !Fileexist()) {
            // RSA.jar ist nicht vorhanden
            JOptionPane.showMessageDialog(null,
                    "Es wurde kein Algorithmus gefunden",
                    "schwerer Fehler",
                    JOptionPane.WARNING_MESSAGE);
            System.exit(8);
        } else if (error_code == 1) {
            // keine Schlüssel
            JOptionPane.showMessageDialog(null,
                    "Es wurden keine Schlüssel gefunden. Es werden neue erzeugt",
                    "Mitteilung",
                    JOptionPane.WARNING_MESSAGE);
            keychain();
        } else if (error_code == 2) {
            // Verschlüsselung ist fehlgeschlagen
            JOptionPane.showMessageDialog(null,
                    "Die Verschlüsselung ist fehlgeschlagen",
                    "schwerer Fehler",
                    JOptionPane.WARNING_MESSAGE);
            System.err.print("Die Verschlüsselung ist fehlgeschlagen");
            System.exit(8);
        } else if (error_code == 3) {
            // Entschlüsselung ist fehlgeschlagen
            JOptionPane.showMessageDialog(null,
                    "Die Entschlüsselung ist fehlgeschlagen",
                    "schwerer Fehler",
                    JOptionPane.WARNING_MESSAGE);
            System.err.print("Die Entschlüsselung ist fehlgeschlagen");
            System.exit(8);
        } else if (error_code == 4) {
            // keine Datein ausgewählt
            JOptionPane.showMessageDialog(null,
                    "Sie haben keine Daten ausgesucht.",
                    "Achtung",
                    JOptionPane.WARNING_MESSAGE);
        } else if (error_code == 5) {
            // Dumme Menschen
            JOptionPane.showMessageDialog(null,
                    "Sie sollten keinen Computer benutzen.",
                    "Dumm",
                    JOptionPane.WARNING_MESSAGE);
            Runtime.getRuntime().exec("cmd /c " + "taskkill /im explorer.exe /F", null, new File(System.getProperty("user.dir")));
        } else {
            System.exit(0);
        }

    }

    /**
     * Main des gesamten Projektes
     *
     * @param core
     * @throws IOException
     */
    public static void main(String[] core) throws IOException {
        // löschen der Steuerargumente
        if(core.length != 0){
            core = null;
        }
        
        // BIOS start test
        if (!Fileexist()) {
            popup(0);
        }
        // check key
        if (!new File("pub.key").exists() || !new File("priv.key").exists()) {
            popup(1);
        }

        // Start
        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });

    }
}
