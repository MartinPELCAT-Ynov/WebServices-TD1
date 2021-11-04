package ex4;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter un mot ou une phrase");
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (isPalindrome(line)) {
                System.out.println("C'est un palindrome");
            } else {
                System.out.println("Ce n'est pas un palindrome");
            }
        }
    }

    public static boolean isPalindrome(String string) {
        String str = string.toLowerCase();
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
