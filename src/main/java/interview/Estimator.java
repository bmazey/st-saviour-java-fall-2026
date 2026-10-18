package interview;

public class Estimator {

    public static int round(double d) {
        if (d < 0) {
            return (int) (d - 0.5);
        }

        return (int) (d + 0.5);
    }
}
