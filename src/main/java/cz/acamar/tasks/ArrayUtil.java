package cz.acamar.tasks;

import java.util.Arrays;

public class ArrayUtil {
    private ArrayUtil() {
    }

    /**
     * Finds first non negative element in array
     *
     * @param input array where non negative element must be found
     * @return index of first non negative element
     */
    public static int indexOfFirstNonNegative(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] >= 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Sorts array in ascending order which consists of two already sorted in ascending order subarrays
     *
     * @param input array with sorted subarrays
     * @param pivot starting index of second sorted subarray
     * @return new sorted array consisting of the elements of the input array
     */
    public static int[] mergeSorted(int[] input, int pivot) {
        // if input consists of only one already sorted subarray than just return copy of it
        if (pivot == 0 || pivot == input.length) {
            return Arrays.copyOf(input, input.length);
        }

        if (pivot < 0 || pivot > input.length) {
            throw new IllegalArgumentException();
        }

        int[] result = new int[input.length];

        int resultIndex = 0;
        int i1 = 0;
        int i2 = pivot;

        while (i1 < pivot) {
            if (i2 == input.length) {
                result[resultIndex] = input[i1];
                i1++;
            } else if (input[i1] < input[i2]) {
                result[resultIndex] = input[i1];
                i1++;
            } else {
                result[resultIndex] = input[i2];
                i2++;
            }
            resultIndex++;
        }

        while (i2 < input.length) {
            result[resultIndex] = input[i2];
            i2++;
            resultIndex++;
        }

        return result;
    }

    /**
     * Square elements of array in-place
     *
     * @param input input array
     */
    public static void squareArray(int[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] *= input[i];
        }
    }

    /**
     * Reverse part of input array in-place
     *
     * @param input      array which part will be reversed
     * @param startIndex start index of range to be reversed
     * @param length     length of range to be reversed
     */
    public static void reverse(int[] input, int startIndex, int length) {
        if (input.length == 0) {
            return;
        }

        if (startIndex < 0 || startIndex >= input.length || length > input.length) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < length / 2; i++) {
            int temp = input[startIndex + i];
            input[startIndex + i] = input[startIndex + length - 1 - i];
            input[startIndex + length - 1 - i] = temp;
        }
    }
}
