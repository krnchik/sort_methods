package com.dataStructures.sort.insertion;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {90, 5, 10, 14, 1, 4, 2, 19, 3, 67, 18};

        int[] arrSorted = is.sort(arr);
        for (int value: arrSorted) {
            System.out.println(value);
        }
    }

    public int[] sort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("argument is null");
        }

        int[] arrClone = arr.clone();
        for (int i = 1; i < arrClone.length; i++) {
            int current = arrClone[i];
            int j = i;
            while (j > 0 && arrClone[j-1] > current) {
                arrClone[j] = arrClone[j-1];
                j--;
            }
            arrClone[j] = current;
        }
        return arrClone;
    }
}
