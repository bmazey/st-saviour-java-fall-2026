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
        // Get the decimal value from the original above.  
        // We have to round d up. 
        // int rounded = (int)d +1;
        // int rounded = (int)d;
        // return rounded; 
        double decimal = d - (int)d;

        // round up for negatives 
        // if (decimal < 0.5 && d < 0){
        // return (int)d;
        //}
        if (decimal >= 0.5) {
            return (int)d + 1;
            } 
            // if (decial < 0.5 && d >= 0)
            // Round down 
        if (decimal <= -0.5) {
            return (int)d - 1;
            } else {
            return (int)d;
             }
             // Handle negative number round down 
        // if (decimal > -0.5 && d < 0) bracket
        // int rounded = (int)d -1;
       // bracket
        // return 0; 




    }
}
