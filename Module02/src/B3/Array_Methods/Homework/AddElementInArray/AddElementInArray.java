package B3.Array_Methods.Homework.AddElementInArray;

import java.util.Scanner;

public class AddElementInArray {
    static int index;
    static int[] array;

    public static void main(String[] args) {

        input();

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }

    public static void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào N phần tử mảng: ");
        int lengthArray = scanner.nextInt();
        array = new int[lengthArray];
        System.out.println("Nhập giá trị cần chèn: ");
        int value = scanner.nextInt();
        do {
            System.out.println("Nhập vào vị trí muốn chén: ");
            index = scanner.nextInt();
            if (index < 0 || index > array.length) {
                System.out.println("Nhập vào vị trí >0 hoặc nhỏ hơn số phần tử bạn đã nhập vào khi nãy");
            } else {
                array[index - 1] = value;
            }
        } while (index < 0 || index >= array.length);
    }
}
