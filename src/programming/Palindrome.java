package programming;

import java.util.Scanner;

    public class Palindrome {
        public static boolean solve(int []arr, int n) {

            int k = 0;
            int m = n - 1;
            while (k < m) {
                if (arr[k] != arr[m]) {
                    return false;

                }
                k++;
                m--;
            }
            return true;

        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter n: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            if (n == 0|| n==1) {
                System.out.println("not possible to execute");
                return ;
            }

            System.out.println("Enter the array elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

            }
            boolean m=solve(arr,n);
                System.out.println("The array element is palindrome " +m);

                sc.close();

        }
    }























