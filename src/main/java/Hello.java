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

        // Add the forth random letter to the password.
        r = random.nextInt(26);
        password += letters.charAt(r);

        // Add the fifth random letter to the password. 
        r = random.nextInt(26);
        password += letters.charAt(r);

        String digits = "0123456789";
        int t = random.nextInt(10);

        // Add first digit to the password
        password += digits.charAt(t);

        // Add second digit to the password
        t = random.nextInt(10);
        password += digits.charAt(t);

        // Add third digit to the password
        t = random.nextInt(10);
        password += digits.charAt(t);

        // Add forth digit to the password
        t = random.nextInt(10);
        password += digits.charAt(t);
//FIX LATTTER 
        String symbol = "!@#$%^&*";
        int s = random.nextInt(8);

        // Add first symbol to the password
        password += symbol.charAt(s);


        System.out.println(password);

    }
} 
