package interview;

public class OfficeSupplier {

    /*
     * The shredFirstCharacter() method takes a String s and returns a new String.
     * The resulting String should not include the first character of the original.
     *   - ex: "xSt. Saviour" -> "St. Saviour"
     */
    public static String shredFirstCharacter(String s) {
        // TODO
        // HINT https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-
        //S is at place 1, and this method includes place 1 and rest of characters
        return s.substring(1);
    }

    /*
     * The shredLastCharacter() method takes a String s and returns a new String.
     * The resulting String should not include the last character of the original.
     *   - ex: "St. Saviourx" -> "St. Saviour"
     */
    public static String shredLastCharacter(String s) {
        // TODO
        // HINT https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-
        return s.substring(0, s.length() - 1); 
        //Starts at 0 and counts length but is exclusive for the last character.
    }

    /*
     * The stapleToBeginning() method takes a String s, a char c, and returns a new String.
     * The resulting String should have the character added to the front of the original
     *   - ex: "ey can I pull you for a chat?", 'H' -> "Hey can I pull you for a chat?"
     */
    public static String stapleToBeginning(String s, char c) {
        // TODO
        return c + s; 

        //This adds 'H' to beginning of string. 
    }

    /*
     * The stapleToEnd() method takes a String s, a char c, and returns a new String.
     * The resulting String should have the character added to the end of the original
     *   - ex: "Hey can I pull you for a cha?", 't' -> "Hey can I pull you for a chat?"
     */
    public static String stapleToEnd(String s, char c) {
        // TODO
        return s + c; 

        //This adds 't' to end of string. 
    }
}
