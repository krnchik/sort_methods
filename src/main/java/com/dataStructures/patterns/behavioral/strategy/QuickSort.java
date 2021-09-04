package com.dataStructures.patterns.behavioral.strategy;

import java.util.Arrays;

public class QuickSort implements Sortable{

    @Override
    public void sort(int[] arr) {
        System.out.println("Quick sort");
//        System.out.println("Before: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
//        System.out.println("After: " + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);
            quickSort(arr, from, divideIndex - 1);
            quickSort(arr, divideIndex, to);
        }
    }

    public int partition(int[] arr, int from, int to) {
        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr[from];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] > pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] < pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    private void swap(int[] array, int index1, int index2) {
        int tmp  = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
