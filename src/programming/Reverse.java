package programming;

import java.util.Scanner;

public class Reverse {
    public static void  main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (n != 0) {
            System.out.println("Enter the array elements");
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

        }
        if (n != 0) {
            System.out.println("Array elements before reverse");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;


        }
        System.out.println();
        if (n != 0) {
            System.out.println("Array elements after reverse");
            for (i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
