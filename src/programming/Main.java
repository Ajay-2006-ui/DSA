package programming;

import java.util.Scanner;

public class Main {

    public static boolean isPalindrome(int n) {

        String s = String.valueOf(n);   // convert int to String
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean result = isPalindrome(n);

        System.out.println("Is Palindrome? " + result);

        sc.close();
    }
}
