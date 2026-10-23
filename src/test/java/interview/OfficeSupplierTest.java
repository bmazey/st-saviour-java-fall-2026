package interview;

import org.junit.jupiter.api.Test;

public class OfficeSupplierTest {
     
    public void testOfficeShredder() {
        assert OfficeSupplier.shredFirstCharacter("Michael").equals("ichael");
        assert OfficeSupplier.shredFirstCharacter("Pam").equals("am");

        assert OfficeSupplier.shredLastCharacter("Dwight").equals("Dwigh");
        assert OfficeSupplier.shredLastCharacter("Jim").equals("Ji");
    }

    @Test
    public void testOfficeStapler() {
        assert OfficeSupplier.stapleToBeginning("ngela", 'A').equals("Angela");
        assert OfficeSupplier.stapleToBeginning("tanley", 'S').equals("Stanley");

        assert OfficeSupplier.stapleToEnd("Kell", 'y').equals("Kelly");
        assert OfficeSupplier.stapleToEnd("Meredit", 'h').equals("Meredith");
    }


public static String shredFirstCharacter(String s) {
    return s.substring(1);
}
public static String shredLastCharacter(String s) {
    int end = s.length() - 1;
        String result = s.substring(0, end);
        return result;
}
public static String stapleToBeginning(String s, char c) {
        return c + s;
}
public static String stapleToEnd(String s, char c) {
    return s + c;
}
}