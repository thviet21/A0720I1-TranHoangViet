package B1.IntroductionJava.BaiTap.ChangeMoney;

import java.util.Scanner;

public class ChangeMoney {
    public static final double rate = 23000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD: ");
        double uSD = scanner.nextDouble();
        if (uSD==0){
            System.out.println("Vui lòng nhập vào số tiền lớn hơn 0!");
        }else {
            double total = uSD * rate;
            System.out.println("Số tiền đổi được: "+total);
        }


    }
}
