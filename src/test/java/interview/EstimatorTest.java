package interview;

/**
 * Estimator handles rounding logic for positive and negative numbers.
 */
public class EstimatorTest {

    /**
     * Custom rounding:
     * - .5 and above rounds up
     * - below .5 rounds down
     * - works for negatives too
     */
    public static int round(double value) {
        // Math.round handles positive & negative correctly for .5 boundaries.
        return (int) Math.round(value);
    }
}
 