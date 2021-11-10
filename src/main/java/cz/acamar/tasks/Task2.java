package cz.acamar.tasks;

import java.util.List;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        if (input == null) {
            return null;
        }

        int firstNonNegativeIndex = ArrayUtil.indexOfFirstNonNegative(input);

        ArrayUtil.squareArray(input);

        if (firstNonNegativeIndex == -1) {
            ArrayUtil.reverse(input, 0, input.length);
            return input;
        } else if (firstNonNegativeIndex == 0) {
            return input;
        } else {
            ArrayUtil.reverse(input, 0, firstNonNegativeIndex);
            return ArrayUtil.mergeSorted(input, firstNonNegativeIndex);
        }
    }


}
