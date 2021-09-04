package com.dataStructures.sort.bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] arr = {10, 14, 1, 4, 2, 19, 3};
        int[] arrC = bs.sort(arr);
        for (int value: arrC) {
            System.out.println(value);
        }
        System.out.println();
        arrC = bs.sortComplex(arr);
        for (int value: arrC) {
            System.out.println(value);
        }
    }

    public int[] sort(int[] arr) {
        int[] arrCopy = arr.clone();
        for(int i = 0; i < arrCopy.length; i++){
            for(int j = 0; j < arrCopy.length; j++){
                if(arrCopy[i] < arrCopy[j]) {
                    int tmp = arrCopy[i];
                    arrCopy[i] = arrCopy[j];
                    arrCopy[j] = tmp;
                }
            }
        }
        return arrCopy;
    }

    public int[] sortComplex(int[] arr) {
        int[] arrCopy = arr.clone();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrCopy.length - 1; i++){
                if (arrCopy[i] > arrCopy[i+1]) {
                    isSorted = false;
                    int tmp = arrCopy[i];
                    arrCopy[i] = arrCopy[i+1];
                    arrCopy[i+1] = tmp;
                }
            }
        }
        return arrCopy;
    }
}
