package interview;

public class Estimator {
    
    /*
     * The round() method accepts a double d and returns an int.
     * The resulting integer should be rounded up when the decimal is >= .5
     * Negative numbers should also be rounded up, but the result should remain negative.
     *  - ex:  1.2 -> 1
     *  - ex: -3.6 -> -4
     */
    public static int round(double d) {
        // TODO

        // Start by getting the decimal value from the original double.
        double decimal = d - (int)d;

        // Handle the case where we round up.
        if (decimal >= 0.5) {
            int rounded = (int)d + 1;
            return rounded;
        }

        // Handle the case where we round down.
        if (decimal < 0.5 && d >= 0) {
            int rounded = (int)d;
            return rounded;
        }

        // Handle negative number round up
        if (decimal <= -0.5 && d < 0) {
            int rounded = (int)d - 1;
            return rounded;
        }

        // Handle the round down for negatives.
        if (decimal > -0.5 && d < 0) {
            return (int)d;
        }

        return 0;
    }
}
