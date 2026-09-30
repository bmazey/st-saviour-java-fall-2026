package interview;

import java.util.Random;

public class Password {

    
    /*
     * The generatePassword() method accepts no arguments and returns a String with the following characteristics:
     *  - The first 5 characters are letters.
     *  - The next 4 characters are digits.
     *  - The final character is a symbol.
     *  - The length of the String is 10.
     *  - It's relatively unlikely that two generated Strings are the same.
     */
    public static String generatePassword() {
        Random random = new Random();

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*?-_+=<>";

        StringBuilder sb = new StringBuilder(10);

        // 1. First 5 are letters
        for (int i = 0; i < 5; i++) {
            sb.append(letters.charAt(random.nextInt(letters.length())));
        }

        // 2. Next 4 are digits
        for (int i = 0; i < 4; i++) {
            sb.append(digits.charAt(random.nextInt(digits.length())));
        }

        // 3. Last 1 is a symbol
        sb.append(symbols.charAt(random.nextInt(symbols.length())));

        return sb.toString();
    }
}
