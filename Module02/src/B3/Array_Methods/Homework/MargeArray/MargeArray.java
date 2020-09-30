package B3.Array_Methods.Homework.MargeArray;

import java.util.Scanner;

public class MargeArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array1;
        System.out.print("Nhập số phần tử bạn muốn nhập vào mảng thứ nhất: ");
        int size_1 = scanner.nextInt();
        array1 = new int[size_1];
        for (int i = 0; i < array1.length; i++) {
            System.out.print("nhập giá trị phần tử thứ " + (i + 1) + ": ");
            array1[i] = scanner.nextInt();
        }
        int[] array2;
        System.out.print("Nhập số phần tử bạn muốn nhập vào mảng thứ 2: ");
        int size_2 = scanner.nextInt();
        array2 = new int[size_2];
        for (int i = 0; i < array2.length; i++) {
            System.out.print("nhập giá trị phần tử thứ " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }
        System.out.print("Mảng thứ nhất là: ");
        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i] + "  ");
        }
        System.out.println();
        System.out.print("Mảng thứ hai là: ");
        for (int i = 0; i < array2.length; i++) {

            System.out.print(array2[i] + "  ");
        }
        int[] arrSum;
        arrSum = new int[size_1 + size_2];
        for (int i = 0; i < arrSum.length; i++) {
            if (i < array1.length) {
                arrSum[i] = array1[i];
            } else {
                arrSum[i] = array2[i - array1.length];
            }
        }
        System.out.println();
        System.out.print("Mảng sau khi gộp là: ");
        for (int i = 0; i < arrSum.length; i++) {

            System.out.print(arrSum[i] + "  ");
        }
    }

}
