package com.dataStructures.patterns.behavioral.strategy;

public class SortManager {

    Sortable sortable;

    public void setSortable(Sortable sortable) {
        this.sortable = sortable;
    }

    public void executeSort(int[] arr) {
        sortable.sort(arr);
    }
}
