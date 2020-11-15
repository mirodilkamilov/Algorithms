package com.company;

import java.util.Arrays;
import java.util.Scanner;

import static com.company.BubbleSort.bubbleSort;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeOfList;
        sizeOfList = input.nextInt();
        double[] list = new double[sizeOfList];

        for (int i = 0; i < sizeOfList; i++) {
            list[i] = input.nextDouble();
        }

//        selectionSort(list);
        bubbleSort(list);
        System.out.println(Arrays.toString(list));
    }
}
