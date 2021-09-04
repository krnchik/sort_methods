package com.dataStructures.patterns.behavioral.strategy;

import java.util.Arrays;

public class ChoiceSort implements Sortable{

    @Override
    public void sort(int[] arr) {
        System.out.println("Choice sort");
//        System.out.println("Before: " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int index = i;
            for (int j = i; j < arr.length; j++){
                if (arr[j] < min){
                    min = arr[j];
                    index = j;
                }
            }
            int tmp = arr[i];
            arr[i] = min;
            arr[index] = tmp;
        }
//        System.out.println("After: " + Arrays.toString(arr));
    }
}
