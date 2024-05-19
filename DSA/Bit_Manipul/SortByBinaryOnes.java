package DSA.Bit_Manipul;

import java.util.Arrays;
import java.util.Comparator;

public class SortByBinaryOnes {

    public static void sortByBinaryOnes(int[] arr) {
        // Custom comparator function
        Comparator<Integer> comparator = (a, b) -> {
            int countA = countOnes(a);
            int countB = countOnes(b);
            // Sort by number of 1's first
            if (countA != countB) {
                return countA - countB;
            } else {
                // If same number of 1's, sort by decimal value
                return a - b;
            }
        };
//        Arrays.sort(arr,comparator);
    }

    // Function to count the number of 1's in binary representation
    private static int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 0, 7, 15};
        sortByBinaryOnes(arr);
        System.out.println(Arrays.toString(arr)); // Output: [0, 1, 2, 8, 7, 15]
    }
}

