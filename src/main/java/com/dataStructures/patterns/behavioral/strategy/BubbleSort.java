package com.dataStructures.patterns.behavioral.strategy;

import java.util.Arrays;

public class BubbleSort implements Sortable {

    @Override
    public void sort(int[] arr) {
        System.out.println("Bubble sort");
//        System.out.println("Before: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
//        System.out.println("After: " + Arrays.toString(arr));
    }
}
