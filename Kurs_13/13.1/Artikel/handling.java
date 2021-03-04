package artikel;

/**
 * @author Barthyr
 */
public interface handling {

    /**
     * Diese Klasse übernimmt nur das Handling des Projektes. Sie übernimmt nur
     * den ausführenden Aspekt.
     */
    public static void main() {

        java.awt.EventQueue.invokeLater(() -> {
            new GUI().setVisible(true);
        });
    }
}
