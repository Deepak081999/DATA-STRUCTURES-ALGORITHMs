import java.util.Scanner;

public class Primenumber {
    public static boolean isprime(int number) {
        if (number <= 1) {
            return false;

        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        System.out.println(number + " is prime: " + isprime(number));
    }
}
