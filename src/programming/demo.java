package programming;

import java.util.Scanner;
public class demo {
        public static int solve(int n) {
            if (n <= 0) {
                System.out.println("number cannot be reversed");
            }
            int reverse = 0;
            while (n > 0) {
                int digit = n % 10;
                n /= 10;
                reverse = reverse * 10 + digit;
            }
            return reverse;
        }
    }

class show{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int result = demo.solve(n);
        System.out.println("the reverse of a number is :"+ result);


    }
}
