package _14_search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {

    public static int search(int[] array, int value) {
        int head = 0;
        int tail = array.length - 1;
        int mid = 0;

        while (head <= tail) {
            mid = (head + tail) / 2;
            if(value == array[mid]){
                return mid;
            } else if (value > array[mid]){
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(search(myArray, 6));

        List abc = new ArrayList<>();
        ArrayList zz = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        scanner.skip("\n");
        scanner.next();
    }
}
