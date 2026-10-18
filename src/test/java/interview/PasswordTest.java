package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordTest {

    @Test
    public void testPasswordComplexity() {
        String password = Password.generatePassword();

        for (int i = 0; i < 5; i++) {
            assertTrue(Character.isLetter(password.charAt(i)));
        }

        for (int i = 5; i < 9; i++) {
            assertTrue(Character.isDigit(password.charAt(i)));
        }

        assertFalse(Character.isLetterOrDigit(password.charAt(9)));
    }

    @Test
    public void testPasswordLength() {
        String password = Password.generatePassword();

        assertEquals(10, password.length());
    }

    @Test
    public void testPasswordUnique() {
        String password1 = Password.generatePassword();
        String password2 = Password.generatePassword();

        assertNotEquals(password1, password2);
    }
}
