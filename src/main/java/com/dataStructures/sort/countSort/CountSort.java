package com.dataStructures.sort.countSort;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        CountSort cs = new CountSort();
        int[] arr = {24, 34, 84, 45, 13, 45, 68, 69, 41, 13, 47, 89};

        int[] arrSorted = cs.sort(arr, 100);
        for (int value: arrSorted) {
            System.out.println(value);
        }
    }

    public int[] sort(int[] arr, int maxValue) {
        int[] arrClone = arr.clone();

        int[] count = new int[maxValue];

        for (int k : arrClone) {
            count[k]++;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arrClone[arrayIndex] = i;
                arrayIndex++;
            }
        }

        return arrClone;
    }
}
