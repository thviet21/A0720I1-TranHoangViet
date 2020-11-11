package _b14_algorithm_sort.homework.setup_insertion_sort;

import java.util.Arrays;

public class MyInsertionSort {

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k = i - 1;
            for (; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];

            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {3,5,9,7,1,2,4};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after used Insertion Sort: " + Arrays.toString(array));
    }
}

