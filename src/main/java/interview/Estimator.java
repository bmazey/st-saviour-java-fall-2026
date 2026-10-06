package interview;

/**
 * Handles rounding rules for positive and negative numbers.
 */
public class Estimator {

    /*
     * Rounds a double to the nearest int.
     * Anything .5 or above rounds up (away from zero).
     * Works for negatives too.
     * Examples: 1.5 -> 2, -1.5 -> -2, -1.4 -> -1
     */
    public static int round(double d) {
        if (Double.isNaN(d)) {
            return 0;
        }
        if (d >= (double) Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (d <= (double) Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if (d >= 0) {
            return (int) Math.floor(d + 0.5);
        } else {
            return (int) Math.ceil(d - 0.5);
        }
    }

    // Makes it runnable for testing
    public static void main(String[] args) {
        double[] tests = {1.4, 1.5, 1.6, -1.4, -1.5, -1.6, -0.5, 0.5, 2.5, -2.5};
        for (double t : tests) {
            System.out.println(t + " -> " + round(t));
        }
    }
}
