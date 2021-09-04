package com.dataStructures.sort.bubbleSort;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class BubbleSortTest {

    private static BubbleSort bs;

    @BeforeClass
    public static void setClass() {
        bs = new BubbleSort();
    }

    @Test(timeout = 10_000)
    public void sort_10_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, bs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_100_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, bs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_1000_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 1000);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, bs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10000);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, bs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sortComplex_10_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, bs.sortComplex(dataClone));
    }

    @Test(timeout = 10_000)
    public void sortComplex_100_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, bs.sortComplex(dataClone));
    }

    @Test(timeout = 10_000)
    public void sortComplex_1000_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 1000);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, bs.sortComplex(dataClone));
    }

    @Test(timeout = 10_000)
    public void sortComplex_10_000_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10000);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, bs.sortComplex(dataClone));
    }

    private int[] getArray(int min, int max, int length) {
        Random random = new Random();
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