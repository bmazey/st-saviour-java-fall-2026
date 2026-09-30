class Hello {
    public static void main(String[] args) {
        // A comment!
        int price = 77;

        if (price % 7 == 0 && price % 11 == 0) {
            System.out.println("seveneleven") ;
        } else if (price % 7 == 0) {
            System.out.println("seven");
        } else if (price % 11 == 0) {
            System.out.println("eleven");
        } else {
            System.out.println("");
        }

    }
} 
