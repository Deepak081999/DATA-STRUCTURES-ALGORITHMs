import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int reverse = 0, res, temp = number;

        while (temp != 0) {
            res = temp % 10;
            reverse = reverse * 10 + res;
            temp /= 10;
        }
        if (number == reverse)
            System.out.println(number + " is Palindrome");
        else
            System.out.println(number + " is not Palindrome");

    }

}
