package interview;

public class Hello {
    public static void main(String[] args) {
        // A comment!
        System.out.println("new dawn, new day!");

        String password = Password.generatePassword();

        int rounded = Estimator.round(2.6);

        System.out.println(rounded);

        System.out.println(password);
    }
}
