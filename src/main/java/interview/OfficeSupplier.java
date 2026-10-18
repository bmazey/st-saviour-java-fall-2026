package interview;

public class OfficeSupplier {

    public static String shredFirstCharacter(String s) {
        return s.substring(1);
    }

    public static String shredLastCharacter(String s) {
        return s.substring(0, s.length() - 1);
    }

    public static String stapleToBeginning(String s, char c) {
        return c + s;
    }

    public static String stapleToEnd(String s, char c) {
        return s + c;
    }
}
