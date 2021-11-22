package cz.acamar.tasks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task2Tests {

    private Task2 task2 = new Task2();

    @Test
    void test_case1() {
        int[] input = new int[]{-4, -1, 0, 3, 10};
        int[] expected = new int[]{0, 1, 9, 16, 100};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case2() {
        int[] input = new int[]{-7, -3, 2, 3, 11};
        int[] expected = new int[]{4, 9, 9, 49, 121};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case3() {
        int[] input = new int[]{2, 3, 11};
        int[] expected = Arrays.stream(Arrays.copyOf(input, input.length))
                .map(v -> v * v).toArray();

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case4() {
        int[] input = new int[]{-11, -10, -3};
        int[] expected = new int[]{9, 100, 121};

        assertArrayEquals(expected, task2.squaresOfSortedArray(input));
    }

    @Test
    void test_case5() {
        int[] input = new int[]{};

        task2.squaresOfSortedArray(input);
    }

    @Test
    void test_case6() {
        int[] input = new int[]{-1, -2, -3, 1, 2, 3};
        int[] originalInput = Arrays.copyOf(input, input.length);

        task2.squaresOfSortedArray(input);
        assertArrayEquals(input, originalInput, "The input array must remain the same");
    }
}
