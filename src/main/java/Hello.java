import java.util.Random;

class Hello {
    public static void main(String[] args) {
        // A comment!
        Random random = new Random();

        String password = "";

        String letters = "abcdefghijklmnopqrstuvwxyz";

        int r = random.nextInt(26);

        //Add first random letter to the password
        password += letters.charAt(r);

        // Add the second random letter to the password
        r = random.nextInt(26);
        password += letters.charAt(r);

        // Add the third random letter to the password.
        r = random.nextInt(26);
        password += letters.charAt(r);

        String digits = "0123456789";

        System.out.println(password);

        // Example
        String unhappy = "unhappy".substring(2);

    }
} 
