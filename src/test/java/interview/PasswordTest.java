package interview;
import java.util.Random;
import org.junit.jupiter.api.Test;

/*
 * TODO - BONUS +5 points!
 * 
 * Your test should cover the following cases:
 *   - Create a new password and ensure that the first 5 characters are letters.
 *   - Using the existing password, ensure that the next 4 characters are digits.
 *   - Using the existing password, ensure that the final character is a symbol.
 *   - Using the existing password, ensure that the length is 10.
 *   - Create two new passwords, and ensure that they are not equal.
 */
public class PasswordTest {

    @Test
    public void testPasswordComplexity() {
        // TODO Check password characters, digits, & symbols at specified positions.
        // HINT Java's Character class has rich support for classifying unicode symbols.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isLetter-char-
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Character.html#isDigit-char-
        assert true;
    }

    @Test
    public void testPasswordLength() {
        // TODO Ensure that generated password is of length 10.
        assert true;
    }

    @Test
    public void testPasswordUnique() {
        // TODO Create two passwords and ensure that they do not equal each other.
        // NOTE We overlook collisions for the purpose of this exercise.
        assert true;
    }

    public static String generatePassword() {
        
        Random random = new Random();

        String password = "";

        String letters = "abcdefghijklmnopqrstuvwxyz";

        int r = random.nextInt(letters.length());

        // Add the first random letter to the password.
        password += letters.charAt(r);

        // Add the second random letter to the password.
        r = random.nextInt(26);
        password += letters.charAt(r);

        // Add the third random letter to the password.
        r = random.nextInt(26);
        password += letters.charAt(r);

        // Add the fourth random letter to the password.
        r = random.nextInt(26);
        password += letters.charAt(r);

        // Add the fifth random letter to the password.
        r = random.nextInt(26);
        password += letters.charAt(r);

        String digits = "0123456789";

        // Add the first random digit to the password.
        r = random.nextInt(10);
        password += digits.charAt(r);

        // Add the second random digit to the password.
        r = random.nextInt(10);
        password += digits.charAt(r);

        // Add the third random digit to the password.
        r = random.nextInt(10);
        password += digits.charAt(r);

        // Add the fourth random digit to the password.
        r = random.nextInt(10);
        password += digits.charAt(r);

        String symbols = "!@#$%^&*";

        // Add the symbol as the final password character.
        r = random.nextInt(symbols.length());
        password += symbols.charAt(r);

        return password;
    }

    }


