package com.dataStructures.sort.choiceSort;

public class ChoiceSort {
    public static void main(String[] args) {
        int[] arr = {20 ,10, 14, 1, 4, 2, 19, 3, 70};
        int[] arrC = sort(arr);
        for (int value: arrC) {
            System.out.println(value);
        }
    }

    public static int[] sort(int[] arr) {
        int[] arrCopy = arr.clone();

        for (int i = 0; i < arrCopy.length; i++) {
            int min = arrCopy[i];
            int index = i;
            for (int j = i; j < arrCopy.length; j++){
                if (arrCopy[j] < min){
                    min = arrCopy[j];
                    index = j;
                }
            }
            int tmp = arrCopy[i];
            arrCopy[i] = min;
            arrCopy[index] = tmp;
        }
        return arrCopy;
    }
}
