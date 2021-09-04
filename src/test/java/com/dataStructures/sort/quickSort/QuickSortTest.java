package com.dataStructures.sort.quickSort;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {

    private static QuickSort qs;
    private static int[] data_10;
    private static int[] data_100;
    private static int[] data_1000;
    private static int[] data_10_000;
    private static int[] data_100_000;
    private static int[] data_1_000_000;
    private static int[] data_10_000_000;
    private static int[] sortedData_10_000;

    @BeforeClass
    public static void setClass() {
        qs = new QuickSort();
    }

    @Before
    public void generateData() {
        data_10 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10);
        data_100 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100);
        data_1000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 1000);
        data_10_000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10_000);
        data_100_000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100_000);
        data_1_000_000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 1_000_000);
        data_10_000_000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10_000_000);
        sortedData_10_000 = getSortedArray(10_000);
    }

    @Test(timeout = 10_000)
    public void sort_10_elements() {
        int[] data = data_10;
        int[] sortData = qs.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_elements() {
        int[] data = data_100;
        int[] sortData = qs.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1000_elements() {
        int[] data = data_1000;
        int[] sortData = qs.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements() {
        int[] data = data_10_000;
        int[] sortData = qs.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_000_elements() {
        int[] data = data_100_000;
        int[] sortData = qs.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1_000_000_elements() {
        int[] data = data_1_000_000;
        int[] sortData = qs.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_000_elements() {
        int[] data = data_10_000_000;
        int[] sortData = qs.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements_worst_case() {
        int[] data = sortedData_10_000;
        int[] sortData = qs.sort(data);
        assertThat(sortData).isEqualTo(data)
                .isSorted();
    }

    private int[] getSortedArray(int length) {
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        return data;
    }

    private int[] getArray(int min, int max, int length) {
        int[] data = new int[length];
        for (int i = 0; i < data.length; i++) {
            data[i] = random(min, max);
        }
        return data;
    }

    private int random(int min, int max) {
        return min + (int) (Math.random() * max);
    }
}