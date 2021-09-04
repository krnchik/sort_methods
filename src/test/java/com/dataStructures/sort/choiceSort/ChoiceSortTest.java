package com.dataStructures.sort.choiceSort;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ChoiceSortTest {

    private static ChoiceSort cs;

    @BeforeClass
    public static void setClass() {
        cs = new ChoiceSort();
    }

    @Test(timeout = 10_000)
    public void sort_10_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_100_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_1000_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 1000);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10000);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_100_000_elements() {
        int[] data = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100_000);
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
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