package com.dataStructures.sort.countSort;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountSortTest {

    private static CountSort cs;

    @BeforeClass
    public static void setClass() {
        cs = new CountSort();
    }

    @Test(expected = IllegalArgumentException.class)
    public void sort_null() {
        cs.sort(null, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sort_elements_more_maxValue() {
        int[] data = {50, 30, 80, 99, 10};
        cs.sort(data, 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void sort_negative_numbers() {
        int[] data = {-50, -30, -80, -99, -10};
        cs.sort(data, 10);
    }

    @Test
    public void sort_extreme_values() {
        int[] data = {0, 9, 10};
        assertThat(cs.sort(data, 10)).isEqualTo(new int[]{0, 9, 10});
    }

    @Test()
    public void sort_0_element() {
        int[] data = new int[0];
        assertThat(cs.sort(data, 10)).isEqualTo(data);
    }

    @Test()
    public void sort_1_element() {
        int[] data = {1};
        assertThat(cs.sort(data, 10)).isEqualTo(data);
    }

    @Test(timeout = 10_000)
    public void sort_10_elements_100_max_value() {
        int maxValue = 100;
        int[] data = getArray(0, maxValue, 10);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_elements_100_max_value() {
        int maxValue = 100;
        int[] data = getArray(0, maxValue, 100);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1000_elements_100_max_value() {
        int maxValue = 100;
        int[] data = getArray(0, maxValue, 1000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements_100_max_value() {
        int maxValue = 100;
        int[] data = getArray(0, maxValue, 10_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_000_elements_100_max_value() {
        int maxValue = 100;
        int[] data = getArray(0, maxValue, 100_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1_000_000_elements_100_max_value() {
        int maxValue = 100;
        int[] data = getArray(0, maxValue, 1_000_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_000_elements_100_max_value() {
        int maxValue = 100;
        int[] data = getArray(0, maxValue, 10_000_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_elements_1000_max_value() {
        int maxValue = 1000;
        int[] data = getArray(0, maxValue, 10);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_elements_1000_max_value() {
        int maxValue = 1000;
        int[] data = getArray(0, maxValue, 100);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1000_elements_1000_max_value() {
        int maxValue = 1000;
        int[] data = getArray(0, maxValue, 1000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements_1000_max_value() {
        int maxValue = 1000;
        int[] data = getArray(0, maxValue, 10_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_000_elements_1000_max_value() {
        int maxValue = 1000;
        int[] data = getArray(0, maxValue, 100_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1_000_000_elements_1000_max_value() {
        int maxValue = 1000;
        int[] data = getArray(0, maxValue, 1_000_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_000_elements_1000_max_value() {
        int maxValue = 1000;
        int[] data = getArray(0, maxValue, 10_000_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_elements_10000_max_value() {
        int maxValue = 10000;
        int[] data = getArray(0, maxValue, 10);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_elements_10000_max_value() {
        int maxValue = 10000;
        int[] data = getArray(0, maxValue, 100);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1000_elements_10000_max_value() {
        int maxValue = 10000;
        int[] data = getArray(0, maxValue, 1000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_elements_10000_max_value() {
        int maxValue = 10000;
        int[] data = getArray(0, maxValue, 10_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_100_000_elements_10000_max_value() {
        int maxValue = 10000;
        int[] data = getArray(0, maxValue, 100_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_1_000_000_elements_10000_max_value() {
        int maxValue = 10000;
        int[] data = getArray(0, maxValue, 1_000_000);
        int[] sortData = cs.sort(data, maxValue);
        assertThat(sortData).isNotEqualTo(data)
                .isSorted();
    }

    @Test(timeout = 10_000)
    public void sort_10_000_000_elements_10000_max_value() {
        int maxValue = 10000;
        int[] data = getArray(0, maxValue, 10_000_000);
        int[] sortData = cs.sort(data, maxValue);
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