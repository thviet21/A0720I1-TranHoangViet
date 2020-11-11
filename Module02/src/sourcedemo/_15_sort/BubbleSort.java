package _15_sort;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int array[]) {
        boolean isNotSort = true;
        int count = 0;
        for (int k = 1; k < array.length && isNotSort; k++) {
            count++;
            isNotSort = false;
            for (int i = 0; i < array.length - k; i++) {
                count++;
                if (array[i] > array[i + 1]) {
                    isNotSort = true;
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println("loop number: " + count);
    }

    public static void main(String[] args) {
        int[] myArray = {2, 9, 5, 4, 8, 1};
        int[] myArray2 = {1, 2, 3, 4, 5, 6};
        int[] myArray3 = {6, 6, 3, 4, 5, 7};
        System.out.println(Arrays.toString(myArray3));
        sort(myArray3);
        System.out.println(Arrays.toString(myArray3));
    }
}
