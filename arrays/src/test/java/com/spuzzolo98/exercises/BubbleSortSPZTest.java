package com.spuzzolo98.exercises;

import org.junit.jupiter.api.Test;
import com.spuzzolo98.exercises.BubbleSortSPZ;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortSPZTest {

    @Test
    public void bubbleSort() {
        int[] v1 = {6, 3, 4, 2};
        BubbleSortSPZ.bubbleSort(v1);
        assertArrayEquals(new int[]{2, 3, 4, 6}, v1);

        int[] v2 = {1, 0, 0, 0};
        BubbleSortSPZ.bubbleSort(v2);
        assertArrayEquals(new int[]{0, 0, 0, 1}, v2);

        assertArrayEquals(new int[]{2, 3, 4, 6}, BubbleSortSPZ.bubbleSortCopy(new int[]{6, 3, 4, 2}));
        assertArrayEquals(new int[]{0, 0, 0, 1}, BubbleSortSPZ.bubbleSortCopy(new int[]{1, 0, 0, 0}));
    }
}