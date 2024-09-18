import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scan.nextInt();

        int frist = 0, second = 1;

        System.out.print(frist + " , " + second + " , ");
        int temp;

        for (int i = 2; i < number; i++) {
            temp = frist + second;
            frist = second;
            second = temp;

            System.out.print(temp + " , ");
        }
    }
}
