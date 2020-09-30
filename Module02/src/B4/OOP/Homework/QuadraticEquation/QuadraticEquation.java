package B4.OOP.Homework.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public QuadraticEquation(int bienA, int bienB, int bienC) {
        this.bienA = bienA;
        this.bienB = bienB;
        this.bienC = bienC;
    }

    int bienA;
    int bienB;
    int bienC;

    public int getBienA() {
        return bienA;
    }

    public void setBienA(int bienA) {
        this.bienA = bienA;
    }

    public int getBienB() {
        return bienB;
    }

    public void setBienB(int bienB) {
        this.bienB = bienB;
    }

    public int getBienC() {
        return bienC;
    }

    public void setBienC(int bienC) {
        this.bienC = bienC;
    }

    public float getDiscriminant() {
        float delta = (bienB * bienB) - (4 * bienA * bienC);
        return delta;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bienA;
        int bienB;
        int bienC;
        do {
            System.out.println("Nhập vào a:");
            bienA = scanner.nextInt();
            if (bienA < 0){
                System.out.println("Vui lòng nhập a lớn hơn 0");
            }

        } while (bienA < 0);
        System.out.println("Nhập vào b:");
        bienB = scanner.nextInt();
        System.out.println("Nhập vào c:");
        bienC = scanner.nextInt();
        QuadraticEquation quadraticEquation = new QuadraticEquation(bienA, bienB, bienC);
        float delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta hiện tại là: " + delta);
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("Nghiệm thứ 1: " + (-bienB - Math.sqrt(delta)) / 2 * bienA);
            System.out.println("Nghiệm thứ 2: " + (-bienB + Math.sqrt(delta)) / 2 * bienA);
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép là: x1=x2=" + -bienB / 2 * bienA);
        } else System.out.println("Phương trình vô nghiệm");


    }
}
