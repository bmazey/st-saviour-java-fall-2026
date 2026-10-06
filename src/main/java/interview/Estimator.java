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
        // Decimal value must come from original value. 
        double decimal = d - (int)d; 

        if (decimal >= 0.5) {
            int rounded = (int)d + 1;
            return rounded;  
        } 

        // Negatives numbers needed to be round up needs to be accounted for. 
        if (decimal <= -0.5 && d < 0){
            int rounded = (int)d - 1; 
            return rounded; 
        }
        //Round down by not adding 1. 
        if (decimal < 0.5 && d > 0) {
            int rounded = (int)d; 
            return rounded; 
        }
        // Round down for negative numbers. 
        if (decimal > -0.5 && d < 0) {
            int rounded = (int)d; 
            return rounded;
        }
        return 0;
    }
}
