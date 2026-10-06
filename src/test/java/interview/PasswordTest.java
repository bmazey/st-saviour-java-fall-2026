package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
        // Generate a new password
        String pwd = Password.generatePassword();
        
        // 1. Ensure that the first 5 characters are letters
        for (int i = 0; i < 5; i++) {
            assertTrue(Character.isLetter(pwd.charAt(i)), "Character at index " + i + " should be a letter");
        }
        
        // 2. Ensure that the next 4 characters are digits
        for (int i = 5; i < 9; i++) {
            assertTrue(Character.isDigit(pwd.charAt(i)), "Character at index " + i + " should be a digit");
        }
        
        // 3. Ensure that the final character is a symbol
        // Since it's neither a letter nor a digit, we can verify it by checking that both are false
        char finalChar = pwd.charAt(9);
        assertFalse(Character.isLetter(finalChar), "Final character should not be a letter");
        assertFalse(Character.isDigit(finalChar), "Final character should not be a digit");
    }

    @Test
    public void testPasswordLength() {
        // Generate a password and ensure its length is exactly 10
        String pwd = Password.generatePassword();
        assertEquals(10, pwd.length(), "Password length should be exactly 10");
    }

    @Test
    public void testPasswordUnique() {
        // Create two passwords and ensure that they do not equal each other
        String pwd1 = Password.generatePassword();
        String pwd2 = Password.generatePassword();
        assertNotEquals(pwd1, pwd2, "Two sequentially generated passwords should not be identical");
    }
}
