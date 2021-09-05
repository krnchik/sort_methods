package com.dataStructures.sort.choiceSort;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ChoiceSortTest {

    private static ChoiceSort cs;
    private static int[] data_10;
    private static int[] data_100;
    private static int[] data_1000;
    private static int[] data_10_000;
    private static int[] data_100_000;

    @BeforeClass
    public static void setClass() {
        cs = new ChoiceSort();
    }

    @Before
    public void generateData() {
        data_10 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10);
        data_100 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100);
        data_1000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 1000);
        data_10_000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 10_000);
        data_100_000 = getArray(Integer.MIN_VALUE, Integer.MAX_VALUE, 100_000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sort_null() {
        cs.sort(null);
    }

    @Test()
    public void sort_0_element() {
        int[] data = new int[0];
        assertThat(cs.sort(data)).isEqualTo(data);
    }

    @Test()
    public void sort_1_element() {
        int[] data = {1};
        assertThat(cs.sort(data)).isEqualTo(data);
    }

    @Test(timeout = 10_000)
    public void sort_10_elements() {
        int[] data = data_10;
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_100_elements() {
        int[] data = data_100;
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_1000_elements() {
        int[] data = data_1000;
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements() {
        int[] data = data_10_000;
        int[] dataClone = data.clone();
        Arrays.sort(data);
        assertThat(dataClone).isNotEqualTo(data);
        assertArrayEquals(data, cs.sort(dataClone));
    }

    @Test(timeout = 10_000)
    public void sort_100_000_elements() {
        int[] data = data_100_000;
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