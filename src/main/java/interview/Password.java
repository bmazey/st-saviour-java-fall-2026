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
        // TODO
        // HINT You will have to use a bounded random number generator for this method.
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt-int-

        // HINT Using the charAt() method is a great technique for pulling chars from a String.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-

        Random random = new Random();

        String password = "";

        String letters = "abcdefghijklmnopqrstuvwxyz";

        int r = random.nextInt(26);

        //Add first random letter to the password
        password += letters.charAt(r);

        // Add the second random letter to the password
        r = random.nextInt(26);
        password += letters.charAt(r);

        // Add the third random letter to the password.
        r = random.nextInt(26);
        password += letters.charAt(r);

        // Add the forth random letter to the password.
        r = random.nextInt(26);
        password += letters.charAt(r);

        // Add the fifth random letter to the password. 
        r = random.nextInt(26);
        password += letters.charAt(r);

        String digits = "0123456789";
        int t = random.nextInt(10);

        // Add first digit to the password
        password += digits.charAt(t);

        // Add second digit to the password
        t = random.nextInt(10);
        password += digits.charAt(t);

        // Add third digit to the password
        t = random.nextInt(10);
        password += digits.charAt(t);

        // Add forth digit to the password
        t = random.nextInt(10);
        password += digits.charAt(t);
//FIX LATTTER 
        String symbol = "!@#$%^&*";
        int s = random.nextInt(8);

        // Add first symbol to the password
        password += symbol.charAt(s);

        return password;
    }
}
