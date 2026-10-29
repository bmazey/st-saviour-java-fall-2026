class Hello {
    public static void main(String[] args) {
        // A comment!
        System.out.println("new dawn, new day!");

        // "Resizing" arrays in Java.
        int[] numbers = new int[]{6, 7, 6, 7, 6, 7};
        // ex: [6, 7, 6, 7, 6, 7] -> [7, 7, 7]

        // General strategy ...
        // We need to count up the numbers of things that we want to remove.
        // We need to use that count to determine the size of the new array.
        // And then we need to copy all of the content we want into the new array.

        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 6) {
                count++;
            }
        }

        int[] result = new int[numbers.length - count];

        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 6) {
                result[position] = numbers[i];
                position++;
            }
        }

        // This is a loop for printing.
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}