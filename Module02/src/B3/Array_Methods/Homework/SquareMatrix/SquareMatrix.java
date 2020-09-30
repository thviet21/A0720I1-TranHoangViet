package B3.Array_Methods.Homework.SquareMatrix;

import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số hàng của ma trận: ");
        int row = scanner.nextInt();
        System.out.print("nhập số cột của ma trận: ");
        int col = scanner.nextInt();
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Nhập hàng thứ " + (i + 1));
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("phần tử thứ " + (j + 1) + ": ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("ma trận vừa nhập là: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    if (i == j){
                        sum += matrix[i][j];
                    }
            }
        }
        System.out.println("Tổng các giá trị nằm ở vị trí đường chéo chính matrix là: "+ sum);

    }
}
