package com.spuzzolo98.exercises;

import com.spuzzolo98.exercises.CopyArraySPZ;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class copyArraySPZTest {
    @Test
    void copyArray() {
        assertArrayEquals(new double[]{1, 1, 1}, CopyArraySPZ.copyArray(new double[]{1, 1, 1}));
        assertArrayEquals(new double[]{5, 4, 3, 1}, CopyArraySPZ.copyArray(new double[]{5, 4, 3, 1}));
    }

}