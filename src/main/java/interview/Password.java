package interview;

import java.util.Random;

public class Password {

    public static String generatePassword() {
        Random random = new Random();

        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_=+?";

        String password = "";

        for (int i = 0; i < 5; i++) {
            password += letters.charAt(random.nextInt(letters.length()));
        }

        for (int i = 0; i < 4; i++) {
            password += digits.charAt(random.nextInt(digits.length()));
        }

        password += symbols.charAt(random.nextInt(symbols.length()));

        return password;
    }
}
