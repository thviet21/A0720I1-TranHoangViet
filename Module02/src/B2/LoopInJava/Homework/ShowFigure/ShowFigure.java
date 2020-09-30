package B2.LoopInJava.Homework.ShowFigure;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ShowFigure {
    public ShowFigure() {
    }

    public static void main(String[] args) throws InputMismatchException {
        try {
            inPut_Output();
        }catch (Exception e){
            System.out.println("Vui lòng nhập vào số!");
            System.out.println("____________");
            inPut_Output();
        }

    }

    public static void showRectangle() {
        for (int i = 1; i <= 3; ++i) {
            for (int j = 1; j < 7; ++j) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }

    public static void squareTriangle() {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }

    public static void squareTriangle2() {
        for (int i = 1; i <= 5; ++i) {
            for (int j = 5; j >= i; --j) {
                System.out.print("* ");
            }

            System.out.println("");
        }

    }

    public static void isoscelesTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++)
                System.out.print(" ");/*in ra màn hình khoảng trắng đến vị trí thứ n-i */
            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*"); /*tiếp tục in ra màn hình * đến vị trí 2*i-1 */
            System.out.println(""); /* chuyển xuống hàng tiếp theo */
        }
    }
    public static void inPut_Output()  {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Nhập vào lựa chọn của bạn! ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showRectangle();
                System.out.println("__________________");
                inPut_Output();
                break;
            case 2:
                squareTriangle();
                System.out.println("---");
                squareTriangle2();
                System.out.println("__________________");
                inPut_Output();
                break;
            case 3:
                isoscelesTriangle();
                System.out.println("__________________");
                inPut_Output();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Vui lòng chỉ nhập vào số trong menu!");
                inPut_Output();
        }
    }
}
