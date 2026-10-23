import interview.Password;

class Hello {
    public static void main(String[] args) {
        // A comment!
        System.out.println("new dawn, new day!");

        String password = Password.generatePassword();

        System.out.println(password);
    }
}