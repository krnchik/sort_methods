package com.dataStructures.patterns.behavioral.strategy;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        int[] arr = generateArray(100000);
        SortManager manager = new SortManager();

        long currentTime = System.currentTimeMillis();
        manager.setSortable(new BubbleSort());
        manager.executeSort(arr.clone());
        System.out.println(System.currentTimeMillis() - currentTime);

        currentTime = System.currentTimeMillis();
        manager.setSortable(new ChoiceSort());
        manager.executeSort(arr.clone());
        System.out.println(System.currentTimeMillis() - currentTime);

        currentTime = System.currentTimeMillis();
        manager.setSortable(new QuickSort());
        manager.executeSort(arr.clone());
        System.out.println(System.currentTimeMillis() - currentTime);
    }

    private static int[] generateArray(int n) {
        Random random = new Random();
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt();
        }
        return result;
    }
}
