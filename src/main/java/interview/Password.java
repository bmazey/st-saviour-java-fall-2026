package interview;

import java.util.Random;

public class Password {

    /*
     * The generatePassword() method accepts no arguments and returns a String with the following characteristics:
     *  - The first 5 characters are letters.
     *  - The next 4 characters are digits.
     *  - The final character is a symbol.
     *  - The length of the String is 10. 
     *  - It's relatively unlikely that two generated Strings are the same.
     */
    public static String generatePassword() {
        // TODO
        // HINT You will have to use a bounded random number generator for this method.
        // https://docs.oracle.com/javase/8/docs/api/java/util/Random.html#nextInt-int-

        // HINT Using the charAt() method is a great technique for pulling chars from a String.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#charAt-int-

        Random random = new Random(); 

        String password = ""; 

        String letters = "abcdefghijklmnopqrstuvwxyz";

        int r = random.nextInt(26);  
        //Add a random letter to form a password
        password += letters.charAt(r);  

         //Add the second random letter    
        r = random.nextInt(26);  
        password += letters.charAt(r);   

        //Add the third random letter   
        r = random.nextInt(26);  
        password += letters.charAt(r);   
        
        //Add the fourth random letter   
        r = random.nextInt(26);  
        password += letters.charAt(r); 

        //Add the fifth random letter   
        r = random.nextInt(26);  
        password += letters.charAt(r);

        String digits = "0123456789";  
 
        //Add a random digit to form a password 
        int d = random.nextInt(10);
        password += digits.charAt(d);   

        //Add a second random digit to form a password 
        d = random.nextInt(10);
        password += digits.charAt(d);   

        //Add a third random digit to form a password 
        d = random.nextInt(10);
        password += digits.charAt(d);  

        //Add a fourth random digit to form a password 
        d = random.nextInt(10);
        password += digits.charAt(d);   

        String symbols = "~!@$%^&*()";    
 
        //Add a random character to form a password 
        int c = random.nextInt(10);
        password += symbols.charAt(c);  
        //Five random letters, four random digits, and one random symbol are chosen and appended each time to form a password. 
        return password;  


    }
}
