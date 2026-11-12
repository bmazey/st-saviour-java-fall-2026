package factor;

public class Arrayer {

    // summation() accepts an array of integers and returns the sum of all numbers within.
    //      ex: [0, 2, -1, 15] -> 16
    public static int summation(int[] numbers) {
        //  Loop goes over array to find value of each number. 
        int sum = 0; 
        for(int i = 0; i < numbers.length; i ++) {  
        // This adds each number from the array to create a sum. 
            sum += numbers[i];
        }

        return sum;
    }

    // findNegative() accepts an array of integers containing one negative number
    // and returns the *position* of the negative number. You may safely assume
    // the provided array contains only a single negative number.
    //      ex: [11, 13, -1, 0, 9] -> 2
    public static int findNegative(int[] numbers) {

        // Loop goes over array and if number is less than 0 (negative), its position implemented into result string
        for (int i = 0; i < numbers.length; i ++) {   
            if (numbers[i] < 0) {
                return i;
            }
        } 

        return -1;  
    }


    // findGreatest() accepts an array of integers and returns the greatest
    // number found within the array.
    //      ex: [11, 13, -1, 0, 9] -> 13
    public static int findGreatest(int[] numbers) { 

        // TODO    
        int greatest = numbers[0];
        //Loop goes over array to find greatest.
        for (int i = 0; i < numbers.length; i ++) {   
        //Greatest is found and made equivilent to i.
            if (numbers[i] > greatest) { 
                greatest = numbers[i];
            }
        }

        return greatest;
    }

    // remove() accepts an array of integers and an int n. The method removes *all instances*
    // of n from the provided array and returns a new array with no instances of n.
    //      ex: [0, 1, 1, 2, 2, 3], n = 2 -> [0, 1, 1, 3]
    public static int[] remove(int[] numbers, int n) {

        // TODO   

           int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == n) {
                count++;
            }
        }
        // Loop goes over array and when n is found, it is accounted for
        // New array is created only including numbers that are not removed.
        int[] result = new int[numbers.length - count];

        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] != n) {
                result[position] = numbers[i];
                position++;
            }
        }

        return result;
    }

    // roundUp() accepts an array of *non-negative* doubles and returns an array of
    // rounded integers. Doubles are rounded up when the decimal is >= 0.5.
    //      ex: [1.2, 3.5, 4.2, 0.0] -> [1, 4, 4, 0]
    public static int[] roundUp(double[] doubles) {

        // TODO 
        int[] rounded = new int[doubles.length]; 
        // Convert decimal numbers to whole number 
        for(int i = 0; i < doubles.length; i++) {
            double decimal = doubles[i] - (int)doubles[i]; 
            if (decimal >= 0.5) { 
        // Loop finds each number and either adds one if it needs to be rounded up or leaves it if it needs to be rounded down. 
                rounded[i] = (int)doubles[i] + 1; 
            } else {
                rounded[i] = (int)doubles[i];
            }
        }

        return rounded;
    }

    // evensOnly() accepts an array of integers and returns a new array containing
    // only the even numbers found in the provided array, in their original order.
    //      ex: [3, 4, 7, 8, 12] -> [4, 8, 12]
    public static int[] evensOnly(int[] numbers) {

        // Loop finds evens when a number is divisible by 2
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0) { 
                count++;
            }
        }
        // New array is created to implement only even numbers found
        int[] result = new int[numbers.length - count];

        int position = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) {
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

        int[] result =  new int[numbers.length];
        // TODO 
        for(int i = 0; i < numbers.length; i++) {
            // Last digit is left after modulo is used because it is in the ones place 
            result[i] = numbers[i] % 10; 
            // Loop goes over each number to retrieve the result after modulo and return it 

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
