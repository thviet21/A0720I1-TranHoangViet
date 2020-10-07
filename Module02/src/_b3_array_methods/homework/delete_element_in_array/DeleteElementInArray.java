package _b3.array_methods.homework.delete_element_in_array;

import java.util.Scanner;

public class DeleteElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 4, 7, 6, 9, 8, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số cần tìm: ");
        int value = scanner.nextInt();
        int del_index = findIndex(array, value);
        System.out.println(del_index);
        if (del_index == -1) {
            System.out.println("Không có số cần tìm trong mảng!");
        } else {
            for (int i = del_index; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            array[array.length-1] = 0;
            outputArray(array);
        }


    }

    public static int findIndex(int[] array, int x) {
        int i;
        for (i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void outputArray(int[] array) {
        System.out.println("Danh sách phần tử mảng: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + "." + array[i]+"\n");
        }
    }
}
