package B3.Array_Methods.Homework.MinInArray;

import java.util.Scanner;

public class MinInArray {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Độ dài của mảng:");
        size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Phần tử thứ" + (i + 1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("Hiển thị mảng: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("Phần tử nhỏ nhất mảng là: " + min + " ,và nằm ở vị trí " + index);
    }
}
