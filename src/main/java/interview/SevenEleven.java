package interview;

public class SevenEleven {

    public static String shop(int price) {
        if (price % 7 == 0 && price % 11 == 0) {
            return "seveneleven";
        }

        if (price % 7 == 0) {
            return "seven";
        }

        if (price % 11 == 0) {
            return "eleven";
        }

        return "";
    }
}
