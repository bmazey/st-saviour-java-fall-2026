package factor;

import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        int total = 0;
       for (int i = 0; i < numbers.length; i++) {
        total += numbers[i];
    } 
    return total;
}

        // TODO


    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number. Where in the array is the negative #?
    //      ex: [11, 13, -1, 0, 9] -> 2
   public static int findNegative(int[] numbers) {
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] < 0) {
            return i;
        }
    }
    return -1;
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.   --- INCOMPLETE
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {
        // use findgreatest
        // change variable to the new greatest number
        int greatest = numbers[0];
        int i = 0;
        while(i < numbers.length){
            if(numbers[i] > greatest) {
                greatest = numbers[i];
            }
            i++;
        }
        
        return greatest;
   
    }

    
    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]

    public static int[] remove(int[] numbers, int n) {
          int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == n) {
                count++;
            }
        }

        int[] result = new int[numbers.length - count];

        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] !=n) {
                result[position] = numbers[i];
                position++;
            }
        }

        // This is a loop for printing.
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
         return result;
    }


    // roundUp
    public static int[] roundUp(double[] doubles) {
        // 1. Create a new int array with the exact same length
        int[] roundedResult = new int[doubles.length];

        for (int i = 0; i < doubles.length; i++) {
            // 3. Add 0.5 and cast to int to automatically handle standard rounding for non-negatives
            roundedResult[i] = (int) (doubles[i] + 0.5);
        }

        return roundedResult;
    }

    /// evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {

        int evens = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
                evens++;
                // if the numbers are even add to the even count 
            }
        }

        int[] result = new int[evens];
        //make new array with only even numbers

        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0){
                result[position] = numbers[i]; 
                position++;
            }
        }

        return result;
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        int [] result = new int [numbers.length];
        // Answer is modulo -- modulo ten will always give me the lasr digit
        for(int i = 0; i < numbers.length; i++) {
            int digit = numbers[i] % 10;
            result[i] = digit;
        }

        return result;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {

        // TODO +5 Bonus
        // HINT: use Arrays.sort()

        return new int[0];
    }
}
