package com.dataStructures.sort.insertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort is = new InsertionSort();
        int[] arr = {90, 5, 10, 14, 1, 4, 2, 19, 3, 67, 18};
        int[] arrC = is.sort(arr);
        for (int value: arrC) {
            System.out.println(value);
        }
    }

    public int[] sort(int[] arr) {
        int[] arrCopy = arr.clone();
        for (int i = 1; i < arrCopy.length; i++) {
            int current = arrCopy[i];
            int j = i;
            while (j > 0 && arrCopy[j-1] > current) {
                arrCopy[j] = arrCopy[j-1];
                j--;
            }
            arrCopy[j] = current;
        }
        return arrCopy;
    }
}
