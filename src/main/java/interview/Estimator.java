package interview;

/**
 * Handles rounding rules for positive and negative numbers.
 */
public class Estimator {

    /*
     * Rounds a double to the nearest int.
     * Anything .5 or above rounds up.
     * Works for negatives too.
     */
    public static int round(double d) {
        // Math.round already does exactly what the assignment describes.
        return (int) Math.round(d);
    }
}
