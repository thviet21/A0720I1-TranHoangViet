package B1.IntroductionJava.Homework.ChangeMoney;

import java.util.Scanner;

public class ChangeMoney {
    public static final double RATE = 23000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD: ");
        double usd = scanner.nextDouble();
        if (usd==0){
            System.out.println("Vui lòng nhập vào số tiền lớn hơn 0!");
        }else {
            double total = usd * RATE;
            System.out.println("Số tiền đổi được: "+total);
        }


    }
}
