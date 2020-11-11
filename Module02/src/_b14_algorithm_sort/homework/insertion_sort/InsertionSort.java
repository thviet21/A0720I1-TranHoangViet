package _b14_algorithm_sort.homework.insertion_sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int []list){
        System.out.println("Processing...");
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k = i - 1;
            System.out.println("Current element: '" + list[i] + "' will be compare with: '"+ list[k] + "'");
            for(; k >=0 && list[k] > currentElement; k--){
                System.out.println("Having a element don't sorted:");
                System.out.println(list[k]);
                System.out.println(list[k+1]);
                System.out.println("2 element will be swap...");
                list[k+1] = list[k];
                System.out.println("--------------------");
            }
            list[k+1] = currentElement;

        }
    }

    public static void main(String[] args) {
        int[] array = {1,3,4,9,6,5,8};
        System.out.println("Array before: " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("Array after use InsetionSort: "+ Arrays.toString(array));
    }
}
