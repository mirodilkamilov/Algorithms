package com.company;

public class SelectionSort {
    public static void selectionSort(double[] list) {
        int minIndex;
        for (int i = 0; i < list.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[minIndex] > list[j])
                    minIndex = j;
            }
            //swaps if minIndex is changed
            if (minIndex != i) {
                double temp = list[i];
                list[i] = list[minIndex];
                list[minIndex] = temp;
            }
        }
    }
}
