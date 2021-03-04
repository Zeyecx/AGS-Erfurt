package decoder;

import java.util.Vector;

/**
 * Runnable Interface
 *
 * @args Strings of file names
 * @author Synizcx
 * 
 */

public interface RunnableInterface {

    /**
     * Start der Verarbeitung
     *
     * @param args Dateinames als Strings
     */
    public void run(Vector<String> args);
}
