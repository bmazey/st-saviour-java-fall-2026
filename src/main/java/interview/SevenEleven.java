package interview;

public class SevenEleven {
    
    /*
     * The shop() method accepts an int 'price' and returns a String.
     *   - If the price is a multiple of 7 the result String should be "seven".
     *   - If the price is a multiple of 11 the result String should be "eleven".
     *   - If the price is a multiple of 7 AND 11 the result String should be "seveneleven"
     *   - If the price is NOT a multiple of either 7 OR 11 the result String should be "".
     */
    public static String shop(int price) {
        // TODO 

        // Use if statements and modulo to figure out if a value is a mutiple of 7 or 11
        if (price % 7 == 0 && price % 11 == 0) {
            return "seveneleven"; 
        }
        //&& means both statements have to be true. 
        if (price % 7 == 0)
            return "seven"; 
    
        if (price % 11 == 0 ) 
            return "eleven";  

        return "";
    }
}
