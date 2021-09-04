package com.dataStructures.sort.countSort;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {24, 34, 84, 45, 13, 45, 68, 69, 41, 13, 47, 89};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void countSort(int[] arr) {
        final int MAX_VALUE = 100;
        int[] count = new int[MAX_VALUE];

        for (int k : arr) {
            count[k]++;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[arrayIndex] = i;
                arrayIndex++;
            }
        }
    }
}
