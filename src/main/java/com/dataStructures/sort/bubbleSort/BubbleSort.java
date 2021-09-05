package com.dataStructures.sort.bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {10, 14, 1, 4, 2, 19, 3};

        int[] arrSorted = bs.sort(arr);
        for (int value: arrSorted) {
            System.out.println(value);
        }

        System.out.println();

        arrSorted = bs.sortComplex(arr);
        for (int value: arrSorted) {
            System.out.println(value);
        }
    }

    public int[] sort(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("argument is null");
        }

        int[] arrClone = arr.clone();
        for(int i = 0; i < arrClone.length; i++){
            for(int j = 0; j < arrClone.length; j++){
                if(arrClone[i] < arrClone[j]) {
                    int tmp = arrClone[i];
                    arrClone[i] = arrClone[j];
                    arrClone[j] = tmp;
                }
            }
        }
        return arrClone;
    }

    public int[] sortComplex(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("argument is null");
        }

        int[] arrClone = arr.clone();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrClone.length - 1; i++){
                if (arrClone[i] > arrClone[i+1]) {
                    isSorted = false;
                    int tmp = arrClone[i];
                    arrClone[i] = arrClone[i+1];
                    arrClone[i+1] = tmp;
                }
            }
        }
        return arrClone;
    }
}
