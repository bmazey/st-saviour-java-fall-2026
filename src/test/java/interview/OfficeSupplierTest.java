package interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OfficeSupplierTest {
    
    @Test
    public void testOfficeShredder() {
        // Test shredFirstCharacter
        assertEquals("ichael", OfficeSupplier.shredFirstCharacter("Michael"), "Should remove the first character");
        assertEquals("am", OfficeSupplier.shredFirstCharacter("Pam"), "Should remove the first character");

        // Test shredLastCharacter
        assertEquals("Dwigh", OfficeSupplier.shredLastCharacter("Dwight"), "Should remove the last character");
        assertEquals("Ji", OfficeSupplier.shredLastCharacter("Jim"), "Should remove the last character");
        
        // Edge cases
        assertNull(OfficeSupplier.shredFirstCharacter(null), "Null input should return null");
        assertEquals("", OfficeSupplier.shredFirstCharacter(""), "Empty input should return empty string");
    }

    @Test
    public void testOfficeStapler() {
        // Test stapleToBeginning
        assertEquals("Angela", OfficeSupplier.stapleToBeginning("ngela", 'A'), "Should add character to front");
        assertEquals("Stanley", OfficeSupplier.stapleToBeginning("tanley", 'S'), "Should add character to front");

        // Test stapleToEnd
        assertEquals("Kelly", OfficeSupplier.stapleToEnd("Kell", 'y'), "Should add character to end");
        assertEquals("Meredith", OfficeSupplier.stapleToEnd("Meredit", 'h'), "Should add character to end");
        
        // Edge case
        assertEquals("A", OfficeSupplier.stapleToBeginning(null, 'A'), "Null string should return just the character");
    }
}
