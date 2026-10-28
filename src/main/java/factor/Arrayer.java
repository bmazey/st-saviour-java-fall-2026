package factor;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        int total = 0;                 // start accumulator
        for (int n : numbers) {       // each element
            total += n;                // read + add
        }
        return total;                  // final sum
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {   // classic index loop
            if (numbers[i] < 0) {                    // check for negative
                return i;                            // return its index immediately
            }
        }
        return -1;    // should never happen (safety net)
    }

    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) {
        int max = Integer.MIN_VALUE;   // smallest possible int ensures first compare wins
        for (int n : numbers) {        // scan all values
            if (n > max) {
                max = n;               // keep the biggest seen so far
            }
        }
        return max;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {
        ArrayList<Integer> list = new ArrayList<>();   // temporary mutable collection
        for (int value : numbers) {
            if (value != n) {           // keep everything that isn’t n
                list.add(value);
            }
        }
        // convert List<Integer> back to primitive int[]
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {
        int[] result = new int[doubles.length];
        for (int i = 0; i < doubles.length; i++) {
            double d = doubles[i];
            int rounded = (int) Math.floor(d);   // integer part
            if (d - rounded >= 0.5) {            // decimal >= .5 ?
                rounded++;                        // round up
            }
            result[i] = rounded;
        }
        return result;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (int n : numbers) {
            if (n % 2 == 0) {        // modulo 2 == 0 → even
                evens.add(n);
            }
        }
        return evens.stream().mapToInt(Integer::intValue).toArray();
    }

    // lastOfFourDigits() accepts an array of four-digit integers and returns a new
    // array containing only the last digit of each number in the original sequence.
    //      ex: [1004, 1112, 5667, 8009] -> [4, 2, 7, 9]
    public static int[] lastOfFourDigits(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] % 10;   // %10 isolates the units digit
        }
        return result;
    }

    // merge() accepts two *pre-sorted* arrays of integers and returns a new *sorted* array.
    // WARNING do not assume arrays are of equal length!
    //      ex: [0, 2, 4, 8] + [1, 3, 5] -> [0, 1, 2, 3, 4, 5, 8]
    public static int[] merge(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;   // i → first, j → second, k → merged

        // walk through both arrays, copying the smaller element each time
        while (i < first.length && j < second.length) {
            if (first[i] <= second[j]) {
                merged[k++] = first[i++];
            } else {
                merged[k++] = second[j++];
            }
        }
        // one of the arrays may still have leftovers
        while (i < first.length) merged[k++] = first[i++];
        while (j < second.length) merged[k++] = second[j++];
        return merged;
    }
}
