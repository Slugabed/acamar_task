package cz.acamar.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayUtilTests {

    @Test
    void testReverse() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};

        ArrayUtil.reverse(input, 0, input.length);

        assertArrayEquals(expected, input);
    }

    @Test
    void testReverseArray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {4, 3, 2, 1};

        ArrayUtil.reverse(input, 0, input.length);

        assertArrayEquals(expected, input);
    }

    @Test
    void testReverseSubarray() {
        int[] input = {1, 2, 3, 4};
        int[] expected = {1, 3, 2, 4};

        ArrayUtil.reverse(input, 1, 2);

        assertArrayEquals(expected, input);
    }

    @Test
    void testReverseEmptyRange() {
        int[] input = {1, 2, 3, 4};
        int[] expected = Arrays.copyOf(input, input.length);

        ArrayUtil.reverse(input, 1, 0);

        assertArrayEquals(expected, input);
    }

    @Test
    void testReverseEmptyArray() {
        int[] input = {};

        ArrayUtil.reverse(input, 0, 0);
    }

    @Test
    void testSquareArray() {
        int[] input = {1, 2, 3, 4, -4, -3, -2, -1};
        int[] expected = Arrays.stream(input).map(v -> v * v).toArray();

        ArrayUtil.squareArray(input);

        assertArrayEquals(expected, input);
    }

    @Test
    void testSquareEmptyArray() {
        int[] input = {};

        ArrayUtil.squareArray(input);
    }


    @Test
    void testMergeSorted() {
        int[] input = {1, 2, 3, 4, -4, -3, -2, -1};
        int pivot = 4;
        int[] expected = Arrays.stream(input).sorted().toArray();

        assertArrayEquals(expected, ArrayUtil.mergeSorted(input, pivot));
    }

    @Test
    void testMergeSortedPivotIsAtTheBeginning() {
        int[] input = {1, 2, 3, 4};
        int pivot = 0;
        int[] expected = Arrays.stream(input).sorted().toArray();

        assertArrayEquals(expected, ArrayUtil.mergeSorted(input, pivot));
    }

    @Test
    void testMergeSortedPivotIsAtTheEnd() {
        int[] input = {1, 2, 3, 4};
        int pivot = 4;
        int[] expected = Arrays.stream(input).sorted().toArray();

        assertArrayEquals(expected, ArrayUtil.mergeSorted(input, pivot));
    }

    @Test
    void testMergeSortedEmptyArray() {
        int[] input = {};

        ArrayUtil.mergeSorted(input, 0);
    }
}
