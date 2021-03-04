
package brickbreaker;

public class Utils {

    private static final java.util.Random RANDOM = new java.util.Random();

    // Returns random integer number from 0 to max - 1
    public static int random(int max) {
        return (int) (RANDOM.nextDouble() * max);
    }

    // Returns sign of the value
    public static int sign(double n) {
        if (n == 0) {
            return 0;
        }
        if (n > 0) {
            return 1;
        } else {
            return -1;
        }
    }

}
