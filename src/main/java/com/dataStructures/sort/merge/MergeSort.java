package com.dataStructures.sort.merge;

public class MergeSort {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = {555,12, 47, 69, 2, 5, 71, 36, 57, 14};

        int[] arrSorted = ms.sort(arr);
        for (int value: arrSorted) {
            System.out.println(value);
        }
    }

    public int[] sort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("argument is null");
        }

        int[] arrClone = arr.clone();
        int[] tmp;
        int[] currentSrc = arrClone;
        int[] currentDest = new int[arrClone.length];

        int size = 1;
        while (size < arrClone.length) {
            for (int i = 0; i < arrClone.length; i += 2*size) {
                merge(currentSrc, i, currentSrc, i+size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size *= 2;

//            System.out.println(Arrays.toString(currentSrc));
        }
        return currentSrc;
    }

    private void merge(int[] src1, int src1Start,
    int[] src2, int src2Start, int[] dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }
}
