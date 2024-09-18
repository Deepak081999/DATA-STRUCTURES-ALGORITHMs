import java.util.Scanner;

public class Primenumber1 {
    static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int frist_index, last_index;

        System.out.println("given a renge of prime number is frist:");
        frist_index = scan.nextInt();

        System.out.println("given a renge of prime number is last:");
        last_index = scan.nextInt();

        for (int i = frist_index; i <= last_index; i++)
            if (isPrime(i))
                System.out.print(i + " , ");
    }

}
