package com.company;

public class BubbleSort {
    public static void bubbleSort(double[] list) {
        boolean hasSwapped;

        do {
            hasSwapped = false;
            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    double bigger = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = bigger;

                    hasSwapped = true;
                }
            }
        } while (hasSwapped);
    }
}
