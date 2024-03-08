package com.spuzzolo98.exercises;

public class CopyArraySPZ {
    public static double[] copyArray(double[] src) {
        double[] dst = new double[src.length];
        System.arraycopy(src, 0, dst, 0, src.length);
        return dst;
    }
}
