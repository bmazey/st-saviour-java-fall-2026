package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EstimatorTest {

    @Test
    public void testRoundPositives() {
        // .5 and above rounds up (away from zero)
        assertEquals(2, Estimator.round(1.5), "1.5 should round up to 2");
        assertEquals(2, Estimator.round(1.6), "1.6 should round up to 2");
        assertEquals(3, Estimator.round(2.5), "2.5 should round up to 3");
        
        // Below .5 rounds down
        assertEquals(1, Estimator.round(1.4), "1.4 should round down to 1");
    }

    @Test
    public void testRoundNegatives() {
        // .5 and above rounds away from zero (down)
        assertEquals(-2, Estimator.round(-1.5), "-1.5 should round away from zero to -2");
        assertEquals(-2, Estimator.round(-1.6), "-1.6 should round away from zero to -2");
        assertEquals(-3, Estimator.round(-2.5), "-2.5 should round away from zero to -3");
        
        // Below .5 rounds toward zero (up)
        assertEquals(-1, Estimator.round(-1.4), "-1.4 should round toward zero to -1");
    }

    @Test
    public void testSpecialCases() {
        // Test edge cases handled by your code: NaN, Max, and Min values
        assertEquals(0, Estimator.round(Double.NaN), "NaN should return 0");
        assertEquals(Integer.MAX_VALUE, Estimator.round(Integer.MAX_VALUE), "Max value boundary check");
        assertEquals(Integer.MIN_VALUE, Estimator.round(Integer.MIN_VALUE), "Min value boundary check");
    }
}
