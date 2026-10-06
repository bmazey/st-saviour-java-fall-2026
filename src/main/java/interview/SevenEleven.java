package interview;

public class SevenEleven {

    public static String shop(int number) {
        // If it's a multiple of both 7 and 11
        if (number % 7 == 0 && number % 11 == 0) {
            return "seveneleven";
        }
        // If it's only a multiple of 7
        if (number % 7 == 0) {
            return "seven";
        }
        // If it's only a multiple of 11
        if (number % 11 == 0) {
            return "eleven";
        }
        // Otherwise, return a blank string
        return "";
    }
}
