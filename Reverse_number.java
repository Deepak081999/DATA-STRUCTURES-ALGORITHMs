import java.util.Scanner;

public class Reverse_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int reverse = 0, res;

        while (number != 0) {
            res = number % 10;
            reverse = reverse * 10 + res;
            number /= 10;
        }
        ;

        // output
        System.out.println("Reversed Number: " + reverse);
    }

}
