import java.util.Scanner;

public class Palindrome_String {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scan.nextLine();
        if (isPalindrome(input))
            System.out.println(input + " is a Palindrome");
        else
            System.out.println(input + " is not a Palindrome");
    }

    public static boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        str = str.toLowerCase().replaceAll("\\s+", "");
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
