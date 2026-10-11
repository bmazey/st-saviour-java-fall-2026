package interview;

import org.junit.jupiter.api.Test;

public class SevenElevenTest {

    @Test
    public void testShop() {
        // Should get a blank string when not a multiple of 7 or 11.
        assert SevenEleven.shop(3) == "";
        assert SevenEleven.shop(5) == "";

        // Should get the string "seven" when a multiple of 7.
        assert SevenEleven.shop(7).equals("seven");
        assert SevenEleven.shop(14).equals("seven");

        // Should get the string "eleven" when a multiple of 11.
        assert SevenEleven.shop(11).equals("eleven");
        assert SevenEleven.shop(22).equals("eleven");

        // Should get the string "seveneleven" when a multiple of 7 and 11.
        assert SevenEleven.shop(77).equals("seveneleven");
        assert SevenEleven.shop(154).equals("seveneleven");

         int number = 7;
if (number % 77 == 0) {
    System.out.println("SevenEleven");
} else {if (number % 7 == 0) {
    System.out.println("Seven");
} else {if (number % 11 == 0) {
    System.out.println("Eleven");
} else { System.out.println("None");
}}}}}
    }
}
