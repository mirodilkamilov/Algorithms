package com.company;

public class InsertionSort {
    public static void insertionSort(double[] list) {
        double current;
        for (int i = 0; i < list.length; i++) {
            current = list[i];
            int j = i - 1;
            while (j >= 0 && current < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = current;
        }
    }
}
