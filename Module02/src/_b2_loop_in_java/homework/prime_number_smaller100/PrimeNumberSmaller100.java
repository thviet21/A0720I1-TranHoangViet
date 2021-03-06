package _b2_loop_in_java.homework.prime_number_smaller100;

public class PrimeNumberSmaller100 {
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

    public static void main(String[] args) {
        int i = 2;
        System.out.println("Top prime 100: ");
        while (true) {
            if (checkPrime(i)) {
                if (i > 100){
                    break;
                }
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
