package com.dataStructures.sort.merge;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortTest {

    private static MergeSort ms;
    private static int[] data_10;
    private static int[] data_100;
    private static int[] data_1000;
    private static int[] data_10_000;

    @BeforeClass
    public static void setClass() {
        ms = new MergeSort();
    }

    @Before
    public void generateData() {
        data_10 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10);
        data_100 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100);
        data_1000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 1000);
        data_10_000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10_000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sort_null() {
        ms.sort(null);
    }

    @Test()
    public void sort_0_element() {
        int[] data = new int[0];
        assertThat(ms.sort(data)).isEqualTo(data);
    }

    @Test()
    public void sort_1_element() {
        int[] data = {1};
        assertThat(ms.sort(data)).isEqualTo(data);
    }

    @Test(timeout = 10_000)
    public void sort_10_elements() {
        int[] data = data_10;
        int[] sortData = ms.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_elements() {
        int[] data = data_100;
        int[] sortData = ms.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1000_elements() {
        int[] data = data_1000;
        int[] sortData = ms.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements() {
        int[] data = data_10_000;
        int[] sortData = ms.sort(data);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
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