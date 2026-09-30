package interview;

import java.util.Random;

public class Password {

    private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*?-_+=<>";

    private static final Random random = new Random();

    /*
     * The generatePassword() method accepts no arguments and returns a String with the following characteristics:
     *  - The first 5 characters are letters.
     *  - The next 4 characters are digits.
     *  - The final character is a symbol.
     *  - The length of the String is 10.
     *  - It's relatively unlikely that two generated Strings are the same.
     */
    public static String generatePassword() {
        StringBuilder sb = new StringBuilder(10);

        // 1. First 5 characters are letters
        for (int i = 0; i < 5; i++) {
            sb.append(LETTERS.charAt(random.nextInt(LETTERS.length())));
        }

        // 2. Next 4 characters are digits
        for (int i = 0; i < 4; i++) {
            sb.append(DIGITS.charAt(random.nextInt(DIGITS.length())));
        }

        // 3. Final character is a symbol
        sb.append(SYMBOLS.charAt(random.nextInt(SYMBOLS.length())));

        return sb.toString();
    }
}
