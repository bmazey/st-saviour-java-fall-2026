class Hello {
    public static void main(String[] args) {
        // A comment!
        System.out.println("new dawn, new day!");

        int[] numbers = new int[]{33, 14, 66, 7, -4, 3, 103};

        int greatest = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > greatest) {
                greatest = numbers[i];
            }
        }

        System.out.println(greatest);
    }
}