import java.util.Random;

class Hello {
    public static void main(String[] args) {
        // A comment!

        Random random = new Random();

        String letters = "abcdefghijklmnopqrstuvwxyz";

        int r = random.nextInt(26);

        System.out.println("Random r is: " + r);
        System.out.println("Random letter is: " + letters.charAt(r));
    }
}