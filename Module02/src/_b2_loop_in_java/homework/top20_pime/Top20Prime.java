package _b2_loop_in_java.homework.top20_pime;

public class Top20Prime {

    public static void main(String[] args) {
        int dem = 0; // dem tong so nguyen to
        int i = 2;
        System.out.println("Top 20: ");
        while (dem < 20) {
            if (checkPrime( i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }

    public static boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
