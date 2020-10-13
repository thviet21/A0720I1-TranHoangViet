package _b3_array_methods.homework.count_char_in_string;

import java.util.Scanner;

public class CountCharInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Nhập vào chuỗi của bạn");
        string = scanner.nextLine().trim();
        System.out.println("Nhập vào kí tự muốn tìm trong chuỗi vừa nhập");
        char _char = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == _char){
                count++;
            }
        }
        System.out.println("Ký tự: " + _char + " xuất hiện: " + count + " trong chuỗi");
    }
}
