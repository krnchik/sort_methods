package com.dataStructures.sort.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {555,12, 47, 69, 2, 5, 71, 36, 57, 14,
                79, 3, 9, 51, 797, 141, 261, 55, 13, 11};
        int[] arrCopy = sort(arr);
        for (int value: arrCopy) {
            System.out.println(value);
        }
    }

    public static int[] sort(int[] arr) {
        int[] arrCopy = arr.clone();
        int[] tmp;
        int[] currentSrc = arrCopy;
        int[] currentDest = new int[arrCopy.length];

        int size = 1;
        while (size < arrCopy.length) {
            for (int i = 0; i < arrCopy.length; i += 2*size) {
                merge(currentSrc, i, currentSrc, i+size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size *= 2;

            System.out.println(Arrays.toString(currentSrc));
        }
        return currentSrc;
    }

    public static void merge(int[] src1, int src1Start,
    int[] src2, int src2Start, int[] dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] > src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
}
