package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SevenElevenTest {

    @Test
    public void testShop() {
        // Return blank string for non-multiples
        assertEquals("", SevenEleven.shop(3), "3 is not a multiple of 7 or 11");
        assertEquals("", SevenEleven.shop(5), "5 is not a multiple of 7 or 11");

        // Should get the string "seven" when a multiple of 7
        assertEquals("seven", SevenEleven.shop(7), "7 should return 'seven'");
        assertEquals("seven", SevenEleven.shop(14), "14 should return 'seven'");

        // Should get the string "eleven" when a multiple of 11
        assertEquals("eleven", SevenEleven.shop(11), "11 should return 'eleven'");
        assertEquals("eleven", SevenEleven.shop(22), "22 should return 'eleven'");

        // Should get the string "seveneleven" when a multiple of both 7 and 11
        assertEquals("seveneleven", SevenEleven.shop(77), "77 should return 'seveneleven'");
        assertEquals("seveneleven", SevenEleven.shop(154), "154 should return 'seveneleven'");
    }
}
