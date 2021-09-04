package com.dataStructures.sort.choiceSort;

public class ChoiceSort {
    public static void main(String[] args) {
        ChoiceSort cs = new ChoiceSort();
        int[] arr = {20 ,10, 14, 1, 4, 2, 19, 3, 70};

        int[] arrSorted = cs.sort(arr);
        for (int value: arrSorted) {
            System.out.println(value);
        }
    }

    public int[] sort(int[] arr) {
        int[] arrClone = arr.clone();

        for (int i = 0; i < arrClone.length; i++) {
            int min = arrClone[i];
            int index = i;
            for (int j = i; j < arrClone.length; j++){
                if (arrClone[j] < min){
                    min = arrClone[j];
                    index = j;
                }
            }
            int tmp = arrClone[i];
            arrClone[i] = min;
            arrClone[index] = tmp;
        }
        return arrClone;
    }
}
